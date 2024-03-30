package com.example.jtunes.presatation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jtunes.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardOffer(
    topText:String ="",
    bottomText:String ="",
    cardLogo:Painter) {
    Card(onClick = { /*TODO*/ },
        border = BorderStroke(width = 1.dp, color = Color(0xFFAFAFAF)),
        shape = RectangleShape,
        modifier = Modifier.size(160.dp,90.dp),
        colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
            modifier = Modifier.padding(start = 7.dp, end = 7.dp)) {
            Column(
                Modifier
                    .background(
                        color = Color(0xFFFFFFFF)
                    )
                    .padding(18.dp)
            ) {
                Text(text = topText,
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold)
                Text(text = bottomText,
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    color = Color(0xFFFF4D4D),
                    fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.width(3.dp))
            Image(painter =cardLogo , contentDescription =null,
                alignment = Alignment.Center,
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(40.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LeftCardOffer() {
    CardOffer(topText = stringResource(id = R.string.rented),
        bottomText = stringResource(id = R.string.property),
            cardLogo = painterResource(id = R.drawable.ic_rent))

}
@Preview(showBackground = true)
@Composable
fun RightCardOffer() {
    CardOffer(topText = stringResource(id = R.string.ongoning),
        bottomText = stringResource(id = R.string.deals),
        cardLogo = painterResource(id = R.drawable.ic_deal))

}