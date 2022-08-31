# * Copyright 2022 Alessio DI DIO, Luigi LIQUORI, INRIA
# *
# * Licensed under the Apache License, Version 2.0 (the "License");
# * you may not use this file except in compliance with the License.
# * You may obtain a copy of the License at
# *
# *     http://www.apache.org/licenses/LICENSE-2.0
# *
# * Unless required by applicable law or agreed to in writing, software
# * distributed under the License is distributed on an "AS IS" BASIS,
# * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# * See the License for the specific language governing permissions and
# * limitations under the License.

from operator import methodcaller
from typing import Dict
from urllib import request

from lib import *
from ControlService import ControlserviceData, result, ControlServiceInfo, d, ControlServiceToPHA, \
    ControlToSMAPP, getAllData
from LocalService import LocalServiceData, LocalToControlService, LocalToDetectionNodeData
from DetectionNode import DetectionNodeData
from flask_ngrok import run_with_ngrok
from PHA import VirusDetection

api = Flask(__name__)
run_with_ngrok(api)
global last_dt

@api.route('/DetectionService', methods=['POST', 'GET'])
def DetectionService():
  if(request.method== 'POST'):
    some_json = request.get_json()
    print(some_json)
    LocalServiceData.update(some_json)
    print("Local "+str(LocalServiceData))
    data= some_json.copy()
    res_resp=DetectionNodeData(data)
    print("Val res: "+str(res_resp))
    #if(res_resp[1]=="201"):
   #     LocalService()
    return jsonify(LocalServiceData), 201
  else:
    return jsonify(LocalServiceData)

@api.route('/DetectionService/FromLSToDN', methods=['POST', 'GET'])
def DetectionServiceLSToDN():
    if (request.method == 'POST'):
        #global resp
        resp = request.get_json()
        print("DN RESP:"+str(resp))
        return jsonify(resp), 201
    else:
        resp = request.get_json()
        return jsonify(resp)

@api.route('/LocalService', methods=['POST', 'GET'])
def LocalService():
    global last_dt
    if(request.method== 'POST'):
        if request.content_type != 'application/vnd.onem2m-ntfy+json':
            data= request.get_json()
            return jsonify(data, "ERROR: Not FROM ICON" ), 201
        else:
            data = request.get_json()
            LocalServiceData.update(data)
            new_data= data.copy()
            resp=LocalToControlService(new_data)
            print("LocalToControl: "+str(resp))
           # last_dt=resp['m2m:cin']['con']['Disinfection_Time']
            return jsonify(LocalServiceData, 201 ), 201
    else:
        return jsonify(LocalServiceData)

@api.route('/LocalService/FromLSToDN', methods=['POST','GET'])
def LSToDN():
    if(request.method=='POST'):
        data=request.get_json()
        print(data)
        LocalToDetectionNodeData(data)
        return jsonify(data,201),201
    else:
        data = request.get_json()
        return jsonify(data,201),201

@api.route('/ControlService', methods=['POST', 'GET'])
def ControlService():
    if(request.method== 'POST'):
        if request.content_type != 'application/vnd.onem2m-ntfy+json':
            data= request.get_data()
            return jsonify(result), 201
        else:
            data = request.get_json()
            ControlServiceInfo.append(data)
            new_data= data.copy()
            #ControlserviceData(new_data)
            ControlServiceToPHA(new_data)
            return jsonify(ControlServiceInfo, 201 ), 201
    else:
        return jsonify(ControlServiceInfo, 201), 201

@api.route('/ControlService/SMAPP', methods=['POST', 'GET'])
def ControlServiceSMAPP():
    if(request.method== 'POST'):
        print(request.get_json())
        resp=request.get_json()
        if(resp["Location"]!=""):
            print("OK")
            result=ControlToSMAPP(resp["Location"])
        else:
            return jsonify(request.get_json(),"Invalid Geohash"), 201
    return result,200

@api.route('/ControlService/DAPP')
def ControlServiceToDAPP():
   if(request.method== 'GET'):
        return jsonify(getAllData()),200

#@api.route('/ControlService/DAPPF')
#def ControlServiceToDAPP():
   #if(request.method== 'GET'):
        #return jsonify(getAllDataF()),200

@api.route('/PHA', methods=['POST', 'GET'])
def ControlToPHA():
    global last_dt
    if(request.method== 'POST'):
        data=request.get_json()
        print(data)
        message= VirusDetection(data,last_dt)
        ControlserviceData(message[0])
        last_dt=message[1]
        print("Nuovo last: "+str(last_dt))
        return jsonify(ControlServiceInfo, 201 ), 201
    else:
        return jsonify(ControlServiceInfo, 201), 201
        

if __name__ == '__main__':
    api.config['ENV'] = 'development'
    api.config['DEBUG'] = True
    last_dt=datetime.now().isoformat()
    print("TEMPO: "+str(last_dt))
    #api.config['TESTING'] = True
    api.run()
    #api.run(host= 'localhost', port= '443' ,debug= True)