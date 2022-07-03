package com.masa.shapeablecomposeimageview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masa.shapeablecomposeimageview.ui.theme.ShapeableComposeImageviewTheme
import com.masa.shapeableimageview.ShapableImageView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShapeableComposeImageviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShapableImageView(image = painterResource(id = R.drawable.ic_launcher_foreground))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShapeableComposeImageviewTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Red
        ) {
            ShapableImageView(
                image = painterResource(id = R.drawable.ic_launcher_foreground),
                modifier = Modifier
                    .padding(20.dp)
                    .size(150.dp),
                backGroundColor = Color.Cyan,
                borderColor = Color.Black,
            )
        }
    }
}
