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

import json
from os import get_exec_path
from tkinter.constants import COMMAND

from pip._vendor.urllib3.util.url import get_host
from lib import *
from ControlService import ControlserviceData, result, ControlServiceInfo


LocalServiceData = {}
headers= {'X-M2M-Origin': 'act_test_prod', 'X-M2M-RI': str(int(time.time())), 'Accept': 'application/json', 
'Content-Type': 'application/vnd.onem2m-res+json;ty=4'}


def LocalToControlService(message):
    #x = message['m2m:sgn']['sur']
    #if(x!= "/onem2m/act_test/ACT_DetectionNode/DetectionNodeNotify"):
    x = message['m2m:sgn']['nev']['rep']['m2m:cin']['con']
    print("CHIAVI " +str(x.keys()))
    Disinfection= True
    Disinfection_Time= datetime.now().isoformat()
    geohash_code = pgh.encode(30, -6.9)
    dict= {'Location': geohash_code,'Disinfection': Disinfection, 'Disinfection_Time': Disinfection_Time,
           "Peripheral_Service_Id":x["Peripheral_Service_Id"],"Test_Result": x["Test_Result"],"Test_Time": x["Test_Time"], 'Location_Service_Info': 'https://NationalHealth.com/forecast'}
    payload= {'m2m:cin': {'cnf': 'application/json:0', 'con': dict}}
    new_payload= json.dumps(payload)
    write = requests.post(url= "https://icon-lab.tim.it/onem2m/act_test/ACT_LocalService", headers=headers, auth= HTTPBasicAuth('act_test', '@Test_99'), data=  new_payload)
    print(write.status_code)
    print("LTCS: "+str(write.json()))
    return write.json(), write.status_code

def LocalToDetectionNodeData(data):
    header= { 'content-Type':  'application/json'}
    data=json.dumps(data)
    res = requests.post(url = "http://c3fa-46-193-67-245.ngrok.io/DetectionService/FromLSToDN", headers = header , data = data)
    return res.status_code


    