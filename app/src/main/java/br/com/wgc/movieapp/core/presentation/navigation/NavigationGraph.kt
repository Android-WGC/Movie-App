package br.com.wgc.movieapp.core.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(navController: NavHostController) {
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.MoviePopular.route,
        ){
            composable(BottomNavItem.MoviePopular.route){}
            composable(BottomNavItem.MovieFavorite.route){}
            composable(BottomNavItem.MovieSearch.route){}
        }
}