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

from lib import *

LocalServiceData= {}
headers= {'X-M2M-Origin': 'act_test_prod', 'X-M2M-RI': str(int(time.time())), 'Accept': 'application/json', 
'Content-Type': 'application/vnd.onem2m-res+json;ty=4'}


def DetectionNodeData(message):
    payload={
      "m2m:cin": {
      "cnf": "application/json:0",
      "con": message
      }
    }
    print(payload)
    request= requests.post(url= "https://icon-lab.tim.it/onem2m/act_test/ACT_DetectionService", headers=headers, auth= HTTPBasicAuth('act_test', '@Test_99'),
      data=  json.dumps(payload))
    print(request.status_code)
    print(request.json())
    return request.json(), request.status_code


