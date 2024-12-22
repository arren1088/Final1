package com.example.afinal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun TestPage1(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "這是測驗考試!",
                fontSize = 30.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "請確認你已完成教學!",
                fontSize = 20.sp,
                color = Color.DarkGray
            )
        }
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { navController.navigateUp() },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("回到首頁", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { navController.navigate("TestPage3") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("開始測驗", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TestPage3(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Transparent back arrow button in the top-left corner
        IconButton(
            onClick = { navController.navigate("first_screen") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(20.dp) // Add padding around the button
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack, // Back arrow icon
                contentDescription = "Back",
                tint = Color.Black, // You can set the color of the arrow icon here
                modifier = Modifier.size(30.dp)
            )
        }
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.walk),
                    contentDescription = "Tutorial Image",
                    modifier = Modifier.size(200.dp),
                    contentScale = ContentScale.Fit
                )
            }
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp), // 垂直間距
                horizontalAlignment = Alignment.CenterHorizontally // 內容水平居中
            ) {
                Button(
                    onClick = { navController.navigate("TestPage4") },
                    modifier = Modifier
                        .width(140.dp)
                        .height(60.dp)
                ) {
                    Text("禁止行人", fontSize = 18.sp)
                }
                Button(
                    onClick = { navController.navigate("WrongPage") },
                    modifier = Modifier
                        .width(140.dp)
                        .height(60.dp)
                ) {
                    Text("行人專用", fontSize = 18.sp)
                }
                Button(
                    onClick = { navController.navigate("WrongPage") },
                    modifier = Modifier
                        .width(140.dp)
                        .height(60.dp)
                ) {
                    Text("行人專用道", fontSize = 18.sp)
                }
            }
        }
    }
}
@Composable
fun TestPage4(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Transparent back arrow button in the top-left corner
        IconButton(
            onClick = { navController.navigate("first_screen") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(20.dp) // Add padding around the button
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack, // Back arrow icon
                contentDescription = "Back",
                tint = Color.Black, // You can set the color of the arrow icon here
                modifier = Modifier.size(30.dp)
            )
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.light),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp), // 垂直間距
            horizontalAlignment = Alignment.CenterHorizontally // 內容水平居中
        ) {
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("水果", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("紅色三角形", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("TestPage5") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("注意號誌", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TestPage5(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Transparent back arrow button in the top-left corner
        IconButton(
            onClick = { navController.navigate("first_screen") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(20.dp) // Add padding around the button
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack, // Back arrow icon
                contentDescription = "Back",
                tint = Color.Black, // You can set the color of the arrow icon here
                modifier = Modifier.size(30.dp)
            )
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.human),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp), // 垂直間距
            horizontalAlignment = Alignment.CenterHorizontally // 內容水平居中
        ) {
            Button(
                onClick = { navController.navigate("TestPage6") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("行人專用", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("爸爸帶小孩", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("藍色甜甜圈", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TestPage6(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Transparent back arrow button in the top-left corner
        IconButton(
            onClick = { navController.navigate("first_screen") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(20.dp) // Add padding around the button
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack, // Back arrow icon
                contentDescription = "Back",
                tint = Color.Black, // You can set the color of the arrow icon here
                modifier = Modifier.size(30.dp)
            )
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.brige),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp), // 垂直間距
            horizontalAlignment = Alignment.CenterHorizontally // 內容水平居中
        ) {
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("羅馬競技場", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("TestPage7") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("行人天橋", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("行人專用道", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TestPage7(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Transparent back arrow button in the top-left corner
        IconButton(
            onClick = { navController.navigate("first_screen") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(20.dp) // Add padding around the button
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack, // Back arrow icon
                contentDescription = "Back",
                tint = Color.Black, // You can set the color of the arrow icon here
                modifier = Modifier.size(30.dp)
            )
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.tr),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp), // 垂直間距
            horizontalAlignment = Alignment.CenterHorizontally // 內容水平居中
        ) {
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("藍色鐵捲門", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("TestPage8") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("台灣鐵路", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("麥當勞", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TestPage8(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Transparent back arrow button in the top-left corner
        IconButton(
            onClick = { navController.navigate("first_screen") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(20.dp) // Add padding around the button
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack, // Back arrow icon
                contentDescription = "Back",
                tint = Color.Black, // You can set the color of the arrow icon here
                modifier = Modifier.size(30.dp)
            )
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.metro),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp), // 垂直間距
            horizontalAlignment = Alignment.CenterHorizontally // 內容水平居中
        ) {
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("台灣鐵路", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("台灣高鐵", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("TestPage9") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("捷運系統", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TestPage9(navController: NavController) {
    var clickCount by remember { mutableStateOf(0) }
    Box(modifier = Modifier.fillMaxSize()) {
        // Transparent back arrow button in the top-left corner
        IconButton(
            onClick = { navController.navigate("first_screen") },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(20.dp) // Add padding around the button
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack, // Back arrow icon
                contentDescription = "Back",
                tint = Color.Black, // You can set the color of the arrow icon here
                modifier = Modifier.size(30.dp)
            )
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.high),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp), // 垂直間距
            horizontalAlignment = Alignment.CenterHorizontally // 內容水平居中
        ) {
            Button(
                onClick = { navController.navigate("TestPage10")
                        clickCount++ },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("台灣高鐵", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("火車頭", fontSize = 18.sp)
            }
            Button(
                onClick = { navController.navigate("WrongPage") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("慢速鐵路", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TestPage10(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "恭喜你完成測驗!",
                fontSize = 30.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "道路千萬條，安全第一條",
                fontSize = 20.sp,
                color = Color.DarkGray
            )
        }

        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = {
                    navController.navigate("first_screen")
                },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("返回首頁", fontSize = 18.sp)
            }
        }
    }
}
