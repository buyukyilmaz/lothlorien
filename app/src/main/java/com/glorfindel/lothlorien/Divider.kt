package com.glorfindel.lothlorien

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.glorfindel.lothlorien.theme.lothlorienColors
import com.glorfindel.lothlorien.theme.lothlorienComponentDefaults

object Divider {
    @Composable
    @NonRestartableComposable
    fun Horizontal(
        modifier: Modifier = Modifier,
        width: Dp = (-1).dp,
        height: Dp = lothlorienComponentDefaults().horizontalDividerHeight,
        color: Color = lothlorienColors().horizontalDividerColor
    ) {
        Box(
            modifier =
                modifier
                    .applyIf({ width == (-1).dp }) { fillMaxWidth() }
                    .applyIf({ width != (-1).dp }) { width(width) }
                    .height(height)
                    .background(color)
        )
    }

    @Composable
    @NonRestartableComposable
    fun Vertical(
        modifier: Modifier = Modifier,
        height: Dp = (-1).dp,
        width: Dp = lothlorienComponentDefaults().verticalDividerWidth,
        color: Color = lothlorienColors().verticalDividerColor
    ) {
        Box(
            modifier =
                modifier
                    .applyIf({ height == (-1).dp }) { fillMaxHeight() }
                    .applyIf({ height != (-1).dp }) { height(height) }
                    .width(width)
                    .background(color)
        )
    }
}
