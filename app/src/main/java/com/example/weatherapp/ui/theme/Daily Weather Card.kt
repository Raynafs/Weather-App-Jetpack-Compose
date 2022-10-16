package com.example.weatherapp.ui.theme

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.R

data class DailyWeatherCard(

    @DrawableRes val Image: Int,
    val hour: String,
    val temperature: String

)
@Composable
fun DailyWeather(
    dailyForecast:DailyWeatherCard
) {
    Card(
        modifier = Modifier
            .wrapContentSize()
            .padding(16.dp),
        shape = RoundedCornerShape(20.dp),
        backgroundColor = Blue002

    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)
        )
        {
            Image(
                painterResource(id = R.drawable.rainsun), contentDescription = null,
                modifier = Modifier
                    .padding(4.dp)
                    .size(30.dp)
            )

            Text(text = dailyForecast.hour, fontSize = 15.sp)
            Text(text = dailyForecast.temperature, fontSize = 20.sp)

        }

    }
}

