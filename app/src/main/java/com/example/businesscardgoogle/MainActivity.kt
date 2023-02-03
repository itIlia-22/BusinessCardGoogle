package com.example.businesscardgoogle

import android.os.Bundle
import android.telephony.UiccCardInfo
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardgoogle.ui.theme.BusinessCardGoogleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardGoogleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Red
                ) {
                    UserCardInfo()
                }
            }
        }
    }
}

@Composable
fun UserCardInfo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.ic_nezyko)
        Image(
            painter = image, contentDescription = null,
            modifier = Modifier.padding(
                top = 56.dp, start = 56.dp, end = 56.dp
            ),
            // contentScale = ContentScale.FillWidth
        )
        Text(
            text = "Nezyko",
            modifier = Modifier
                .padding(top = 8.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp


        )
        Text(
            text = "Demon"
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 32.dp, end = 16.dp),
            horizontalAlignment = Alignment.End,

            ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 56.dp), horizontalArrangement = Arrangement.End
            ) {
                val icon = painterResource(id = R.drawable.baseline_phone_24)
                Icon(
                    painter = icon, contentDescription = null,
                    tint = Color.Green,
                    modifier = Modifier.padding(end = 119.dp)
                )
                Text(

                    text = " 777-777-777",
                    modifier = Modifier
                        .padding(end = 24.dp)


                )

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 56.dp), horizontalArrangement = Arrangement.End
            ) {
                val icon = painterResource(id = R.drawable.baseline_email_24)
                Icon(
                    painter = icon, contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.padding(end = 96.dp)
                )
                Text(

                    text = "Nezyko@mail.ru",
                    modifier = Modifier
                        .padding(end = 24.dp)


                )

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 56.dp), horizontalArrangement = Arrangement.End
            ) {
                val icon = painterResource(id = R.drawable.sharp_info_24)
                Icon(
                    painter = icon, contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.padding(end = 105.dp)
                )
                Text(

                    text = "email@domian",
                    modifier = Modifier
                        .padding(end = 24.dp)


                )

            }
        }

    }


}

@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun DefaultPreview() {
    BusinessCardGoogleTheme {
        UserCardInfo()

    }
}