package com.example.stanley

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stanley.ui.theme.StanleyTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cardDemo()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardDemo(){

    val mContext= LocalContext.current

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(30.dp)){

        //TopApp Bar
        TopAppBar(title = {
            Text(text = "Homepage",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp)
        },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Magenta),
            navigationIcon = {
                IconButton(onClick = {mContext.startActivity(Intent(mContext,ImageActivity::class.java))}) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack , contentDescription = "Arrowback")

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Share , contentDescription = "Share")

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Settings , contentDescription = "Settings")

                }

            }
        )
        Text(text = "Dashboard",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif)

        //Row 1
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First Card
            Card (modifier = Modifier.size(200.dp)){
               Column(modifier = Modifier.padding(10.dp)) {
                   Image(painter = painterResource(id = R.drawable.img),
                       contentDescription ="" ,
                       modifier = Modifier.size(150.dp))
                   Text(text = "Bulldog",
                       fontSize = 20.sp,
                       color = Color.Black,
                       fontWeight = FontWeight.Bold)
               }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Second Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Third Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Siberian Husky",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Fourth Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Hybrid",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
        }


        //Row 2
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Bulldog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Second Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Third Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Siberian Husky",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Fourth Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Hybrid",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
        }
        //Row 3
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Bulldog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Second Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Third Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Siberian Husky",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            //Fourth Card
            Card (modifier = Modifier.size(200.dp)){
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription ="" ,
                        modifier = Modifier.size(150.dp))
                    Text(text = "Hybrid",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }

            }
        }

    }

}


@Preview(showBackground = true)
@Composable
fun cardDemoPreview(){
    cardDemo()
}
