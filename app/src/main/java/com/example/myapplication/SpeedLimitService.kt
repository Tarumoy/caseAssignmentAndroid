package com.example.myapplication

// Service for handling speed limits
class SpeedLimitService {
    private val customerLimits = mutableMapOf<String, Int>()

    // Set speed limit for a customer
    fun setSpeedLimit(customerId: String, speedLimit: Int) {
        customerLimits[customerId] = speedLimit
        println("Speed limit for customer $customerId set to $speedLimit km/h")
    }

    // Get the speed limit for a customer
    fun getSpeedLimit(customerId: String): Int? {
        return customerLimits[customerId]
    }
}