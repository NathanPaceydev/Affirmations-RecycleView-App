package com.example.affirmations

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize dataset
        val myDataset = Datasource().loadAffirmations()

        //setup the recycler view
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        // fix the size of the view
        recyclerView.setHasFixedSize(true)

        //val textView: TextView = findViewById(R.id.textview) // find the textview
        //textView.text = Datasource().loadAffirmations().size.toString()
    }
}