package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.BlueMine
import com.example.weatherapp.ui.theme.DarkPurple
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Weather()
            }
        }
    }


@Composable
fun Weather() {

    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .background(color = BlueMine),
    )
    {
        Column (
            modifier = Modifier
                .fillMaxHeight(.5f)
                .fillMaxWidth()
                .background(
                    shape = RoundedCornerShape(
                        topStart = 20.dp, topEnd = 20.dp
                    ),
                    color = Color.White
                ),
            horizontalAlignment = Alignment.CenterHorizontally

                ) {
            Text (text = "Weather News & Feed", fontSize = 30.sp)
            Text (text = "Rise and shine the rain is coming")
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(DarkPurple),
                shape = CircleShape
            ) {
               // Icon(imageVector = Icons.Default.Favorite , contentDescription = "yeah")
            }

        }

    }


}