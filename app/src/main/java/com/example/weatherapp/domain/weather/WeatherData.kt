package com.example.weatherapp.domain.weather

import java.time.LocalDateTime
// Easier because you only parse once in the mapper
data class WeatherData(
    val time : LocalDateTime,
    val temperatureCelsius : Double,
    val pressure:Double,
    val windSpeed: Double,
    val humidity:Double,
    val weatherType: WeatherType
)
