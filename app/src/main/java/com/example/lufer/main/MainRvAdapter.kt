package com.example.lufer.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.lufer.R

class MainRvAdapter (private val mContext: Context,private val mainList:List<Main>) : RecyclerView.Adapter<MainRvAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var mainCardView: CardView
        var mainTextCardView: TextView
        init {
            mainCardView = view.findViewById(R.id.incomeCardView)
            mainTextCardView = view.findViewById(R.id.incomeTextCardView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.card_design,parent,false)
        return  CardViewDesignObjectHolder(design)
    }

    override fun onBindViewHolder(holder: CardViewDesignObjectHolder, position: Int) {
        val main = mainList[position]

        holder.mainTextCardView.text = main.incomeName
    }

    override fun getItemCount(): Int {
        return mainList.size
    }
}