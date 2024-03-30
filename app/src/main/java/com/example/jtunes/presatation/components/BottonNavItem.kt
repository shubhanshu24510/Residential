package com.example.jtunes.presatation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BuildCircle
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.outlined.BuildCircle
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
    val icon_focused: ImageVector
) {
    object Home : BottomBarScreen(
        "home",
        icon = Icons.Outlined.Home,
        icon_focused = Icons.Filled.Home,
        title = "Home"
    )

    object Chat : BottomBarScreen(
        "chat",
        icon = Icons.Outlined.Chat,
        icon_focused = Icons.Filled.Chat,
        title = "Chat"
    )

    object Shop : BottomBarScreen(
        "shop",
        icon = Icons.Outlined.ShoppingBag,
        icon_focused = Icons.Filled.ShoppingBag,
        title = "Shop"
    )

    object Profile :
        BottomBarScreen(
            "profile",
            icon = Icons.Outlined.Person,
            icon_focused = Icons.Filled.Person,
            title = "Profile"
        )
}