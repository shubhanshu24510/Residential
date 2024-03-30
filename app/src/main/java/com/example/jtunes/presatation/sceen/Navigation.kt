package com.example.jtunes.presatation.sceen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jtunes.presatation.browser.BrowserScreen
import com.example.jtunes.presatation.components.BottomBarScreen
import com.example.jtunes.presatation.home.HomeScreen
import com.example.jtunes.presatation.profile.ProfileScreen
import com.example.jtunes.presatation.search.SearchScreen

@Composable
fun Navigation(
    navController:NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(BottomBarScreen.Chat.route){
            SearchScreen()

        }
        composable(BottomBarScreen.Shop.route){
            BrowserScreen()
        }
        composable(BottomBarScreen.Profile.route){
            ProfileScreen()
        }

    }

}