package com.wiapp.feelnote.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.wiapp.feelnote.ui.noteListScreen.LazyVerticalGrid
import com.wiapp.feelnote.ui.noteScreen.NoteScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenPath.LazyVerticalGrid.itineraire) {
        composable(ScreenPath.LazyVerticalGrid.itineraire) {
            LazyVerticalGrid(navController)
        }
        composable(ScreenPath.NoteScreen.itineraire + "/{noteTitle}/{noteDescription}",
            arguments = listOf(
                navArgument("noteTitle") {
                    type = NavType.StringType
                },
                navArgument("noteDescription") {
                    type =NavType.StringType
                }

            )
            ) {
            NoteScreen(it.arguments?.getString("noteTitle")!!)
            val noteTitle = it.arguments?.getString("noteTitle")
            val noteDescription = it.arguments?.getString("noteDescription")

            NoteScreen(noteTitle,noteDescription)
        }
    }
}