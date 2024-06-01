package com.glorfindel.lothlorien.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf

private val LothlorienColorsComposition = compositionLocalOf<LothlorienColors> { error("need LothlorienTheme") }

@Composable
@ReadOnlyComposable
fun lothlorienColors() = LothlorienColorsComposition.current

private val LothlorienComponentDefaultsComposition = compositionLocalOf<LothlorienComponentDefaults> { error("need LothlorienTheme") }

@Composable
@ReadOnlyComposable
fun lothlorienComponentDefaults() = LothlorienComponentDefaultsComposition.current

@Composable
fun LothlorienTheme(
    lothlorienColors: LothlorienColors,
    lothlorienComponentDefaults: LothlorienComponentDefaults,
    content: @Composable () -> Unit
) {
    MaterialTheme {
        CompositionLocalProvider(
            LothlorienColorsComposition provides lothlorienColors,
            LothlorienComponentDefaultsComposition provides lothlorienComponentDefaults,
            content = content
        )
    }
}
