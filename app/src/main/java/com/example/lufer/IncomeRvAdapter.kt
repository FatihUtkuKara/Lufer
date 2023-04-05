package com.example.lufer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class IncomeRvAdapter(private val mContext:Context,private val incomeList:List<Incomes>) : RecyclerView.Adapter<IncomeRvAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View):RecyclerView.ViewHolder(view) {
        var incomeCardView: CardView
        var incomeTextCardView: TextView
        init {
            incomeCardView = view.findViewById(R.id.incomeCardView)
            incomeTextCardView = view.findViewById(R.id.incomeTextCardView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.card_design,parent,false)
        return  CardViewDesignObjectHolder(design)
    }

    override fun onBindViewHolder(holder: CardViewDesignObjectHolder, position: Int) {
        val income = incomeList[position]

        holder.incomeTextCardView.text = income.incomeName
    }

    override fun getItemCount(): Int {
                return incomeList.size
    }
}