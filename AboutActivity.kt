package com.example.button

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Test1()
                }
            }
        }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Test1() {
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var retype by remember { mutableStateOf(TextFieldValue("")) }


    val create = LocalContext.current

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
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.person_4_24),
                contentDescription = "",
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)

            )






            TextField(
                value = username,
                leadingIcon = {
                    Icon(
                        Icons.Outlined.Person,
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = "Username",
                        fontStyle = FontStyle.Italic,
                        fontSize = 18.sp

                    )
                },


                modifier = Modifier
                    .border(
                        5.dp,
                        color = Color.Transparent
                    ),
                onValueChange = {
                    username = it
                }
            )
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            TextField(

                value = password,
                leadingIcon = {
                    Icon(
                        Icons.Outlined.KeyboardArrowRight,
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = "Password",
                        fontStyle = FontStyle.Italic,
                        fontSize = 18.sp
                    )
                },
                modifier = Modifier
                    .border(5.dp, color = Color.Transparent),
                onValueChange = {
                    password = it
                }
            )
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            TextField(
                value = retype,
                leadingIcon = {
                    Icon(
                        Icons.Outlined.KeyboardArrowRight,
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = "Re-type Password",
                        fontStyle = FontStyle.Italic,
                        fontSize = 18.sp
                    )
                },
                modifier = Modifier
                    .border(
                        5.dp,
                        color = Color.Transparent
                    ),
                onValueChange = {
                    retype = it
                }
            )

            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            Box(
                modifier = Modifier
                    .padding(60.dp, 0.dp, 40.dp, 0.dp)
            ) {

            }
            Button(
                onClick = {
                    create.startActivity(Intent(create, AccountCreationActivity2::class.java))
                },
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
            ) {

                Text(
                    text = "Create Account",
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )


            }
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )

            Button(

                onClick = {
                    create.startActivity(Intent(create, AdioActivity::class.java))
                },
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
            ) {

                Text(
                    text = "saba julukisa",
                    color = Color.Black,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp

                )


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Test1Preview() {
    Test1()

}





