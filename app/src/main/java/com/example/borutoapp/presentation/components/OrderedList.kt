package com.example.borutoapp.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.borutoapp.ui.theme.titleColor

@Composable
fun OrderedList(
    title: String,
    items: List<String>,
    textColor: Color,
) {
    Column {
        Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text = title,
            color = textColor,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
            fontWeight = FontWeight.Bold,
        )
        items.forEachIndexed { index, item ->
            Text(
                modifier = Modifier.alpha(alpha = ContentAlpha.medium),
                text = "${index + 1}. $item",
                color = textColor,
                fontSize = MaterialTheme.typography.body1.fontSize,
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun OrderedListPreview() {
    OrderedList(
        title = "Family",
        items = listOf("Javad", "Ali"),
        textColor = MaterialTheme.colors.titleColor
    )
}