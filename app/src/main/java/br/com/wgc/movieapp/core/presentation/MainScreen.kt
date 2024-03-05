package br.com.wgc.movieapp.core.presentation

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.wgc.movieapp.core.presentation.navigation.BottomNavigationBar
import br.com.wgc.movieapp.core.presentation.navigation.NavigationGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(
    navHostController: NavHostController,
) {
    Scaffold(
        content = {
            NavigationGraph(navController = navHostController)
        },
        bottomBar = {
            BottomNavigationBar(navController = navHostController)
        },
    )
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen(navHostController = rememberNavController())
}