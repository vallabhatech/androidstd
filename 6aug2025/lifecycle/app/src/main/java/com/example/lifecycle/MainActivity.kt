package com.example.lifecycle

import android.R
import android.os.Bundle
import android.util.Log
import android.view.Display
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lifecycle.ui.theme.LifeCycleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this,"onCreate is called!!", Toast.LENGTH_LONG).show()
        Log.d("Life Cycle","onCreate is called")
        enableEdgeToEdge()
        setContent {
            display()
        }
    }

    @Override
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart is called!!", Toast.LENGTH_LONG).show()
        Log.d("Life Cycle","onStart is called")
    }
    @Override
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume is called!!", Toast.LENGTH_LONG).show()
        Log.d("Life Cycle","onResume is called")
    }
    @Override
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause is called!!", Toast.LENGTH_LONG).show()
        Log.d("Life Cycle","onPause is called")
    }

    @Override
    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop is called!!", Toast.LENGTH_LONG).show()
        Log.d("Life Cycle","onStop is called")
    }
    @Override
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy is called!!", Toast.LENGTH_LONG).show()
        Log.d("Life Cycle","onDestroy is called")
    }

    @Override
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart is called!!", Toast.LENGTH_LONG).show()
        Log.d("Life Cycle","onRestart is called")
    }
}
@Composable
fun display() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)
        .background(Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "Activity Life Cycle", fontSize = 30.sp,color=Color.Red)
    }
}

@Preview
@Composable
fun displayPreview() {
    display()
}
/*
onCreate(): Called when the activity is first created. This is where you perform all your static setup, such as
defining the user interface (UI), binding data, and initializing variables.

onStart(): Called when the activity is about to become visible to the user.

onResume(): Called when the activity is in the foreground and the user can interact with it. This is the state
where the app remains until an interruptive event occurs (like a phone call or the user switching to another app).

onPause(): Called as the first indication that the user is leaving the activity. It's used to pause or adjust
operations that don't need to continue while the activity is not in the foreground.

onStop(): Called when the activity is no longer visible to the user. This is a good place to perform CPU-intensive
shutdown operations, like saving data to a database.

onDestroy(): Called before the activity is destroyed. This is the final callback and should be used to release
all resources that haven't been released by earlier callbacks.
 */