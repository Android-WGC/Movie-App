package br.com.wgc.movieapp.core.presentation.navigation

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.wgc.movieapp.core.presentation.navigation.BottomNavItem.MovieFavorite
import br.com.wgc.movieapp.core.presentation.navigation.BottomNavItem.MoviePopular
import br.com.wgc.movieapp.core.presentation.navigation.BottomNavItem.MovieSearch
import br.com.wgc.movieapp.ui.theme.black
import br.com.wgc.movieapp.ui.theme.yellow

@Composable
fun BottomNavigationBar(
    navController: NavController,
) {
    val items = listOf(
        MoviePopular, MovieSearch, MovieFavorite,
    )
    NavigationBar(
        containerColor = black, contentColor = yellow,
        
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { destination ->
            NavigationBarItem(
                icon = {
                    Icon(imageVector = destination.icon, contentDescription = destination.title)
                },
                label = {
                    Text(text = destination.title)
                },
                selected = currentRoute == destination.route,
                onClick = {
                    navController.navigate(destination.route) {
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun BottomNavigationBarPreview2() {
    BottomNavigationBar(rememberNavController())
}