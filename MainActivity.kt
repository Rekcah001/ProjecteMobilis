
package com.example.button
import android.content.Intent
import android.graphics.drawable.Icon
import android.graphics.drawable.PaintDrawable
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.button.ui.theme.ButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}
@Composable

fun Greeting() {

    val home = LocalContext.current


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),


        ) {

Image(
    painter = painterResource(id = R.drawable.pexel2),
    contentDescription = "", contentScale = ContentScale.FillHeight)

        Spacer(
            modifier = Modifier
                .height(40.dp))


        Column(
            modifier = Modifier
            .padding(25.dp, 100.dp, 40.dp,10.dp)) {


            Button(
                onClick = {
                    home.startActivity(Intent(home, AboutActivity2::class.java))
                },
                shape = RoundedCornerShape(70),
                modifier = Modifier
                    .clip(RectangleShape)
                    .fillMaxWidth()
                    .height(80.dp)
                    .border(3.dp, Color.Green, RoundedCornerShape(50)),


                ) {

                Text(
                    text = "Click Here!",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    color = Color.Black

                )


            }









        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting()


}



    
