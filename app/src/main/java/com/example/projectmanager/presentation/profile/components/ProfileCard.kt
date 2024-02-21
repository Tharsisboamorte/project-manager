package com.example.projectmanager.presentation.profile.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileCard(
    name: String,
    profession: String,
    projects: Int
) {
    Box(
        modifier = Modifier.size(120.dp),
    ) {

    }
}

@Preview
@Composable
fun ProfileCardPreview() {
    Surface {
        ProfileCard(
            name = "Carla Kidman",
            profession = "Kotlin Programmer",
            projects = 32
        )
    }
}