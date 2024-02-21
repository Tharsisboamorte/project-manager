package com.example.projectmanager.navigation

import androidx.annotation.DrawableRes
import com.example.projectmanager.R

data class NavItem (
    val label: String,
    @DrawableRes val icon: Int,
    val route: String
)

val listOfNavItems = listOf(
    NavItem(
        label = "Home",
        icon = R.drawable.home,
        route = Screens.HomeScreen.name
    ),
    NavItem(
        label = "Payment",
        icon = R.drawable.payment,
        route = Screens.PaymentScreen.name
    ),
    NavItem(
        label = "Add",
        icon = R.drawable.add_circle,
        route = Screens.AddScreen.name
    ),
    NavItem(
        label = "My Task",
        icon = R.drawable.checklist,
        route = Screens.MyTaskScreen.name
    ),
    NavItem(
        label = "Profile",
        icon = R.drawable.user,
        route = Screens.ProfileScreen.name
    )
)
