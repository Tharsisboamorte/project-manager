package com.example.projectmanager.presentation.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectmanager.R
import com.example.projectmanager.ui.theme.Purple40

@Composable
fun ProfileCard(
    name: String,
    profession: String,
    projects: Int
) {
    Box(
        modifier = Modifier
            .size(290.dp)
            .background(color = Purple40, shape = RoundedCornerShape(15.dp)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(R.drawable.avatar_image),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,            // crop the image if it's not a square
                modifier = Modifier
                    .size(84.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = name,
                style = MaterialTheme.typography.titleMedium,
                color = Color.White
            )
            Text(
                text = profession,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                text = projects.toString(),
                style = MaterialTheme.typography.titleMedium,
                color = Color.White
            )
            Text(
                text = "Projects",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun ProfileCardPreview() {
    Surface {
        ProfileCard(
            name = "Miguel Kidman",
            profession = "Kotlin Programmer",
            projects = 32
        )
    }
}