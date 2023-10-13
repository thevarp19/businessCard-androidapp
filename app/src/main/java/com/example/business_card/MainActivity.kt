package com.example.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.business_card.ui.theme.BusinesscardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color(0xFF073042)
                ) {
                    BusinessCard()
                }
            }
        }
    }

    @Composable
    fun BusinessCard() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val image = painterResource(R.drawable.my_logo)
            Image(
                painter = image, contentDescription = null, Modifier.fillMaxWidth(0.3f)
            )
        }
    }


    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        Surface(
            modifier = Modifier.fillMaxSize(), color = Color(0xFF073042)
        ) {
            BusinesscardTheme {
                BusinessCard()
            }
        }

    }
}