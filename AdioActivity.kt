package com.example.button

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class AdioActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            playAudio(this)
        }
    }

    @Composable
    private fun playAudio(HomeActivity: AdioActivity) {
        val mp: MediaPlayer = MediaPlayer.create(HomeActivity, R.raw.julukisa)


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
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.music_24),
                    contentDescription = "",
                    modifier = Modifier
                        .height(160.dp)
                        .width(160.dp)
                        .background(Color.Gray)
                )
                Row() {
                    IconButton(onClick = { mp.start() /*TODO*/ }, modifier = Modifier.size(65.dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.play_circle_24),
                            contentDescription = ""
                        )

                    }
                    IconButton(onClick = { mp.pause() /*TODO*/ }, modifier = Modifier.size(65.dp)) {
                        Icon(
                            painter = painterResource(id = R.drawable.pause_circle_24),
                            contentDescription = ""
                        )

                    }

                }

            }
        }
    }
}

