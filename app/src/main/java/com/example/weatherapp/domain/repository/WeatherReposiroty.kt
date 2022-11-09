package com.example.weatherapp.domain.repository

import com.example.weatherapp.domain.util.Resource
import com.example.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    //Helps us get the status of the weather
    suspend fun getWeatherData (lat: Double, long: Double ): Resource<WeatherInfo>
}