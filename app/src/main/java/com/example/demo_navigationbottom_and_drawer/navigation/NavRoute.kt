package com.example.demo_navigationbottom_and_drawer.navigation

/*

Research sealed classes. Are there other names for this type of class
to hande navigation route. eg Screen is what Stevdza-San uses.
Phil Lackner.
HoodLab

 */

sealed class NavRoute(val route: String){

    object Home: NavRoute(route = "home_screen")
    object Detail: NavRoute(route = "detail_screen")
}
