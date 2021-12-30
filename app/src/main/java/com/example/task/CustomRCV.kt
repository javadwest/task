package com.example.task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomRCV(val Data:ArrayList<data>): RecyclerView.Adapter<CustomRCV.ViewHolder>() {
    class ViewHolder(IteamView: View):RecyclerView.ViewHolder(IteamView) {
        val text1: TextView
        val text2: TextView
        val text3: TextView

        init {

            text1 = IteamView.findViewById(R.id.textview1)
            text2 = IteamView.findViewById(R.id.textview2)
            text3 = IteamView.findViewById(R.id.textview3)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_recycleview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text1.setText( Data[position].name.toString())
        holder.text2.setText( Data[position].email.toString())
        holder.text3.setText( Data[position].Phone.toString())
    }

    override fun getItemCount(): Int = Data.size
}
data class data(var name:String,var email:String,var Phone:String )