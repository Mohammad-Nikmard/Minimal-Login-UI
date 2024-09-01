package com.example.loginuiapp

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun BackLayerDesign() {
    Box(contentAlignment = Alignment.TopStart) {


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
                .offset(
                    x = (280).dp,
                    y = (80).dp
                )
        ) {
            drawCircle(
                color = Color(0xffF8F9FF),
                radius = 650f,
                style = Stroke(
                    width = 6f,
                )
            )
        }

        Canvas(
            modifier = Modifier
                .offset(
                    x = (-50.0).dp,
                )
                .rotate(30f)
                .align(Alignment.BottomStart)
        ) {
            drawRect(
                color = Color(0xffF8F9FF),
                size = Size(height = 650f, width = 650f),
                style = Stroke(
                    width =10f,
                )
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