package com.example.afinal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FullScreenBackground() {
    Image(
        painter = painterResource(id = R.drawable.image),
        contentDescription = "Background Image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop,
        alpha = 1f
    )
}

@Composable
fun FirstScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        FullScreenBackground()
        Text(
            text = "交通認知",
            fontSize = 50.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 55.dp),
            color = Color.Black
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 120.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 放在標題和按鈕之間的圖片
            Image(
                painter = painterResource(id = R.drawable.teach),
                contentDescription = "Tutorial Image",
                modifier = Modifier
                    .size(520.dp) // 根據需求調整圖片大小
                    .padding(vertical = 70.dp), // 調整圖片的上下間距
                contentScale = ContentScale.Fit
            )
            Button(
                onClick = { navController.navigate("tutorial_screen_1") },
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .width(250.dp)
                    .height(70.dp)
            ) {
                Text("教學模式", fontSize = 20.sp)
            }
            Button(
                onClick = { navController.navigate("TestPage1") },
                modifier = Modifier
                    .padding(top = 16.dp)
                    .width(250.dp)
                    .height(70.dp)
            ) {
                Text("測驗考試", fontSize = 20.sp)
            }
        }
    }
}

@Composable
fun TutorialScreen1(navController: NavController) {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "歡迎來到教學模式",
                    fontSize = 30.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "這將會教導你們如何認識路上標誌",
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
                    onClick = { navController.navigate("tutorial_screen_2") },
                    modifier = Modifier
                        .width(140.dp)
                        .height(60.dp)
                ) {
                    Text("下一頁", fontSize = 18.sp)
                }
            }
        }
    }

@Composable
   fun TutorialScreen2(navController: NavController) {
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
                Text(
                    text = "禁止行人通行",
                    fontSize = 35.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(40.dp))
                Image(
                    painter = painterResource(id = R.drawable.walk),
                    contentDescription = "Tutorial Image",
                    modifier = Modifier.size(200.dp),
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    text = "此路段禁止行人通行",
                    fontSize = 30.sp,
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
                    Text("上一頁", fontSize = 18.sp)
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = { navController.navigate("tutorial_screen_3") },
                    modifier = Modifier
                        .width(140.dp)
                        .height(60.dp)
                ) {
                    Text("下一頁", fontSize = 18.sp)
                }
            }
        }
    }
}
@Composable
fun TutorialScreen3(navController: NavController) {
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
                    Text(
                        text = "注意號誌",
                        fontSize = 35.sp,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        painter = painterResource(id = R.drawable.light),
                        contentDescription = "Tutorial Image",
                        modifier = Modifier.size(200.dp),
                        contentScale = ContentScale.Fit
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Text(
                        text = "前方有紅綠燈號誌",
                        fontSize = 30.sp,
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
                        Text("上一頁", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(
                        onClick = { navController.navigate("tutorial_screen_4") },
                        modifier = Modifier
                            .width(140.dp)
                            .height(60.dp)
                    ) {
                        Text("下一頁", fontSize = 18.sp)
                    }
                }
            }
        }

        @Composable
        fun TutorialScreen4(navController: NavController) {
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
                    Text(
                        text = "專供行人通行",
                        fontSize = 35.sp,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                    Image(
                        painter = painterResource(id = R.drawable.human),
                        contentDescription = "Tutorial Image",
                        modifier = Modifier.size(200.dp),
                        contentScale = ContentScale.Fit
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "行人專用通行，其他車輛禁入",
                        fontSize = 28.sp,
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
                        Text("上一頁", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(
                        onClick = { navController.navigate("TutorialScreen5") },
                        modifier = Modifier
                            .width(140.dp)
                            .height(60.dp)
                    ) {
                        Text("下一頁", fontSize = 18.sp)
                    }
                }
            }
        }

@Composable
fun TutorialScreen5(navController: NavController) {
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
            Text(
                text = "行人天橋",
                fontSize = 35.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(40.dp))
            Image(
                painter = painterResource(id = R.drawable.brige),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "在有些無斑馬線路段",
                fontSize = 28.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(7.dp))
            Text(
                text = "行人只能使用天橋通過馬路",
                fontSize = 28.sp,
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
                Text("上一頁", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { navController.navigate("TutorialScreen6") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("下一頁", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TutorialScreen6(navController: NavController) {
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
            Text(
                text = "臺灣鐵路",
                fontSize = 35.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(40.dp))
            Image(
                painter = painterResource(id = R.drawable.tr),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "簡稱:台鐵",
                fontSize = 28.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(7.dp))
            Text(
                text = "是臺灣的傳統鐵路系統",
                fontSize = 28.sp,
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
                Text("上一頁", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { navController.navigate("TutorialScreen7") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("下一頁", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TutorialScreen7(navController: NavController) {
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
            Text(
                text = "捷運系統",
                fontSize = 35.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(40.dp))
            Image(
                painter = painterResource(id = R.drawable.metro),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "各都會區的都市軌道運輸系統",
                fontSize = 28.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(7.dp))
            Text(
                text = "包含:台北 新北 桃園 台中 高雄",
                fontSize = 28.sp,
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
                Text("上一頁", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { navController.navigate("TutorialScreen8") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("下一頁", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun TutorialScreen8(navController: NavController) {
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
            Text(
                text = "高速鐵路",
                fontSize = 35.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(40.dp))
            Image(
                painter = painterResource(id = R.drawable.high),
                contentDescription = "Tutorial Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "台灣高速鐵路",
                fontSize = 28.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(7.dp))
            Text(
                text = "連結臺灣南北成為一日生活圈",
                fontSize = 28.sp,
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
                Text("上一頁", fontSize = 18.sp)
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { navController.navigate("final_screen") },
                modifier = Modifier
                    .width(140.dp)
                    .height(60.dp)
            ) {
                Text("下一頁", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun FinalScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "恭喜你完成教學!",
                        fontSize = 30.sp,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "別忘記去測驗一下自己喔!",
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
                        Text("上一頁", fontSize = 18.sp)
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    Button(
                        onClick = { navController.navigate("first_screen") },
                        modifier = Modifier
                            .width(140.dp)
                            .height(60.dp)
                    ) {
                        Text("結束教學", fontSize = 18.sp)
                    }
                }
            }
        }