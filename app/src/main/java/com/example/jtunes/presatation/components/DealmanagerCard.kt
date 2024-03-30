package com.example.jtunes.presatation.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.jtunes.R
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun DealManagerCard(modifier: Modifier = Modifier) {
    Card(elevation = CardDefaults.cardElevation(1.dp),
        border = BorderStroke(width =1.dp, color = Color(0xFF9F9E9E)),
        colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
        onClick = { /*TODO*/ },
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(horizontalArrangement = Arrangement.Start,
         verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_map_logo),
                contentDescription = null
            )
            Column(modifier = Modifier
                .background(color = Color(0xFFFFFFFF))
                .fillMaxWidth()) {
                Text(text = stringResource(id = R.string.deal),
                    fontStyle = FontStyle.Normal,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(1.dp))
                Text(text = stringResource(id = R.string.manager),
                    fontStyle = FontStyle.Normal,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold)

                Divider(color = Color.Black, thickness = 1.dp,
                    modifier = Modifier.width(160.dp))

                Spacer(modifier = Modifier.height(9.dp))
                Text(text = stringResource(id = R.string.com_des),
                    fontStyle = FontStyle.Normal,
                    fontSize = 12.sp,
                    color = Color(0xFF9F9E9E),
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(20.dp))

                Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                    Icon(modifier = Modifier
                        .size(26.dp)
                        .align(Alignment.CenterVertically),
                        imageVector = Icons.Filled.Circle,
                        contentDescription = null,
                        tint = Color(0xFFD9D9D9)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    TextButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color(0xFF393939))
                    ) {
                        Text(text = stringResource(id = R.string.lease_pend),
                            overflow = TextOverflow.Clip,
                            fontSize = 13.sp,
                            maxLines = 1,
                            textAlign = TextAlign.Center)

                    }

                }


            }
        }
    }
}