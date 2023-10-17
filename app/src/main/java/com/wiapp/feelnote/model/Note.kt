package com.wiapp.feelnote.model

import androidx.annotation.StringRes

data class Note(
    @StringRes val title: Int,
    val description: Int
)
