package com.example.button

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    Homepage()
                }

        }
    }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Homepage() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),


        ) {

        Image(
            painter = painterResource(id = R.drawable.pexel2),
            contentDescription = "", contentScale = ContentScale.FillHeight
        )



        Column(
            modifier = Modifier
                .background(Color.Transparent)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier
                    .height(2.dp)
            )

            TopAppBar(
                title = {
                    Text(
                        text = "Menu", color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp

                        )
                },
                Modifier.background(Color.Gray),
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Menu, null,
                            tint = Color.White,
                            modifier = Modifier.size(100.dp)
                            )
                        }
                },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.Blue))
BottomAppBar(
) {
    Text(text = "Home", color = Color.Black, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Modifier.background(Color.Gray)

}

        }
    }
}

@Composable

@Preview(showBackground = true)
fun GreetingPreview2() {

        Homepage()
}