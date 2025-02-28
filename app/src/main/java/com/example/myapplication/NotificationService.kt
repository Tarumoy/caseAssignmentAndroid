package com.example.myapplication

// Interface for speed notification
interface NotificationService {
    fun notifyRentalCompany(message: String)
    fun sendCustomerWarning(customerId: String, message: String)
}