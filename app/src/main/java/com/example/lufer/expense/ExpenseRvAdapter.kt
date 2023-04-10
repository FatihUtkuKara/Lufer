package com.example.lufer.expense

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.lufer.R

class ExpenseRvAdapter(private val mContext: Context, private val expenseList:List<Expenses>) : RecyclerView.Adapter<ExpenseRvAdapter.CardViewDesignObjectHolder>() {

    inner class CardViewDesignObjectHolder(view: View): RecyclerView.ViewHolder(view) {
        var expenseCardView: CardView
        var expenseTextCardView: TextView
        init {
            expenseCardView = view.findViewById(R.id.expenseCardView)
            expenseTextCardView = view.findViewById(R.id.expenseTextCardView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesignObjectHolder {

        val design = LayoutInflater.from(mContext).inflate(R.layout.card_design,parent,false)
        return  CardViewDesignObjectHolder(design)
    }

    override fun onBindViewHolder(holder: CardViewDesignObjectHolder, position: Int) {
        val expense = expenseList[position]

        holder.expenseTextCardView.text = expense.expenseName
    }

    override fun getItemCount(): Int {
        return expenseList.size
    }
}