package com.example.pequeno_explorador.screen

sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome_screen")
}