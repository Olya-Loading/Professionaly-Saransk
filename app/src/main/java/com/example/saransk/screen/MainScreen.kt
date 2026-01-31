package com.example.saransk.screen


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.saransk.R
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Purple
import com.example.saransk.ui.theme.SaranskTheme
import com.example.saransk.ui.theme.lightGrey

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Scaffold(topBar = {
        TopAppBar(title = {
            Column() {
                //Image(painter = painterResource(R.))
                Icon(painter = painterResource(R.drawable.ic_rectangle_2), contentDescription = "", tint = Color.LightGray)
                Text(
                    "Hello, Emil",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = FredokaFamily,
                    color = Color.White
                )
                Text(
                    "Are you ready for learning today?",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Medium,
                    fontFamily = FredokaFamily,
                    color = lightGrey
                )
            }}, colors = TopAppBarDefaults.topAppBarColors(containerColor = Purple), modifier = Modifier.height(130.dp)
        )
    }) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Top user", fontFamily = FredokaFamily, fontSize = 20.sp, fontWeight = FontWeight.Medium)
            LazyColumn() {

            }
            Text(text = "Top user", fontFamily = FredokaFamily, fontSize = 20.sp, fontWeight = FontWeight.Medium)
            Card(R.drawable.painter, "Vincent van Gogh", "12 points")
        }
    }
}

@Preview
@Composable
private fun MainPrev() {
    SaranskTheme { MainScreen(modifier = Modifier) }
}

@Composable
fun Card(image: Int, text1: String, text2: String) {
    Row{
        Image(painter = painterResource(image), contentDescription = "", modifier = Modifier.size(60.dp))
    }
}

@Composable
fun CardButton(image: Int, text:String) {
    Column(modifier = Modifier.clip(RoundedCornerShape(20.dp))) {
        Image(painter = painterResource(image), contentDescription = "", modifier = Modifier.size(100.dp))
    }
}