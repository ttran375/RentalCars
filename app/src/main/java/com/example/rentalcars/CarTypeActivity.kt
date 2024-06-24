package com.example.rentalcars


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class CarTypeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_type)


        val coupeButton: Button = findViewById(R.id.coupeButton)
        val hatchbackButton: Button = findViewById(R.id.hatchbackButton)
        val sedanButton: Button = findViewById(R.id.sedanButton)
        val suvButton: Button = findViewById(R.id.suvButton)


        coupeButton.setOnClickListener { openCarList("Coupe") }
        hatchbackButton.setOnClickListener { openCarList("Hatchback") }
        sedanButton.setOnClickListener { openCarList("Sedan") }
        suvButton.setOnClickListener { openCarList("SUV") }
    }


    private fun openCarList(carType: String) {
        val intent = Intent(this, CarListActivity::class.java)
        intent.putExtra("CAR_TYPE", carType)
        startActivity(intent)
    }
}
