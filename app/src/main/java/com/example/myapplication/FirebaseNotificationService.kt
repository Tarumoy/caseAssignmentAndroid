package com.example.myapplication

// Firebase implementation of NotificationService
class FirebaseNotificationService :  NotificationService {
    override fun notifyRentalCompany(message: String) {
        // Placeholder: Simulate sending a notification to the rental company via Firebase
        println("Sending notification to rental company via Firebase: $message")
    }

    override fun sendCustomerWarning(customerId: String, message: String) {
        // Placeholder: Simulate sending a warning to the customer via Firebase
        println("Sending warning to customer $customerId via Firebase: $message")
    }
}