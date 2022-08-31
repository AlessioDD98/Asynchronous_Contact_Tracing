package com.vrem.wifianalyzer.wifi.database

import androidx.room.*

@Dao
interface NetworkDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertNetwork(network: Network)

    @Update
    fun updateNetwork(network: Network)

    @Query("SELECT * FROM Network")
    fun getNetworks(): List<Network>

    @Query("SELECT * FROM Network WHERE BSSID LIKE:sBSSID AND TimeLost IS null")
    fun getFilteredNetworks(sBSSID:String) : List<Network>

    @Query("SELECT * FROM Network WHERE BSSID LIKE:sBSSID AND TimeFound IS NOT null AND TimeLost IS NOT null")
    fun getFilteredNetworksByBSSID(sBSSID:String) : List<Network>

    @Query("SELECT * FROM Network WHERE TimeLost IS null")
    fun getOpenNetworks() : List<Network>
}