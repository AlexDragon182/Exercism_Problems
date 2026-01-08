package com.example.exercismproblems

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.exercismproblems.PROBLEMS.CollatzCalculator
import com.example.exercismproblems.PROBLEMS.Darts
import com.example.exercismproblems.PROBLEMS.reverseWithForEach
import com.example.exercismproblems.ui.theme.ExercismProblemsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercismProblemsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                    var score = Darts.score(-0.0,-10.0)
                    println(score)
                    reverseWithForEach("dessert")
                    CollatzCalculator.computeStepCount(6,null)
                    CollatzCalculator.computeStepCountGoogle(6)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExercismProblemsTheme {
        Greeting("Android")
    }
}
