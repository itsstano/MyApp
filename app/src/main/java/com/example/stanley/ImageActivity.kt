package com.example.stanley

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stanley.ui.theme.StanleyTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myimage()

        }
    }
}

@Composable
fun myimage(){
    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Text(text = "BREEDS OF DOGS",
            fontSize = 30.sp,
            color= Color.Black,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 50.dp),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        //First row
       Row {
           Image(painter = painterResource(id = R.drawable.img),
               contentDescription ="Siberian Husky",
               modifier = Modifier.size(width = 200.dp,height=150.dp))
           Column {
               Text(text = "SIBERIAN HUSKY",
                   fontSize = 20.sp)
               Text(text = "The dog is a domesticated descendant of the wolf. Also called the domestic dog, it is derived from extinct Pleistocene wolves, and the modern wolf is the dog's nearest living relative.")
           }
       }
        
        Spacer(modifier = Modifier.height(20.dp))

        //Second row
        Row {
            Image(painter = painterResource(id = R.drawable.img_1),
                contentDescription ="Siberian Husky",
                modifier = Modifier.size(width = 200.dp,height=150.dp))
            Column {
                Text(text = "GERMAN SHEPHARD",
                    fontSize = 20.sp)
                Text(text = "The dog is a domesticated descendant of the wolf. Also called the domestic dog, it is derived from extinct Pleistocene wolves, and the modern wolf is the dog's nearest living relative.")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        //Third row
        Row {
            Image(painter = painterResource(id = R.drawable.img_2),
                contentDescription ="Siberian Husky",
                modifier = Modifier.size(width = 200.dp,height=150.dp))
            Column {
                Text(text = "HYBRID",
                    fontSize = 20.sp)
                Text(text = "The dog is a domesticated descendant of the wolf. Also called the domestic dog, it is derived from extinct Pleistocene wolves, and the modern wolf is the dog's nearest living relative.")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        //Circular image
        Image(painter = painterResource(id = R.drawable.img_2),
            contentDescription = "image",
            modifier = Modifier.size(128.dp).
            clip(shape= CircleShape),
            contentScale = ContentScale.Crop)



    }



}


@Preview(showBackground = true)
@Composable
fun myimagepreview(){
    myimage()
}
