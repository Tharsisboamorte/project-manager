package com.example.projectmanager.presentation.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectmanager.presentation.home.components.WelcomeText

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold() {
        Column(
            modifier = Modifier
                .padding(top = 38.dp)
        ) {
            WelcomeText(name = "Lamin", time = "Good Morning")

        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    Surface {
        HomeScreen()
    }
}