package com.example.demo_navigationbottom_and_drawer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.demo_navigationbottom_and_drawer.screens.DetailScreen
import com.example.demo_navigationbottom_and_drawer.screens.HomeScreen


/*

Change name of composable NavGraph. As NavGraph is something else in androidx.
What is a more appropriate name. See what other coders call this class
and compare.

 */
@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Home.route
    ) {
        composable(
            route = NavRoute.Home.route
        ) {
            HomeScreen(navController = navController)
          //  navController.navigate("detail")
        }

        composable(
            route = NavRoute.Detail.route
        ) {
            DetailScreen(navController = navController)
     //       navController.popBackStack("home", inclusive = false)
        }

        
    }
}