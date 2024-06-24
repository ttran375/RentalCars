package com.example.rentalcars


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity


class PaymentActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        val proceedButton: Button = findViewById(R.id.proceedButton)
        val paymentMethodGroup: RadioGroup = findViewById(R.id.paymentMethodGroup)


        proceedButton.setOnClickListener {
            val selectedPaymentMethod = when (paymentMethodGroup.checkedRadioButtonId) {
                R.id.creditCardRadio -> "Credit Card"
                R.id.debitCardRadio -> "Debit Card"
                else -> null
            }


            if (selectedPaymentMethod != null) {
                val intent = Intent(this, FinalOrderActivity::class.java)
                intent.putExtra("PAYMENT_METHOD", selectedPaymentMethod)
                startActivity(intent)
            }
        }
    }
}
