package com.example.lufer.income

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lufer.R
import com.example.lufer.databinding.ActivityIncomeBinding
import java.util.ArrayList

class IncomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityIncomeBinding
    private lateinit var incomeList :ArrayList<Incomes>
    private lateinit var adapter: IncomeRvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIncomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.incomeRv.setHasFixedSize(true)

        binding.incomeRv.layoutManager = LinearLayoutManager(this)

        val i1 = Incomes(1,"1")
        val i2 = Incomes(2,"2")

        incomeList =ArrayList<Incomes>()
        incomeList.add(i1)
        incomeList.add(i2)

        adapter = IncomeRvAdapter(this,incomeList)

        binding.incomeRv.adapter = adapter


    }
}