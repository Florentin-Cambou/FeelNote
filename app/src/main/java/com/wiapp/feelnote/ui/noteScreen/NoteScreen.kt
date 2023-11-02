package com.wiapp.feelnote.ui.noteScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.wiapp.feelnote.ui.button.ButtonEditNote

@Composable
fun NoteScreen(noteTitle: String? = "Titre Vide", noteDescription: String? =  "Test Description",navController: NavController) {
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
                        if (noteTitle != null) {
                                Text(text = noteTitle)
                        }
                }

                Divider(modifier = Modifier.padding(15.dp))

                Surface(
                        modifier = Modifier
                                .align(Alignment.Start)
                                .padding(horizontal = 15.dp)
                                .fillMaxWidth(),
                        shadowElevation = 18.dp
                ) {
                        if(noteDescription != null) {
                                Text(
                                        modifier = Modifier.padding(8.dp),
                                        text = noteDescription
                                )
                        }
                }
        }

        ButtonEditNote(navController, noteTitle, noteDescription)

}