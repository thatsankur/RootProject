package com.example.testcen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<EditTextViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EditTextViewHolder=
        EditTextViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.edit_text,null))


    override fun getItemCount(): Int = 100

    override fun onBindViewHolder(holder: EditTextViewHolder, position: Int) {

    }
}