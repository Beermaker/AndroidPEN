package com.example.myapplication
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*
import android.app.Activity;
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





class MainActivity :  AppCompatActivity() {
//    var btnAdd: Button? = null

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
                val intent = Intent(this, Settings_Activity::class.java)
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