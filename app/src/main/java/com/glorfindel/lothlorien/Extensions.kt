package com.glorfindel.lothlorien

import androidx.compose.ui.Modifier

internal fun Modifier.applyIf(
    predicate: () -> Boolean,
    apply: Modifier.() -> Modifier
): Modifier {
    return if (predicate()) {
        apply(this)
    } else {
        this
    }
}
