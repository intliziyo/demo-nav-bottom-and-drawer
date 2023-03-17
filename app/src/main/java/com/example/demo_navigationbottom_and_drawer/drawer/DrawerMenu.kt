package com.example.demo_navigationbottom_and_drawer.drawer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerValue
import androidx.compose.material.ModalDrawer
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*

HeadLab uses ModalDrawer() PL does not.
 */

@Composable
fun DrawerMenu() {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalDrawer(
        drawerContent = {
             Header(modifier = Modifier.fillMaxWidth().padding(16.dp))
        },
        drawerState = drawerState
    ) {

    }
}