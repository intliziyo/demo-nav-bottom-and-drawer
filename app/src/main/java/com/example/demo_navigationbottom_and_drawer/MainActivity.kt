package com.example.demo_navigationbottom_and_drawer

import android.annotation.SuppressLint
import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import androidx.navigation.compose.rememberNavController
import com.example.demo_navigationbottom_and_drawer.drawer.AppBar
import com.example.demo_navigationbottom_and_drawer.drawer.DrawerBody
import com.example.demo_navigationbottom_and_drawer.drawer.Header
import com.example.demo_navigationbottom_and_drawer.drawer.MenuItem
import com.example.demo_navigationbottom_and_drawer.navigation.BottomNavItem
import com.example.demo_navigationbottom_and_drawer.navigation.BottomNavigationBar
import com.example.demo_navigationbottom_and_drawer.navigation.NavGraph
import com.example.demo_navigationbottom_and_drawer.navigation.NavRoute
import com.example.demo_navigationbottom_and_drawer.ui.theme.Demo_NavigationBottom_and_DrawerTheme

import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    /*
     lateinit var navController: NavHostController
     Which is the best way to initialize nC
     */

    /*

    Also so much code here to set up the menu items and bottom nav items
    Need to encapsulate - maybe enum class?
     */

    
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo_NavigationBottom_and_DrawerTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                val scope = rememberCoroutineScope()
                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = {
                        AppBar(
                            onNavigationItemClick = {
                                scope.launch {
                                    scaffoldState.drawerState.open()
                                }

                            }
                        )
                    },
                    drawerContent = {
                        Header()
                        DrawerBody(
                            items = listOf(
                                MenuItem(
                                    title = "Home",
                                    icon = Icons.Default.Home,
                                    contentDescription = "Go to Home Screen"
                                ),
                                MenuItem(
                                    title = "Settings",
                                    icon = Icons.Default.Settings,
                                    contentDescription = "Go to Settings Screen"
                                ),
                                MenuItem(
                                    title = "Help",
                                    icon = Icons.Default.Info,
                                    contentDescription = "Go to Help Screen"
                                ),

                                ), onItemClick = {
                                println("Clicked on ${it.title}")
                            })
                    },
                    bottomBar = {
                        BottomNavigationBar(
                            items = listOf(
                                BottomNavItem(name = "Home", route = NavRoute.Home.route, icon = Icons.Default.Home),
                                BottomNavItem(name = "Detail", route = NavRoute.Detail.route, icon = Icons.Default.Settings)
                            ),
                            navController = navController,
                            onItemClick = {
                                navController.navigate(it.route)
                            }
                        )
                    }
                ) {
                    NavGraph(navController = navController) }

            }
        }
    }
}

@Composable
private fun MainScreen(modifier: Modifier = Modifier) {

    val navController = rememberNavController()
    NavGraph(navController)

}


/*

     // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }

 */
