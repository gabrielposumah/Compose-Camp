package com.example.pathway3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pathway3.ui.theme.Pathway3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pathway3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArticleApp()
                }
            }
        }
    }
}

//@Composable
//fun HappyBirthdayText(message : String, from : String) {
//    Column() {
//        Text(
//            text = message,
//            fontSize = 30.sp,
//            modifier = Modifier
//                .fillMaxWidth()
//                .wrapContentWidth(Alignment.CenterHorizontally)
//                .padding(start = 16.dp, end = 16.dp)
//        )
//        Text(
//            text = from,
//            fontSize = 26.sp,
//            modifier = Modifier
//                .fillMaxWidth()
//                .wrapContentWidth(Alignment.CenterHorizontally)
//                .padding(start = 16.dp, end = 16.dp)
//        )
//    }
//}
//
//@Composable
//fun HappyBirthdayImage() {
//    val image = painterResource(R.drawable.happybirthday)
//
//    Box() {
//        Image(
//            painter = image,
//            contentDescription = null,
//            modifier = Modifier
//                .fillMaxWidth()
//                .fillMaxHeight(),
//            contentScale = ContentScale.Crop
//        )
//        HappyBirthdayText(message = "Happy Birthday Adit ", from = "-from Gilby")
//    }
//}

//@Composable
//fun TaskCompleted() {
//    Column(
//        modifier = Modifier
//            .fillMaxHeight()
//            .fillMaxWidth(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        val image = painterResource(R.drawable.taskcompleted)
//        Image(painter = image, contentDescription = null)
//        Text(
//            text = "All task Completed",
//            fontWeight = FontWeight.Bold,
//            fontSize = 24.sp,
//            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
//        )
//        Text(text = "Nice Work!", fontSize = 16.sp)
//    }
//}

@Composable
fun ArticleApp(){
    AritcleCard(
        judul = "Jetpack Compose tutorial",
        shortDesc = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                "Compose simplifies and accelerates UI development on Android with less code, " +
                "powerful tools, and intuitive Kotlin APIs.",
        longDesc = "In this tutorial, you build a simple UI component with declarative functions. " +
                "You call Compose functions to say what elements you want and the Compose compiler " +
                "does the rest. Compose is built around Composable functions.",
        imagePainter = painterResource(R.drawable.article))
}

@Composable
fun AritcleCard(
    judul : String,
    shortDesc : String,
    longDesc : String,
    imagePainter : Painter,
){
    Column {
        Image(painter =imagePainter, contentDescription = null)
        Text(
            text = judul,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = shortDesc,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = longDesc,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

