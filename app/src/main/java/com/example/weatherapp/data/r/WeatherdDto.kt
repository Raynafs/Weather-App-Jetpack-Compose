package com.example.weatherapp.data.r

import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name="hourly")
    val weatherData: WeatherDataDto
)

