package com.masa.shapeableimageview

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun ShapableImageView(
    modifier: Modifier = Modifier,
    image: Painter,
    shape: Shape = CircleShape,
    backGroundColor: Color = Color.Transparent,
    borderColor: Color = Color.Transparent,
    description: String = "",
    onImageClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .clip(shape)
            .background(backGroundColor)
            .border(2.dp, borderColor, shape)
            .aspectRatio(1f)
            .clickable { onImageClick }
    ) {
        Image(painter = image, contentDescription = description, modifier = Modifier.fillMaxSize())
    }
}


