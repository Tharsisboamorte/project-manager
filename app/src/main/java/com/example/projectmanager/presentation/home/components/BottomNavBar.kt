package com.example.projectmanager.presentation.home.components

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.projectmanager.R

@Composable
fun BottomNavBar() {
    val navController = rememberNavController()

    val screens = listOf(
        BottomNavigationScreens.Home,
        BottomNavigationScreens.Payment,
        BottomNavigationScreens.Add,
        BottomNavigationScreens.Tasks,
        BottomNavigationScreens.Profile
    )

    NavigationBar {
        screens.forEach { screen ->

        }
    }
}

sealed class BottomNavigationScreens(
    val route: String,
    @StringRes val resourceId: Int,
    @DrawableRes val icon: Int
) {
    object Home : BottomNavigationScreens(
        "Home",
        R.string.home_screen_route,
        icon = R.drawable.home
    )

    object Payment :
        BottomNavigationScreens(
            "Payment",
            R.string.payment_screen_route,
            R.drawable.payment
        )

    object Add :
        BottomNavigationScreens(
            "Add",
            R.string.add_screen_route,
            R.drawable.add_circle
        )

    object Tasks :
        BottomNavigationScreens(
            "MyTasks",
            R.string.task_screen_route,
            R.drawable.checklist
        )

    object Profile :
        BottomNavigationScreens(
            "Profile",
            R.string.profile_screen_route,
            R.drawable.user
        )
}