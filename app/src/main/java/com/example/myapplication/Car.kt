package com.example.myapplication

// Class that simulates the car
class Car (val id: String, val customer: Customer, private val notificationService: NotificationService) {
    private var currentSpeed = 0
    private val speedLimitService = SpeedLimitService()

    // Start monitoring the car speed
    fun startMonitoring() {
        println("Started monitoring car ${this.id} for customer ${customer.id}")

        // Simulating speed updates
        var simulatedSpeed = 60 // Start with a speed of 60 km/h
        for (i in 1..10) { // Simulating 10 speed updates
            simulatedSpeed += 10 // Increment speed each time (to simulate speeding up)
            checkSpeed(simulatedSpeed)
        }
    }

    // Check if the current speed exceeds the allowed limit
    private fun checkSpeed(currentSpeed: Int) {
        val speedLimit = speedLimitService.getSpeedLimit(customer.id) ?: return
        this.currentSpeed = currentSpeed

        println("Current speed of car ${this.id}: $currentSpeed km/h")

        // Check if the speed exceeds the limit
        if (currentSpeed > speedLimit) {
            // Notify the rental company via Firebase (or AWS, depending on implementation)
            notificationService.notifyRentalCompany("Car ${this.id} exceeded speed limit of $speedLimit km/h")
            // Send a warning to the customer
            notificationService.sendCustomerWarning(customer.id, "You have exceeded the speed limit of $speedLimit km/h")
        }
    }
}