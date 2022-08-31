package com.vrem.wifianalyzer.wifi.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.util.*

@Entity(primaryKeys = ["BSSID","TimeFound"])
data class Network (
    val SSID: String?,
   // @PrimaryKey
    val BSSID: String,
    val TimeFound: Date,
    val TimeLost: Date?
)