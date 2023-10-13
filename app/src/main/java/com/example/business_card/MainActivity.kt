package com.example.business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            Text(text = stringResource(R.string.my_name), fontSize = 40.sp, color = White)
            Text(text = stringResource(R.string.my_title), fontSize = 25.sp, color = Green)
            Spacer(modifier = Modifier.padding(bottom = 200.dp))
            Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
            Contacts(
                text = stringResource(R.string.my_phone_number),
                icon = Icons.Rounded.Phone
            )
            Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
            Contacts(
                text = stringResource(R.string.github), icon = Icons.Rounded.AccountCircle
            )
            Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
            Contacts(
                text = stringResource(R.string.my_email), icon = Icons.Rounded.Email
            )
        }
    }

    @Composable
    fun Contacts(
        text: String, icon: ImageVector, textBlur: Dp = 0.dp
    ) {
        Row(
            horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(16.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = White,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = text, color = White, modifier = Modifier
                    .weight(3f)
                    .blur(textBlur)
            )
        }
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