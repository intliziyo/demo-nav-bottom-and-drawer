package com.example.demo_navigationbottom_and_drawer.drawer

import androidx.compose.ui.graphics.vector.ImageVector


/*

At this point HoodLab creates an enum class


 */
data class MenuItem(
    val title: String,
    val icon: ImageVector,
    val contentDescription: String
)
