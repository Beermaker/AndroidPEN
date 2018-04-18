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

class Fragment1 : Fragment(), AdapterView.OnItemSelectedListener

{
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var spinner: Spinner? = null
    var nutritions = arrayOf("Выберите смесь", "Нан", "Пре Нан", "Грудное молоко", "Альфаре", "Симилак", "ПреНутрилон")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Adapter for spinner
        spinner_nutritions.adapter = ArrayAdapter(activity, android.R.layout.simple_spinner_dropdown_item, nutritions)

        //item selected listener for spinner
        spinner_nutritions.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

        }
    }
}
