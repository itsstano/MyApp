package com.example.stanley

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stanley.ui.theme.StanleyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()

        }
    }
}

@Composable
fun demo(){

    val mContext= LocalContext.current
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)){
        Text(text = "Hello Stanley",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic)

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Welcome to Android",
            color = Color.Blue,
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Kotlin",
            color = Color.Yellow,
            fontFamily = FontFamily.Serif,
            fontSize = 30.sp)
        Divider()
        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text(text = "Text 1",
                fontSize = 30.sp)
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "Text 2",
                fontSize = 30.sp)

        }

        Row {
            Text(text = "eMobilis",
                fontSize = 30.sp)
            Spacer(modifier = Modifier.width(50.dp))
            Text(text = "Technology",
                fontSize = 30.sp)

        }

        Box {
            Text(text = "Yes",
                fontSize = 30.sp)
            Text(text = "No",
                fontSize = 30.sp)
        }
        //Button
        Button(onClick = { mContext.startActivity(Intent(mContext,PracticalActivity::class.java)) },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Magenta)) {
            Text(text = "Click Me")

        }
        //button
        Button(onClick = {   mContext.startActivity(Intent(mContext,IntentActivity::class.java))},
            shape= CutCornerShape(5.dp),
            border= BorderStroke(3.dp,Color.Red),
            colors = ButtonDefaults.outlinedButtonColors()
        )

        {
            Image(painter = painterResource(id = R.drawable.img_3),
                contentDescription = "")
            Text(text = "Add to cart",
                modifier = Modifier
                    .padding(start=10.dp))
            
        }

        //bordered button
        Button(onClick = {   mContext.startActivity(Intent(mContext,FormActivity::class.java))},
            shape= CutCornerShape(5.dp),
            border= BorderStroke(3.dp,Color.Red),
            colors = ButtonDefaults.outlinedButtonColors()
        )
        {
            Text(text = "Bordered button")



        }

        //Intent
        Button(onClick = {
                         mContext.startActivity(Intent(mContext,ImageActivity::class.java))
        },
            shape = CutCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black)){
            Text(text = "Next")
            
        }

        Button(onClick = { mContext.startActivity(Intent(mContext,LottieAnimationActivity::class.java)) },
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color.Magenta)) {
            Text(text = "Animation")

        }


    }


}


@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()

}