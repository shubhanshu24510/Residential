package com.example.jtunes.presatation.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jtunes.R
import com.example.jtunes.presatation.ui.theme.JTunesTheme
import com.example.jtunes.presatation.ui.theme.SpaceGrotesk
import com.example.jtunes.presatation.ui.theme.SpaceMono

@Composable
fun CreditCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        colors = CardDefaults.cardColors(Color(0xFF2A2E35)),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(id = R.string.card_holder),
                fontFamily = SpaceMono,
                color = Color(0xFFE9E9E9)
            )
            Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                Text(
                    text = stringResource(id = R.string.share),
                    fontFamily = SpaceMono,
                    color = Color(0xFFE9E9E9)
                )
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Outlined.Share, contentDescription = null,
                        tint = Color(0xFFE9E9E9),
                        modifier = Modifier.padding(bottom = 13.dp)
                    )
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFF2B930)
                ),
                modifier = Modifier
                    .size(width = 150.dp, height = 80.dp),
                shape = RectangleShape
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.g_logo),
                        contentDescription = null
                    )

                }

            }


        }
    }
}


@Preview(showBackground = true)
@Composable
private fun CardPreview() {
    JTunesTheme {
        CreditCard()
    }

}


