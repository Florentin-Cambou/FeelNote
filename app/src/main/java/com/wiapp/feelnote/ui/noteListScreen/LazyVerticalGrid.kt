package com.wiapp.feelnote.ui.noteListScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.wiapp.feelnote.data.allNote
import com.wiapp.feelnote.navigation.ScreenPath

@Composable
fun LazyVerticalGrid(navController: NavHostController) {
    Column {
        androidx.compose.foundation.lazy.grid.LazyVerticalGrid(columns = GridCells.Adaptive(150.dp)) {
            items(allNote) {
                    notes -> ItemNote(notes = notes, onElementClick = { noteTitle,noteDescription ->
                navController.navigate("${ScreenPath.NoteScreen.itineraire}/$noteTitle/$noteDescription")
            })
            }
        }
        ButtonAddNote()
    }
}

