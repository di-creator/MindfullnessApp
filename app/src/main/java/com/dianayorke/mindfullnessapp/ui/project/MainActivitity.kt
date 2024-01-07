package com.dianayorke.mindfullnessapp.ui.project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dianayorke.mindfullnessapp.ui.project.components.MySoothePortraitPreview
import com.dianayorke.mindfullnessapp.ui.project.screen.HomeScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MySoothePortraitPreview() }
    }
}