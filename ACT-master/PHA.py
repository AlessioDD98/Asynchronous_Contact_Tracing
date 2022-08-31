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

from datetime import timedelta

from lib import *
#Creare campo forecast con dentro i campi forecast color e, se è red, frame con dentro start(disinfection time vecchio+1sec) ed end(disinfection time)

def VirusDetection(message,last_dt):
    last_dt=datetime.fromisoformat(last_dt)
    print("Vecchio Last: "+str(last_dt))
    last_dt += timedelta(seconds=1)
    print("virus: "+str(message))
    tr=message["Test_Result"]
    print("TR: "+str(tr))
    if tr > 5:
        message["Forecast_Color"]="Red"
        message["Frame"]={"Start":datetime.strftime(last_dt,"%Y-%m-%dT%H:%M:%S.%f"),"End":message["Disinfection_Time"]}
    else:
        message["Forecast_Color"] = "Green"
    print("Nuovo M: "+str(message))
    last_dt = message["Disinfection_Time"]
    return message, last_dt