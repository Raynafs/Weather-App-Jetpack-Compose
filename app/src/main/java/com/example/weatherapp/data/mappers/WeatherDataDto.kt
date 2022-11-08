package com.example.weatherapp.data.mappers

import com.example.weatherapp.data.r.WeatherDataDto
import com.example.weatherapp.domain.weather.WeatherData
import com.example.weatherapp.domain.weather.WeatherType
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

//Map the number of the day to the list of weather datas
fun WeatherDataDto.toWeatherDataMap(): List<WeatherData> {
    return time.mapIndexed { index, time ->
        val temperature = temperatures[index]
        val weatherCode = weatherCodes[index]
        val windSpeed = windSpeeds[index]
        val pressure = pressures[index]
        val humidity = humidities[index]
        WeatherData(
            time= LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME),
            temperatureCelsius= temperature,
            windSpeed= windSpeed,
            pressure=pressure,
            humidity = humidity,
            weatherType = WeatherType.fromWMO(weatherCode)

        )
    }
}