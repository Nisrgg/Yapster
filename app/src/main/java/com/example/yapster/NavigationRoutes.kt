package com.example.yapster

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen(val route: String) {
    data object Start : Screen("StartScreen")
    data object Chats : Screen("ChatsScreen")
    data object SignIn : Screen("SignInScreen")
}