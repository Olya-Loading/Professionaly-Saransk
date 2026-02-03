package com.example.saransk.screen

import android.annotation.SuppressLint
import android.media.Image
import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.photopicker.compose.ExperimentalPhotoPickerComposeApi
import androidx.photopicker.compose.rememberEmbeddedPhotoPickerState
import com.example.saransk.R
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Purple
import com.example.saransk.ui.theme.SaranskTheme
import com.example.saransk.ui.theme.lightLightGrey
import kotlinx.coroutines.coroutineScope

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    navController: NavHostController = rememberNavController(), changeTheme:()->Unit
) {

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Column {
                    Image(
                        painter = painterResource(R.drawable.profile),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(top = 20.dp, start = 14.dp)
                            .size(134.dp)
                    )
                    Text(
                        "Your profile, Emil",
                        fontSize = 22.sp,
                        fontFamily = FredokaFamily,
                        color = Color.White,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                    )
                }

            },
            modifier = Modifier.height(231.dp),
            colors = TopAppBarDefaults.topAppBarColors(Purple)
        )
    }) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(400.dp))
            Button(
                colors = ButtonDefaults.buttonColors(Blue),
                onClick =  { changeTheme()},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier
                    .padding(top = 100.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Switch to Dark", fontSize = 21.sp) }
            Button(
                colors = ButtonDefaults.buttonColors(Blue),
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Change mother language", fontSize = 21.sp) }
            Button(
                colors = ButtonDefaults.buttonColors(Blue),
                onClick = {},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Change your image", fontSize = 21.sp) }
            Button(
                colors = ButtonDefaults.buttonColors(lightLightGrey),
                onClick = {navController.navigate(Destinations.MainScreen.route)},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Logout", fontSize = 21.sp) }
        }


    }
}

//@OptIn(ExperimentalPhotoPickerComposeApi::class)
//@RequiresExtension(extension = Build.VERSION_CODES.UPSIDE_DOWN_CAKE, version = 15)
//@Composable
//fun function(modifier: Modifier = Modifier) {
//    coroutineScope() = rememberCoroutineScope()
//    val pickerState = rememberEmbeddedPhotoPickerState()
//
//}




