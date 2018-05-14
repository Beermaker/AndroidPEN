package com.example.myapplication

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*
import android.app.Activity;
import android.app.Fragment
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem
import android.widget.TextView
import android.content.Intent
import android.preference.PreferenceManager;
import android.preference.SwitchPreference


abstract class MainActivity :  AppCompatActivity() {
//    var btnAdd: Button? = null

    var SwPr5: Boolean = false


    override fun onStart() {
        super.onStart()

        fun getPreferences() {
            val prefs = PreferenceManager
                    .getDefaultSharedPreferences(baseContext)
            SwPr5 = prefs.getBoolean("switch_5percglucose", false)
                  }}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = pageradapter(supportFragmentManager)
        val pager = findViewById<View>(R.id.pager) as ViewPager
        pager.adapter = adapter


       }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem ): Boolean {
        val id = item.getItemId()
        when (id) {
            R.id.action_settings -> {
                // Создаем объект Intent для вызова новой Activity
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent);
                return true
            }
            R.id.action_nutritions -> {
                val intent = Intent(this, Nutritions_Activity::class.java)
                startActivity(intent);
                return true
            }
            R.id.open_info -> {
                val intent = Intent(this, Info_Activity::class.java)
                startActivity(intent);
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}