package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }
                    if (shouldShowOnboarding) {
                        Weather( onContinueClicked = {shouldShowOnboarding = false} )
                    } else {
                        RealWeather()
                    }

            }
        }
    }


@Composable
fun Weather(onContinueClicked: () -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Purple200)
        )

    {
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.5f)
                .background(color = BlueMine),
        )
        {

            Column(
                modifier = Modifier
                    .fillMaxHeight(.5f)
                    .fillMaxWidth()
                    .background(
                        shape = RoundedCornerShape(
                            topStart = 30.dp, topEnd = 30.dp
                        ),
                        color = Color.White
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {

                Image(
                    painterResource(id = R.drawable.line),
                    contentDescription = "just a line", modifier = Modifier.size(50.dp)
                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(text = "Weather", fontSize = 30.sp)
                Text(text = "News & Feed", fontSize = 30.sp)

                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "Rise and shine the rain is coming!!")

                Spacer(modifier = Modifier.height(60.dp))

                Button(
                    modifier = Modifier.size(60.dp),
                    onClick = onContinueClicked,
                    colors = ButtonDefaults.buttonColors(DarkPurple),
                    shape = CircleShape,
                    elevation = ButtonDefaults.elevation(30.dp)
                ) {
                    Image(
                        painterResource(id = R.drawable.arrowright),
                        contentDescription = "navigate to the right",
                        modifier = Modifier.size(40.dp)
                    )
                }

            }

        }

Box(
    contentAlignment = Alignment.TopCenter
)
{
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.5f)
        )
        {
            val canvasHeight = size.height
            val canvasWidth = size.width

            drawCircle(
                color = (Blue002),
                center = Offset(x = canvasWidth / 2, y = canvasHeight / 3),
                radius = 200f,
                style = Stroke(width = 70f, cap = StrokeCap.Round)
            )
        }

        Image(painterResource(id = R.drawable.sunandflake), contentDescription = "Null")
    }

    }
}

@Composable
fun RealWeather()
{
    Surface {
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = BlueMine),
        )
        {

            Column(
                modifier = Modifier
                    .fillMaxHeight(.5f)
                    .fillMaxWidth()
                    .background(
                        shape = RoundedCornerShape(
                            topStart = 30.dp, topEnd = 30.dp
                        ),
                        color = Color.White,
                    ),
                verticalArrangement = Arrangement.Center

            ) {
                DailyWeather()
            }

        }

        Column(
            modifier = Modifier
                .fillMaxHeight(.5f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Image(painterResource(id = R.drawable.rainsun), modifier =Modifier.size(150.dp), contentDescription = "Null")
            Spacer(modifier = Modifier.height(30.dp))
            Text (text = "28.0", fontSize = 70.sp)

        }

        Row(
            modifier = Modifier
                .fillMaxHeight(.25f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End

        )

        {
            IconButton(onClick = { /*TODO*/ })
            {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = null)

            }
        }
        Column (
            modifier= Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {

            Row(
                modifier = Modifier
                    .fillMaxHeight(.2f)
                    .fillMaxWidth(.7f)
                    .absolutePadding()
                    .background(Blue002, shape = RoundedCornerShape(20.dp))
            )
            {

            }
        }
    }
}
@Composable
fun DailyWeather() {
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

            Text(text = "1:12", fontSize = 15.sp)
            Text(text = "29.5", fontSize = 20.sp)

        }
    }
}