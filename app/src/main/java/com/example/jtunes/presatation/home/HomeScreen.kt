package com.example.jtunes.presatation.home

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jtunes.R
import com.example.jtunes.presatation.components.BottomBar
import com.example.jtunes.presatation.components.CardOffer
import com.example.jtunes.presatation.components.CreditCard
import com.example.jtunes.presatation.components.DealManagerCard
import com.example.jtunes.presatation.components.RightTitle
import com.example.jtunes.presatation.components.TitleBar
import com.example.jtunes.presatation.ui.theme.JTunesTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 13.dp, start = 13.dp, bottom = 3.dp, end = 3.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TitleBar(
                logo = painterResource(id = R.drawable.r_logo),
                tiltebar = stringResource(id = R.string.entainance)
            )

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_notifications),
                    contentDescription = null
                )
            }
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())) {
            RightTitle(
                firstText = stringResource(id = R.string.slide_to),
                secondText = stringResource(id = R.string.add_commercial)
            )

            CreditCard()
            RightTitle(
                firstText = stringResource(id = R.string.complete_ypur),
                secondText = stringResource(id = R.string.profile)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(13.dp)
            ) {
                TitleBar(
                    logo = painterResource(id = R.drawable.r_logo),
                    tiltebar = stringResource(id = R.string.score)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                CardOffer(
                    topText = stringResource(id = R.string.rented),
                    bottomText = stringResource(id = R.string.property),
                    cardLogo = painterResource(id = R.drawable.ic_rent)
                )
                CardOffer(
                    topText = stringResource(id = R.string.ongoning),
                    bottomText = stringResource(id = R.string.deals),
                    cardLogo = painterResource(id = R.drawable.ic_deal)
                )
            }
            DealManagerCard()

        }

        Spacer(modifier = Modifier.height(5.dp))
            Box {
                BottomBar(modifier = Modifier.align(Alignment.BottomCenter))
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(bottom = 35.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFFF4D4D))
                        .align(Alignment.BottomCenter)
                        .padding(10.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "add",
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                }
            }
        }
    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomePreview() {
    JTunesTheme {
        HomeScreen()
    }

}