/*
 * WiFiAnalyzer
 * Copyright (C) 2015 - 2022 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.vrem.wifianalyzer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.vrem.wifianalyzer.wifi.database.NetworkDatabase

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        NetworkDatabase.get(application)
        deleteDatabase("NetworkDatabase")
        val sharedPreference =  getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        var editor = sharedPreference.edit()
        val normalButton=findViewById<Button>(R.id.normal)
        normalButton.setOnClickListener{
            editor.putString("mode","normal")
            editor.commit()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
        val actButton=findViewById<Button>(R.id.act)
        actButton.setOnClickListener {
            editor.putString("mode","act")
            editor.commit()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}
