package com.example.myapplication


import android.widget.*
import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment1.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*
import android.R.array
import com.example.myapplication.R.layout.fragment1
import kotlinx.android.synthetic.main.fragment2.*


class Fragment2 : Fragment(), AdapterView.OnItemSelectedListener

{
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var spinner: Spinner? = null
    var volumenutritions = arrayOf("Выберите схему ЭП", "Микроструйно, мл/час", "Дробно 8 раз, мл", "Дробно 12 раз, мл", "Дробно 6 раз, мл")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Adapter for spinner
        spinner_volumenutritions.adapter = ArrayAdapter(activity, android.R.layout.simple_spinner_dropdown_item, volumenutritions)

        //item selected listener for spinner
        spinner_volumenutritions.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

        }
    }
}