package com.joel.podcast.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.joel.podcast.R
import com.joel.podcast.destinations.ListPageDestination
import com.joel.podcast.ui.theme.MainColor
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnBoardingScreen(navigator: DestinationsNavigator){
    val pagerState = rememberPagerState(pageCount = 1)

   Surface(
       color = MaterialTheme.colors.background,
       modifier = Modifier
           .fillMaxSize()
   )
   {
       Column(
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally,
           modifier = Modifier.padding(
               vertical = 42.dp,

           )
       )
       {
           HorizontalPager(
               state = pagerState,
               modifier = Modifier.weight(1f)
           )
           { page ->
               PageUI(page = onboardPage[page])
           }
           BottomSection(navigator)
       }
   }
}

@Composable
fun PageUI(page: Page){



    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(id = page.image),
            contentDescription = page.title,
            modifier = Modifier
                .size(250.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = page.title,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth(),
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = page.description,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth(),
            overflow = TextOverflow.Clip,
            color = Color.Black
        )

    }

}

@Composable
fun BottomSection(
    navigator: DestinationsNavigator
){
    Box(
        contentAlignment = Alignment.Center)
    {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            TextButton(
                onClick = { /*TODO*/ },
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Get Started in ",
                        color = Color.Black
                    )
                    Text(
                        text = "Quari Podcast",
                        color = Color.Black
                    )
                }
            }
            Spacer(modifier = Modifier.width(90.dp))
            Button(
                onClick = {
                          navigator.navigate(ListPageDestination)

                },
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MainColor,
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    text = "Continue",
                    modifier = Modifier
                        .padding(6.dp)

                )
            }
        }
    }
}
//
//@Preview
//@Composable
//fun OnBoardPreview(){
//    OnBoardingScreen()
//}