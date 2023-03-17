package com.example.demo_navigationbottom_and_drawer.drawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// modifier is going to be scoped

/*

PL doesn't give header any parameters as using static header.

{ Box ( modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 64.dp),
       contentAlignment = Alignment.Center
  ) {
        Text (text = "Header", fontSize = 60.sp)
  }
 */
@Composable
fun Header(modifier: Modifier = Modifier) {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            ){
        Icon (imageVector = Icons.Default.Person, contentDescription = null)
        Spacer(modifier = Modifier.size(4.dp))
        Text(text = " ** Menu ** ")
    }
}

@Composable
@Preview
fun HeaderPreview(){
    Header()
}