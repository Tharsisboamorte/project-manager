package com.example.projectmanager.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectmanager.R
import com.example.projectmanager.ui.theme.Purple40

@Composable
fun WelcomeCard(
    padding: PaddingValues
) {
    Box(
        modifier = Modifier
            .padding(padding)
            .border(shape = RoundedCornerShape(20.dp), width = 1.dp, color = Purple40)
            .height(120.dp)
            .fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.padding(top = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.padding(start = 15.dp)
            ) {
                Text(
                    text = "Welcome!",
                    style = MaterialTheme.typography.titleMedium,
                    color = Purple40
                )
                Text(
                    text = stringResource(id = R.string.schedule_projects),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Purple40
                )
            }
            Spacer(modifier = Modifier.width(100.dp))
            Image(
                painter = painterResource(id = R.drawable.projections),
                contentDescription = "",
                modifier = Modifier.height(100.dp)
            )
        }
    }
}

@Preview
@Composable
fun WelcomeCardPreview() {
    Surface {
        WelcomeCard(
            padding = PaddingValues(start = 15.dp, end = 15.dp, top = 20.dp, bottom = 20.dp)
        )
    }
}