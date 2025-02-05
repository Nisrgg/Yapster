package com.example.yapster

data class SignInResult(
    val data: UserData?,
    val errorMessage: String?
)

data class UserData(
    val userId: String,
    val username: String,
    val ppurl: String?,
    val email: String
)