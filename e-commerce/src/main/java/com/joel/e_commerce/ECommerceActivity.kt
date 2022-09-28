package com.joel.e_commerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.joel.e_commerce.ui.theme.JetPackComposeUIsTheme

class ECommerceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeUIsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Greeting("E Commerce App")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "$name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeUIsTheme {
        Greeting("Android")
    }
}