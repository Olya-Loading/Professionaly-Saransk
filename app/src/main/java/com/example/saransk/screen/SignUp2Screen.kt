package com.example.saransk.screen

import android.R.attr.checked
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.saransk.R
import com.example.saransk.ui.theme.Blue
import com.example.saransk.ui.theme.FredokaFamily
import com.example.saransk.ui.theme.Purple
import com.example.saransk.ui.theme.SaranskTheme
import com.example.saransk.ui.theme.darkGrey

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp2Screen(modifier: Modifier = Modifier,navController : NavHostController = rememberNavController()) {
    Scaffold(topBar = {

        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(Purple),
            title = {
                Text(
                    modifier = Modifier.padding(start = 100.dp),
                    text = "Signup",
                    fontSize = 19.sp,
                    fontFamily = FredokaFamily,
                    fontWeight = FontWeight.Medium, color = Color.White
                )
            },
            navigationIcon = { Icon(painter = painterResource(R.drawable.icon_left), contentDescription = "", modifier = Modifier.padding(start = 30.dp).size(20.dp).clickable(onClick = { navController.popBackStack() }), tint = Color.White) })

    }) {innerPadding->
        Column(modifier = Modifier.fillMaxSize().padding(innerPadding), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Choose a Password",
                fontSize = 22.sp,
                fontFamily = FredokaFamily,
                fontWeight = FontWeight.Medium
                , modifier = Modifier.padding(top = 40.dp)
            )
            EditPasswordRegistration("Password")
            EditPasswordRegistration("Confirm Password")
            var checked by remember { mutableStateOf(false) }
            Row( modifier = Modifier.fillMaxWidth().padding(top = 10.dp, start = 22.dp).height(25.dp)) {
                Checkbox(
                checked = checked,
                onCheckedChange = { checked = it }, colors = CheckboxDefaults.colors(uncheckedColor = Blue, checkedColor = Blue)
            )
                Text("I ")
                Text("have made myself acquainted with ", color = Blue)

            }
            Row(modifier = Modifier.fillMaxWidth().padding(start = 34.dp)){
                Text("the Rules ", color = Blue)
                Text(" and accept all its provisions,")
            }



            Button(
                onClick = {navController.navigate(Destinations.ProfileScreen.route)},
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier.padding(top = 40.dp)
                    .width(327.dp)
                    .height(56.dp)
            ) { Text(text = "Signup", fontSize = 21.sp) }
            Row(modifier = Modifier.padding(top = 25.dp)) {
                Text(text = "Already you member? ", fontWeight = FontWeight.Medium, fontSize = 17.sp, color = darkGrey)
                Text(text = "Login",fontWeight = FontWeight.Medium, fontSize = 17.sp, color = Blue)
            }

        }
    }
}




@Preview
@Composable
private fun SignUp2() {
    SaranskTheme { SignUp2Screen(modifier = Modifier) }
}
