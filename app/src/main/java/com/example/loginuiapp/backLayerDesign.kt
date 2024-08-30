package com.example.loginuiapp

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BackLayerDesign(){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopStart) {
        Canvas(
            modifier = Modifier
                .size(635.dp)
                .offset(
                    x = (170).dp,
                    y = (-230).dp
                )
        ) {
            drawCircle(
                color = Color(0xffF8F9FF),
                radius = size.minDimension / 2,
            )
        }
        Canvas(
            modifier = Modifier
                .size(372.dp)
                .offset(
                    x = (-270).dp,
                    y = (650).dp
                )
                .border(width = 3.dp, color = Color(0xffF8F9FF)),
        ) {
        }

    }
}