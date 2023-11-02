package com.wiapp.feelnote.navigation

sealed class ScreenPath(val itineraire: String) {
    object LazyVerticalGrid: ScreenPath("lazy_vertical_grid")
    object AddNoteScreen: ScreenPath("add_note_screen")
    object NoteScreen: ScreenPath("note_screen")

    object EditNoteScreen: ScreenPath("edit_note_screen")
}
