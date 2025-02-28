package com.example.myapplication

// Main Rental Company System
class RentalCompany (private val notificationService: NotificationService) {
    private val speedLimitService = SpeedLimitService()

    fun setCustomerSpeedLimit(customerId: String, speedLimit: Int) {
        speedLimitService.setSpeedLimit(customerId, speedLimit)
    }

    fun rentCarToCustomer(customer: Customer) {
        // Rent a car to the customer and monitor speed
        val car = Car(customer.id, customer, notificationService)
        car.startMonitoring()
    }
}