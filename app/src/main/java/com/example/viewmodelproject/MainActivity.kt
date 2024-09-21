package com.example.viewmodelproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.viewmodelproject.ui.theme.ViewModelProjectTheme
import com.example.viewmodelproject.views.MainGui
import com.example.viewmodelproject.views.MainGuiViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val MainGui_ViewModel: MainGuiViewModel = MainGuiViewModel()


        setContent {
            ViewModelProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainGui(mainGui_ViewModel = MainGui_ViewModel ,modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

