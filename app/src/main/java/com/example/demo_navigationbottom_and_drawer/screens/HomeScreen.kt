package com.example.demo_navigationbottom_and_drawer.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.compose.rememberNavController
import com.example.demo_navigationbottom_and_drawer.navigation.NavRoute

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {

        Text(
            modifier = Modifier.clickable {
                navController.navigate(route = NavRoute.Detail.route)
            },
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontSize = MaterialTheme.typography.h1.fontSize
        )

    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview (){
    HomeScreen(rememberNavController())
}