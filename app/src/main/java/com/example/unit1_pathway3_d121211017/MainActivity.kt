package com.example.unit1_pathway3_d121211017

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unit1_pathway3_d121211017.ui.theme.Unit1pathway3D121211017Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unit1pathway3D121211017Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xffd2e8d4))
    ) {
        MainContent(modifier = Modifier
            .fillMaxWidth()
            .weight(2.0f))
        Contact()
    }
}

@Composable
fun MainContent(modifier: Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(painter = painterResource(R.drawable.android_logo), contentDescription = null, modifier = Modifier
            .background(color = Color(0xff073042))
            .size(128.dp)
            .padding(12.dp)
        )
        Text("Fakhri Rasyad", fontSize = 50.sp, fontWeight = FontWeight.Light)
        Text("Android Developer Extraordinare",fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xff006f3c))
    }
}

@Composable
fun Contact(){
    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 24.dp)){
        Column() {
            ContactInfo(Icons.Rounded.Call, contactValue = "+11 (123) 444 555 666")
            ContactInfo(Icons.Rounded.Share, contactValue = "@AndroidDev")
            ContactInfo(Icons.Rounded.Email, contactValue = "jen.doe@android.com")
        }
    }
}

@Composable
fun ContactInfo(chooseIcon: ImageVector, contactValue: String){
    Row(modifier = Modifier.padding(16.dp)){
        Icon(chooseIcon, contentDescription = null, tint = Color(0xff006d3b), modifier = Modifier.padding(end = 16.dp))
        Text(contactValue)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Unit1pathway3D121211017Theme {
        BusinessCard()
    }
}