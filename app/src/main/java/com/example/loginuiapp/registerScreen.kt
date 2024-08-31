package com.example.loginuiapp

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginuiapp.ui.theme.poppinsBold
import com.example.loginuiapp.ui.theme.poppinsMedium
import com.example.loginuiapp.ui.theme.poppinsSemiBold

@Composable
fun RegisterScreenContent() {
    Scaffold { contentPadding ->
        Box {
            BackLayerDesign()

            Column(
                modifier = Modifier
                    .padding(contentPadding)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(60.dp))

                Column(
                    modifier = Modifier
                        .padding(horizontal = 50.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = "Create Account",
                        style = TextStyle(
                            fontFamily = poppinsBold,
                            fontSize = 30.sp,
                            color = Color(0xff1F41BB),
                            textAlign = TextAlign.Center,
                        )
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        "Create an account so you can explore all the existing jobs.",
                        style = TextStyle(
                            fontFamily = poppinsMedium,
                            color = Color.Black,
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center,
                        )
                    )
                }
                Spacer(modifier = Modifier.height(50.dp))

                TextFieldSection()

                Spacer(modifier = Modifier.height(65.dp))

                SignInOptions()
            }
        }
    }
}

@Composable
private fun TextFieldSection() {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var confirmPassword by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        OutlinedTextField(
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xffF1F4FF),
                unfocusedContainerColor = Color(0xffF1F4FF),
                focusedBorderColor = Color(0xff1F41BB),
                unfocusedBorderColor = Color.Transparent,
                focusedTextColor = Color.Black,
            ),
            textStyle = TextStyle(
                fontFamily = poppinsSemiBold, fontSize = 14.sp,
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(top = 8.dp),
            value = email,
            onValueChange = { value -> email = value },
            placeholder = {
                Text(
                    "Email",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = poppinsMedium,
                        color = Color(0xff626262), textAlign = TextAlign.Start,
                    )
                )
            },
        )
        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xffF1F4FF),
                unfocusedContainerColor = Color(0xffF1F4FF),
                focusedBorderColor = Color(0xff1F41BB),
                unfocusedBorderColor = Color.Transparent,
                focusedTextColor = Color.Black,
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(top = 8.dp),
            value = password, onValueChange = { value -> password = value },
            placeholder = {
                Text(
                    "Password",
                    style = TextStyle(
                        fontFamily = poppinsMedium,
                        fontSize = 16.sp,
                        color = Color(0xff626262),
                        textAlign = TextAlign.Start,
                    ),
                )
            },
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xffF1F4FF),
                unfocusedContainerColor = Color(0xffF1F4FF),
                focusedBorderColor = Color(0xff1F41BB),
                unfocusedBorderColor = Color.Transparent,
                focusedTextColor = Color.Black,
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
                .padding(top = 8.dp),
            value = confirmPassword, onValueChange = { value -> confirmPassword = value },
            placeholder = {
                Text(
                    "Confirm Password",
                    style = TextStyle(
                        fontFamily = poppinsMedium,
                        fontSize = 16.sp,
                        color = Color(0xff626262),
                        textAlign = TextAlign.Start,
                    ),
                )
            },
        )
        
        Spacer(modifier = Modifier.height(50.dp))

        ElevatedButton(
            modifier = Modifier
                .height(60.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xff1F41BB)
            ),
            elevation = ButtonDefaults.buttonElevation(
                4.dp,
            ),
            onClick = {}) {
            Text(
                "Sing up",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = poppinsSemiBold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ),
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            "Create an account", style = TextStyle(
                fontSize = 14.sp,
                fontFamily = poppinsSemiBold,
                color = Color(0xff494949),
                textAlign = TextAlign.Center,
            )
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun SignInOptions() {
    Text(
        "Or Continue with", style = TextStyle(
            color = Color(0xff1F41BB),
            fontSize = 14.sp,
            fontFamily = poppinsSemiBold,
            textAlign = TextAlign.Center,
        )
    )
    Spacer(modifier = Modifier.height(20.dp))

    FlowRow {
        Card(
            modifier = Modifier
                .height(44.dp)
                .width(60.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xffECECEC),
            ),
            elevation = CardDefaults.cardElevation(1.dp),
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {

                Image(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.icon_google),
                    contentDescription = "Google Icon"
                )
            }
        }

        Spacer(modifier = Modifier.width(10.dp))

        Card(
            modifier = Modifier
                .height(44.dp)
                .width(60.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xffECECEC),
            ),
            elevation = CardDefaults.cardElevation(1.dp),
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.icon_facebook),
                    contentDescription = "Facebook Icon"
                )
            }
        }

        Spacer(modifier = Modifier.width(10.dp))

        Card(
            modifier = Modifier
                .height(44.dp)
                .width(60.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xffECECEC),
            ),
            elevation = CardDefaults.cardElevation(1.dp),

            ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.CenterHorizontally),
                    painter = painterResource(id = R.drawable.icon_apple),
                    contentDescription = "Apple Icon"
                )
            }
        }

    }
}
