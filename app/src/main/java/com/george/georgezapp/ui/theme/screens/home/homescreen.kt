package com.george.georgezapp.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.george.georgezapp.R
import com.george.georgezapp.navigation.ROUTE_LOGIN
import com.george.georgezapp.navigation.ROUTE_REGISTER

@Composable
fun Home_Screen(navController: NavHostController) {
    //create a column
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top) {
        //put a text inside here
        Text("Welcome to George's App",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Red,
            fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.height(30.dp))
        Image(painter = painterResource(id = R.drawable.img),
            contentDescription = "Beautiful children",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp))
        Text("Enjoy the best coffee in town.",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Red,
            fontStyle = FontStyle.Italic)

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            modifier = Modifier.width(200.dp)) {
            Text(text = "Login",
                fontSize = 20.sp)


        }
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.width(200.dp)) {
            Text(text = "Register",
                fontSize = 20.sp)


        }



    }

}



//create a preview function
@Preview
@Composable
private fun HomePrev() {
    Home_Screen(rememberNavController())

}