package com.example.listadecompras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listadecompras.models.PurchaseItem
import kotlinx.android.synthetic.main.activity_buy.*

class BuyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)
    }

    override fun onStart() {
        super.onStart()

        val user = intent.extras?.getParcelable<PurchaseItem>("lista")!!
        textMain.text = getString(R.string.compra_concluida, user.title, user.price)
    }
    override fun onResume() {
        super.onResume()

        buttonReturn.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }
    }
}