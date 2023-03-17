package com.example.demo_navigationbottom_and_drawer.drawer

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable

@Composable
fun AppBar(
    onNavigationItemClick: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = "Click here!")
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.onPrimary,
        navigationIcon = {
            IconButton(onClick = onNavigationItemClick) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Toggle drawer"
                )
            }
        }
    )
}
// text = stringResource(id = R.string.___)