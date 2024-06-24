package com.example.rentalcars


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class CheckOutActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)


        val selectedCar = intent.getStringExtra("SELECTED_CAR")
        val selectedCarText: TextView = findViewById(R.id.selectedCarText)
        selectedCarText.text = "Selected Car: $selectedCar"


        val rentalDaysEditText: EditText = findViewById(R.id.rentalDaysEditText)
        val checkoutButton: Button = findViewById(R.id.checkoutButton)


        checkoutButton.setOnClickListener {
            val rentalDays = rentalDaysEditText.text.toString().toIntOrNull()
            if (rentalDays != null) {
                val intent = Intent(this, PaymentActivity::class.java)
                intent.putExtra("RENTAL_DAYS", rentalDays)
                intent.putExtra("SELECTED_CAR", selectedCar)
                startActivity(intent)
            } else {
                rentalDaysEditText.error = "Please enter a valid number of days"
            }
        }
    }
}
