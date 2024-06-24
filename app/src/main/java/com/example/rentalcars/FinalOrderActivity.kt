package com.example.rentalcars


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class FinalOrderActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_order)


        val fullNameEditText: EditText = findViewById(R.id.fullNameEditText)
        val cardNumberEditText: EditText = findViewById(R.id.cardNumberEditText)
        val submitButton: Button = findViewById(R.id.submitButton)


        submitButton.setOnClickListener {
            val fullName = fullNameEditText.text.toString()
            val cardNumber = cardNumberEditText.text.toString()


            if (fullName.isNotBlank() && cardNumber.isNotBlank()) {
                // Perform submission action
                Toast.makeText(this, "Order submitted successfully", Toast.LENGTH_SHORT).show()
            } else {
                if (fullName.isBlank()) {
                    fullNameEditText.error = "Full name is required"
                }
                if (cardNumber.isBlank()) {
                    cardNumberEditText.error = "Card number is required"
                }
            }
        }
    }
}
