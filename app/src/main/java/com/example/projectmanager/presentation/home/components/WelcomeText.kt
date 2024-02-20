package com.example.projectmanager.presentation.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.projectmanager.ui.theme.Purple40

@Composable
fun WelcomeText(
    name: String,
    time: String
) {
    Column {
        Text(text = "Hi, $name !" , style = MaterialTheme.typography.titleLarge, color = Purple40)
        Text(text = time, style = MaterialTheme.typography.bodyMedium, color = Purple40 )
    }
}
@Preview
@Composable
fun WelcomeTextPreview() {
    Surface {
        WelcomeText(
            name = "Rebecca",
            time = "Good Morning"
        )
    }
}