package com.wiapp.feelnote.ui.noteListScreen

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.wiapp.feelnote.data.allNote

@Composable
fun LazyVerticalGrid() {
    androidx.compose.foundation.lazy.grid.LazyVerticalGrid(columns = GridCells.Adaptive(150.dp)) {
        items(allNote) {
            notes -> NoteListScreen(notes)
        }
    }
}