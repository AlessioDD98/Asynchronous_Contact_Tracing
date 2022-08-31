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


import collections
import json

from pygeohash import geohash
from lib import *
from randmac import RandMac
from random import randrange
from datetime import datetime, timedelta

# create database
cluster = pymongo.MongoClient("mongodb+srv://admin:admin@actdb.ve9u7.mongodb.net/?retryWrites=true&w=majority")
db = cluster["ACTDB"]
collection=db["Detections"]
#collection.drop()
#collist = db.list_collection_names()

d = {}
ControlServiceInfo= []
result = {}
headers= {'X-M2M-Origin': 'act_test_prod', 'X-M2M-RI': str(int(time.time())), 'Accept': 'application/json', 
'Content-Type': 'application/vnd.onem2m-res+json;ty=4'}



def random_date(start,l):
   current = start
   while l > 0:
      curr = current + timedelta(minutes=randrange(60))
      yield curr
      l-=1

def addEntry():
    BSSID = []
    n=10
    example_mac = "00:00:00:00:00:00"
    startDate = datetime(2022, 5, 6, 13, 00)
    endDate = datetime(2022, 6, 6, 14, 00)
    startTimes=[]
    endTimes=[]
    for x in random_date(startDate, n):
        r=x.strftime("%Y-%m-%dT%H:%M:%S.%f")
        print("TEMPO:" +r)
        r=datetime.fromisoformat(r)
        startTimes.append(datetime.strftime(r, "%Y-%m-%dT%H:%M:%S.%f"))
    for x in random_date(endDate, n):
        endTimes.append(datetime.strftime(x, "%Y-%m-%dT%H:%M:%S.%f"))
    for i in range(n):
        generated_bssid = RandMac(example_mac)
        BSSID.append(example_mac)
    for i in range(n):
        entry = {"Peripheral_Service_Id": str(BSSID[i]), "Location": "spv0sd", "Start": str(startTimes[i]),
                 "End": str(endTimes[i]), "Local_service_info": "https://NationalHealth.com/forecast",
                 "Control_service_info": "https://NationalHealth.com/forecast"}
        collection.insert_one(entry)



def ControlToSMAPP(location):
  #I return to the app all the red peripheral devices inside the area
  message="The area is infected, please get ASAP a PCR test or go to isolation"
  result={}
  first=True
  find=False
  i=0
  alreadySeen=[]
  #for x in collection.find():
  #    print("DB:" + str(x))
  for x in collection.find({"Location": location}):
      find=True
      if first:
          result= {"Replies":[{"Peripheral_Service_Id":str(x["Peripheral_Service_Id"]),"RED_Forecasts":{
            "Start":str(x["Start"]),"End":str(x["End"])},"Local_service_info":x["Local_service_info"],"Control_service_info":x["Control_service_info"]}],"Message":message}
          #FORSE DA LEVARE alreadySeen.append(str(x["Peripheral_Service_Id"]))
          first=False
      else:
          result["Replies"].append({"Peripheral_Service_Id":str(x["Peripheral_Service_Id"])})
          #Serve il for per aggiungere più red forecasts
         # if str(x["Peripheral_Service_Id"]) in alreadySeen:
          #    for x in result["Replies"]:
           #       print(str(x))
            #      if x["Peripheral_Service_Id"]==str(x["Peripheral_Service_Id"]):
             #         x["RED_Forecasts"].append({"Start":"X","End":"X"})
          #if(x["Replies"].)
          #else:
          result["Replies"][i]["RED_Forecasts"]={"Start":str(x["Start"]),"End":str(x["End"])}
          result["Replies"][i]["Local_service_info"]=x["Local_service_info"]
          result["Replies"][i]["Control_service_info"]=x["Control_service_info"]
          #result["Replies"][i]["RED_Forecasts"].append({"Start":str(x["Start"]),"End":str(x["End"]),"Local_service_info":x["Local_service_info"],"Control_service_info":x["Control_service_info"]})
          #result["Replies"].append(["RED_Forecasts"].append())
          result["Message"]=message
      i+=1

      print("Entry: "+str(x))
  if not find:
      result = {"Replies":[{}]}
  print("RES: " + str(result))
  return result

def ControlserviceData(message):
        print("Message: "+str(message))
       # x = message['m2m:sgn']['nev']['rep']['m2m:cin']['con']
        #location = x['Location']
#        y= x['DetectionNodeData']
        #data = {"location": x}
        #data1 = collection.insert_one(x)
        # if int(y['test_result']) <= 5:
        #   y=  {'forecast' : 'Green'}
         #  dict.update(y) 
        #else:
         #   z= {'forecast' : 'Green'}
          #  dict.update(z)
        #forecast_time = DateTimeRange("2021-03-22T10:00:00+0900", "2021-03-22T10:10:00+0900")
        message["Message"] = 'Message from National Health Service'
        #result.append(forecast_time)
        if(message["Forecast_Color"]=="Red"):
            entry={"Peripheral_Service_Id":message["Peripheral_Service_Id"],"Location":message["Location"],"Start":message["Frame"]["Start"],
                   "End":message["Frame"]["End"],"Local_service_info":message["Location_Service_Info"],"Control_service_info":"https://NationalHealth.com/forecast"}
            collection.insert_one(entry)
            for x in collection.find():
                print("DB:"+str(x))
        payload= {'m2m:cin': {'cnf': 'application/json:0', 'con': message}}
        new_payload= json.dumps(payload)
        write = requests.post(url= "https://icon-lab.tim.it/onem2m/act_test/ACT_ControlService", headers=headers, auth= HTTPBasicAuth('act_test', '@Test_99'), data=  new_payload)
        print(write.json())
        return write.json(),write.status_code   

def ControlServiceToPHA(message):
    print("Message: " + str(message))
    x = message['m2m:sgn']['nev']['rep']['m2m:cin']['con']
    header = {'content_Type': 'application/json'}
    print("Data: "+str(x))
    x=json.dumps(x)
    write = requests.post(url="http://84a6-46-193-67-245.ngrok.io/PHA", headers=header, data=x)
    print(write.status_code)
    return write.status_code


def getAllData():
    result={"result":[]}
    ele=collection.find_one({},{"_id":0})
    for x in collection.find({},{"_id":0}).sort("Start",pymongo.ASCENDING):
        entry={}
        for k in ele.keys():
            entry[k]=x[k]
        result["result"].append(entry)
    for l in result["result"]:
        print("RES: "+str(l))
    return result

#def getAllDataF():



    




        

