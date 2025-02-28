package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Main function to simulate the use case
    fun main() {
        // Example of setting up the rental company system and using Firebase as the notification service
        val notificationService = FirebaseNotificationService()
        val rentalCompany = RentalCompany(notificationService)

        // Create customers
        val customer1 = Customer(id = "1", name = "John Doe", maxSpeed = 100)
        val customer2 = Customer(id = "2", name = "Jane Smith", maxSpeed = 80)

        // Set the speed limits for customers
        rentalCompany.setCustomerSpeedLimit(customer1.id, 100)
        rentalCompany.setCustomerSpeedLimit(customer2.id, 80)

        // Rent cars to customers
        rentalCompany.rentCarToCustomer(customer1)
        rentalCompany.rentCarToCustomer(customer2)
    }
}