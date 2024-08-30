package com.example.loginuiapp

import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginuiapp.ui.theme.poppinsBold
import com.example.loginuiapp.ui.theme.poppinsRegular
import com.example.loginuiapp.ui.theme.poppinsSemiBold

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun WelcomeScreenContent() {
    Scaffold { contentPadding ->
        Box {
            BackLayerDesign()
            Column(
                modifier = Modifier
                    .padding(contentPadding)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(50.dp))
                Image(
                    modifier = Modifier.size(360.dp),
                    painter = painterResource(id = R.drawable.login_vector),
                    contentDescription = "LoginVector"
                )
                Spacer(modifier = Modifier.height(50.dp))
                TitleSection()
                Spacer(modifier = Modifier.height(88.dp))
                ButtonSection()
            }
        }
    }
}

@Composable
private fun TitleSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 52.dp)
    ) {
        Text(
            text = "Discover Your Dream Job here",
            style = TextStyle(
                color = Color(0xff1F41BB),
                fontSize = 35.sp,
                textAlign = TextAlign.Center,
                fontFamily = poppinsBold,
            )
        )
        Spacer(modifier = Modifier.height(23.dp))
        Text(
            text = "Explore all the existing job roles based on your interests and study major",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = poppinsRegular,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        )
    }
}

@Composable
private fun ButtonSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 39.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ElevatedButton(
            modifier = Modifier
                .height(50.dp)
                .width(140.dp),
            elevation = ButtonDefaults.buttonElevation(4.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color(0xff1F41BB)
            ),
            onClick = {}) {
            Text(
                "Login", style = TextStyle(
                    fontFamily = poppinsSemiBold,
                    fontSize = 16.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            )
        }
        TextButton(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .height(50.dp)
                .width(140.dp),
            onClick = {}) {
            Text(
                "Register", style = TextStyle(
                    fontFamily = poppinsSemiBold,
                    fontSize = 16.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                )
            )
        }
    }
}