package com.dianayorke.mindfullnessapp.ui.project.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dianayorke.mindfullnessapp.R
import com.dianayorke.mindfullnessapp.ui.project.components.AlignYourBodyRow
import com.dianayorke.mindfullnessapp.ui.project.components.FavoriteCollectionsGrid
import com.dianayorke.mindfullnessapp.ui.project.components.HomeSection
import com.dianayorke.mindfullnessapp.ui.project.components.MySootheAppLandscape
import com.dianayorke.mindfullnessapp.ui.project.components.MySootheAppPortrait
import com.dianayorke.mindfullnessapp.ui.project.components.SearchBar
import com.dianayorke.mindfullnessapp.ui.project.theme.MySootheTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .verticalScroll(rememberScrollState())
    ) {
            Spacer(Modifier.height(16.dp))
            SearchBar(Modifier.padding(horizontal = 16.dp))
            HomeSection(title = R.string.align_your_body) {
                AlignYourBodyRow()
            }
            HomeSection(title = R.string.favorite_collections) {
                FavoriteCollectionsGrid()
            }
            Spacer(Modifier.height(16.dp))
        }
    }

    @Composable
    fun HomeScreen(windowSize: WindowSizeClass) {
        when (windowSize.widthSizeClass) {
            WindowWidthSizeClass.Compact -> {
                MySootheAppPortrait()
            }

            WindowWidthSizeClass.Expanded -> {
                MySootheAppLandscape()
            }
        }
    }


@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE, heightDp = 180)
@Composable
fun ScreenContentPreview() {
    MySootheTheme { HomeScreen() }
}