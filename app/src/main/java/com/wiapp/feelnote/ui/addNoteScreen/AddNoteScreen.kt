package com.wiapp.feelnote.ui.addNoteScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.wiapp.feelnote.ui.button.ButtonValidNote

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddNoteScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        //.background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            OutlinedTextField(
                value = "Note Titre", onValueChange = {}
            )
        }

        Divider(modifier = Modifier.padding(15.dp))

        Surface(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(horizontal = 15.dp)
                .fillMaxWidth(),
            shadowElevation = 18.dp
        ) {
            OutlinedTextField(value = "Note Test", onValueChange = {})
        }
    }
    ButtonValidNote()
}