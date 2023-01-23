package com.example.pequeno_explorador.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.pequeno_explorador.R

@Composable
fun WelcomeScreen(navController: NavHostController) {
}

@Composable
fun PagerScreen(onboardingPage: String) {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier,
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Pager"
        )
    }
}