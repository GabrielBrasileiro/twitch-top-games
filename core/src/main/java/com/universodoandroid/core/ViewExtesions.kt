package com.universodoandroid.core

import android.view.View
import android.view.View.*

fun View.show(show: Boolean) {
    visibility = if (show) { VISIBLE } else { GONE }
}