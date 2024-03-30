package com.example.jtunes.presatation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jtunes.R

@Composable
fun TitleBar(
    logo:Painter,
    tiltebar:String
) {
    Row {
        Image(painter = logo, contentDescription = null,
            contentScale = ContentScale.Crop,
            alignment = Alignment.CenterStart,
            modifier = Modifier
                .width(24.dp)
                .height(30.dp))
        Text(text =tiltebar,
            fontSize =16.sp,
            fontWeight = FontWeight.SemiBold,
            textAlign = TextAlign.Justify)

    }

}

@Composable
fun RightTitle(
    firstText:String,
    secondText:String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp, bottom = 3.dp, end = 20.dp),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(firstText)
        Spacer(modifier = Modifier.width(5.dp))
        Text(secondText,
            color = Color(0xFFFF4848)
        )
    }

}

