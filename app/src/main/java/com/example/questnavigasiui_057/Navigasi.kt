package com.example.questnavigasiui_057

import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


enum class Navigasi {
    Formulirku,
    Detail
}


@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding(isiRuang)
