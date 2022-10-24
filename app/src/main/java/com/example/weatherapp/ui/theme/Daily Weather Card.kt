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

val dailyList = listOf(
    DailyWeatherCard(R.drawable.rainsun,"Mon","26.0"),
    DailyWeatherCard(R.drawable.rainsun,"Tue","27.0"),
    DailyWeatherCard(R.drawable.rainsun,"Wed","32.0"),
    DailyWeatherCard(R.drawable.rainsun,"Thur","15.0"),
    DailyWeatherCard(R.drawable.rainsun,"Fri","27.0"),
    DailyWeatherCard(R.drawable.rainsun,"Sat","14.0"),
    DailyWeatherCard(R.drawable.rainsun,"Sun","27.0"),

)

@Composable
fun DailyWeather(
    dailyCard: DailyWeatherCard
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
            Text(text = dailyCard.hour, fontSize = 15.sp)
            Text(text = dailyCard.temperature, fontSize = 25.sp)

        }

    }

}

