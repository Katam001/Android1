package com.example.calvin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.calvin.ui.theme.CalvinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting() {
   Column(

       modifier = Modifier
           .fillMaxSize()
           //.fillMaxWidth()
           //.fillMaxHeight()
           .background(color = Color.Gray)
   , verticalArrangement = Arrangement.Center
   , horizontalAlignment = Alignment.CenterHorizontally








   ) {

       Sliders()

       Spacer(modifier = Modifier
           .height(30.dp)

       )

       Text("Hello",
           color = Color.Blue,
           fontSize = 35.sp,
           fontFamily = FontFamily.Cursive,
           fontWeight = FontWeight.Thin,
           textDecoration = TextDecoration.Underline,
           letterSpacing = 0.5.em



       )
       Text("My name is Calvin")
       Text("Android Studio")

       Calvin()

   }
}
@Composable
fun Calvin(){
    Text(text = "copyright 2023")
}
@Composable
fun Sliders(){
    Text(text = "This is the slider area")
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalvinTheme() {
        Greeting()
    }


}