package com.joao01sb.eventos.ui.uiState

data class LoginUiState(
    val login: String = "",
    val password: String = "",
    val onChangelogin: (String) -> Unit ={},
    val onChangePassword: (String) -> Unit = {}
)
