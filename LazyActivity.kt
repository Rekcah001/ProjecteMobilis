package com.example.button

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.button.ui.theme.ButtonTheme

data class DropDownItem(
    val text: String
)
class LazyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Laycol()
                }
            }
}

@Composable
fun Laycol() {

        val context = LocalContext.current
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(
                listOf(
                    "Surya",
                    "Morris",
                    "Shaw",
                    "Gill",
                    "Jane",
                    "Alex",
                    "Jake",
                    "Surya",
                    "Surya",
                )
            ) {
                PersonItem(
                    personName = it, dropdownItems = listOf(
                        DropDownItem("Edit"),
                        DropDownItem("Delete"),
                        DropDownItem("Share"),
                    ), onItemClick = {
                        Toast.makeText(context, it.text, Toast.LENGTH_LONG).show()
                    }, modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }

@Composable
fun PersonItem(personName: String,
               dropdownItems: List<DropDownItem>,
               modifier: Modifier = Modifier,
               onItemClick: (DropDownItem) -> Unit) {


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {

        Laycol()
}