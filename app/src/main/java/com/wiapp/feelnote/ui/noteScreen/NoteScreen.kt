package com.wiapp.feelnote.ui.noteScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun NoteScreen(noteTitle: String? = "Titre Vide", noteDescription: String? =  "Test Description") {
        Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
        ) {
                Box(
                        contentAlignment = Alignment.Center
                ) {
                        if (noteTitle != null) {
                                Text(text = noteTitle)
                        }
                }

                Surface() {
                        if(noteDescription != null) {
                                Text(text = noteDescription)
                        }
                }
        }

}