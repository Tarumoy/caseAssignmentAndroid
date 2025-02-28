package com.example.myapplication

// AWS implementation of NotificationService (future integration)
class AwsNotificationService : NotificationService {
    override fun notifyRentalCompany(message: String) {
        // Placeholder: Simulate sending a notification to the rental company via AWS
        println("Sending notification to rental company via AWS: $message")
    }

    override fun sendCustomerWarning(customerId: String, message: String) {
        // Placeholder: Simulate sending a warning to the customer via AWS
        println("Sending warning to customer $customerId via AWS: $message")
    }
}