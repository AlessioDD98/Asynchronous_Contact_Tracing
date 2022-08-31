/*
 * Copyright 2022 Alessio DI DIO, Luigi LIQUORI, INRIA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

jQuery.datetimepicker.setLocale('en');
//SHOW AND HIDE FILTER
var from;
var to;
var filter=false;
$( "#datepickerFrom" ).datetimepicker();
$( "#datepickerTo" ).datetimepicker();
$("#divDatepickerFrom").hide();
$("#divDatepickerTo").hide();
$("#divButtonFilter").hide();
$("#timeFilter").change(function(){
   if($(this).is(':checked')){
        filter=true;
        $( "#divDatepickerFrom" ).show();
        $( "#divDatepickerTo" ).show();
        $("#divButtonFilter").show();
   }else{
        filter=false;
        $( "#divDatepickerFrom" ).hide();
        $( "#divDatepickerTo" ).hide();
        $("#divButtonFilter").hide();
   }
});

$("#datepickerFrom").datetimepicker(
  {
    onClose:function(e,$i){
        console.log("TEMPO: "+e);
        if(to<e){
            alert("Start date must be before End date");
            $("#datepickerFrom").datetimepicker("reset");
        }
        else{
          from=e;
        }
    }
  }
);

$("#datepickerTo").datetimepicker(
  {
    onClose:function(e,$i){
        console.log("TEMPO: "+e);
        if(e<from){
            alert("End date must be after Start date");
            $("#datepickerTo").datetimepicker("reset");
        }
        else{
          to=e;
        }
    }
  }
);




var map = L.map('map', {
    drawControl: false,
    center: [43.708096, 7.260838],
    zoom: 13
});

L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    maxZoom: 19,
    attribution: '© OpenStreetMap'
}).addTo(map);


DrawPolygon.addEventListener('click', function(e){
    map.pm.enableDraw('Polygon',{allowSelfIntersection: false});
});

