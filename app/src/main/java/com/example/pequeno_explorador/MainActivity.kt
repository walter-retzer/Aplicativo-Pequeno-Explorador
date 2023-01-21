package com.example.pequeno_explorador

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.pequeno_explorador.ui.theme.PequenoExploradorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PequenoExploradorTheme {
                // Navigation
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    AnimationSplashScreen()
                }
            }
        }
    }
}


@Composable
fun SetupNavGraph(navController: NavController) {
 //TODO:
}

@Composable
fun AnimationSplashScreen() {
    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.Url(
            url = stringResource(
                R.string.url_animation
            )
        )
    )
    LottieAnimation(composition = composition, iterations = LottieConstants.IterateForever)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PequenoExploradorTheme {
        AnimationSplashScreen()
    }
}
