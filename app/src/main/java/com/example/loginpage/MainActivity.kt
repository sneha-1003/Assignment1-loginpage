package com.example.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                simpleText()
                Spacer(modifier = Modifier.height(16.dp))
                simpleTextField()
                Spacer(modifier = Modifier.height(16.dp))
                simpleButton()
            }
        }
    }
}
@Composable
fun simpleText() {
    Text(
        text = "Login Screen",
        style = MaterialTheme.typography.headlineMedium,
        textAlign = TextAlign.Center
    )
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField() {
    var text1 by remember { mutableStateOf("") }
    TextField(
        value = text1,
        onValueChange = { it -> text1 = it },
        label = { Text(text = "User Name") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    )
    var text2 by remember { mutableStateOf("") }
    TextField(
        value = text2,
        onValueChange = { it -> text2 = it },
        label = { Text(text = "Password") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    )
}
@Composable
fun simpleButton() {
    Button(modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth(),
        onClick = { /* TODO */ }) {
        Text(text = "Login")
    }
}
@Preview
@Composable
fun simplePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        simpleText()
        Spacer(modifier = Modifier.height(16.dp))
        simpleTextField()
        Spacer(modifier = Modifier.height(16.dp))
        simpleButton()
    }
}
