package com.example.lufer.expense

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lufer.R
import com.example.lufer.databinding.ActivityExpenseBinding
import com.example.lufer.income.Incomes
import java.util.ArrayList

class ExpenseActivity : AppCompatActivity() {
    private lateinit var binding : ActivityExpenseBinding
    private lateinit var expenseList : ArrayList<Expenses>
    private lateinit var adapter: ExpenseRvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExpenseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.expenseRv.setHasFixedSize(true)

        binding.expenseRv.layoutManager = LinearLayoutManager(this)

        val i1 = Expenses(1,"1")
        val i2 = Expenses(2,"2")

        expenseList = ArrayList<Expenses>()
        expenseList.add(i1)
        expenseList.add(i2)

        adapter = ExpenseRvAdapter(this,expenseList)

        binding.expenseRv.adapter = adapter

    }
}