package com.vrem.wifianalyzer.wifi.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(version=1, entities = [Network::class])
@TypeConverters(DateConverter::class)
abstract class NetworkDatabase : RoomDatabase(){
    companion object{
        fun get(application: Application):NetworkDatabase{
            return Room.databaseBuilder(application,NetworkDatabase::class.java,"NetworkDatabase")
                .build()
        }
    }

    abstract fun getNetworkDao() : NetworkDao
}

