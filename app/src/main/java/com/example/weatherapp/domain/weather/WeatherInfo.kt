package com.example.weatherapp.domain.weather

data class WeatherInfo(
    //Map connects domain and api
    //Map the number of the day to the weather of that day
    val weatherDataPerDay : Map <Int, List<WeatherData>>,
    val currentWeather : WeatherData?
)
