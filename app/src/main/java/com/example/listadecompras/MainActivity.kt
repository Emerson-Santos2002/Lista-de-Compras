package com.example.listadecompras

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadecompras.models.PurchaseItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var purchaseItemAdapter: PurchaseItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initRecyclerView()
        addDataSource()
    }
    private fun addDataSource() {

        val dataSource = DataSource.createDataSet()
        this.purchaseItemAdapter.setList(dataSource)
    }

    private fun initRecyclerView() {

        this.purchaseItemAdapter = PurchaseItemAdapter { list ->
            openBuy(list)
        }

        recyclerview.apply{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = purchaseItemAdapter
        }

    }

    private fun openBuy(list: PurchaseItem) {

        startActivity(
            Intent(this, BuyActivity::class.java).apply {
                putExtra("lista", list)
            }
        )

    }
}