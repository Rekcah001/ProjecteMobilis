package com.example.button

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class AccountCreationActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Greeting2()
                }
            }
        }


@Composable
fun Greeting2(){


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),


        ) {

        Image(
            painter = painterResource(id = R.drawable.pexel2),
            contentDescription = "", contentScale = ContentScale.FillHeight
        )
    Text(
        text = "Hello"
    )
    }
}
