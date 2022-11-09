package com.example.weatherapp.domain.location

import android.location.Location

interface LocationTracker {
    // Location is nullable since we might not have permission of location
    suspend fun getCurrentLocation() : Location?
}