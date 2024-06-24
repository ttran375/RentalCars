package com.example.rentalcars


import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class CarListActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_list)


        val carType = intent.getStringExtra("CAR_TYPE")
        val carListView: ListView = findViewById(R.id.carListView)
        val carList = getCarList(carType)


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, carList)
        carListView.adapter = adapter


        carListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedCar = carList[position]
            val intent = Intent(this, CheckOutActivity::class.java)
            intent.putExtra("SELECTED_CAR", selectedCar)
            startActivity(intent)
        }
    }


    private fun getCarList(carType: String?): List<String> {
        return when (carType) {
            "Coupe" -> listOf("Coupe Car 1", "Coupe Car 2", "Coupe Car 3")
            "Hatchback" -> listOf("Hatchback Car 1", "Hatchback Car 2", "Hatchback Car 3")
            "Sedan" -> listOf("Sedan Car 1", "Sedan Car 2", "Sedan Car 3")
            "SUV" -> listOf("SUV Car 1", "SUV Car 2", "SUV Car 3")
            else -> emptyList()
        }
    }
}
