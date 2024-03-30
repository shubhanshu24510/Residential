package com.example.jtunes.presatation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Person3
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.jtunes.R


@Composable
fun BottomBar(modifier: Modifier = Modifier) {

    var navNum by remember {
        mutableStateOf(0)
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            .background(Color(0xFFFF4D4D))
            .padding(vertical = 15.dp, horizontal = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (navNum == 1) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Home,
                        contentDescription = "home",
                        tint = Color(0xFFFF4D4D),
                        modifier = Modifier
                            .size(25.dp)
                    )
                }
            } else {
                IconButton(onClick = { navNum = 0 }) {
                    Icon(
                        Icons.Outlined.Home,
                        contentDescription = "home",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .size(25.dp)
                    )
                }
            }


            Spacer(modifier = Modifier.width(8.dp))
            if (navNum == 2) {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Chat,
                        contentDescription = "home",
                        tint = Color(0xFFFF4D4D),
                        modifier = Modifier.size(25.dp)
                    )
                }
            } else {
                IconButton(onClick = { navNum = 1 }) {
                    Icon(
                        Icons.Outlined.Chat,
                        contentDescription = "home",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (navNum == 3) {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.ShoppingBag,
                        contentDescription = "home",
                        tint = Color(0xFFFF4D4D),
                        modifier = Modifier.size(25.dp)
                    )
                }
            } else {
                IconButton(onClick = { navNum = 2 }) {
                    Icon(
                        Icons.Outlined.ShoppingBag,
                        contentDescription = "home",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            if (navNum == 4) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "home",
                        tint = Color(0xFFFF4D4D),
                        modifier = Modifier.size(25.dp)
                    )
                }
            } else {
                IconButton(onClick = { navNum = 3 }) {
                    Icon(
                        Icons.Outlined.Person,
                        contentDescription = "home",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
        }
    }
}