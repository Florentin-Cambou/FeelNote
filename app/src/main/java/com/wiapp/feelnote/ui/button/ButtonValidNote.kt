package com.wiapp.feelnote.ui.button

import androidx.compose.material.icons.rounded.Done

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonValidNote() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ){
        IconButton(
            onClick = { /*TODO*/ }) {
            Icon(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        shape = RoundedCornerShape(40),
                        color = Color.Cyan
                    ),
                imageVector = Icons.Rounded.Done, contentDescription = Icons.Rounded.Done.name
            )
        }
    }
}