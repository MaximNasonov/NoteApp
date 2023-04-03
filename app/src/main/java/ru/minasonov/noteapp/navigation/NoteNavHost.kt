package ru.minasonov.noteapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.minasonov.noteapp.screens.Add
import ru.minasonov.noteapp.screens.Main
import ru.minasonov.noteapp.screens.Note
import ru.minasonov.noteapp.screens.Start

sealed class NavRoute(val rote: String){
    object Start: NavRoute("start_screen")
    object Main: NavRoute("main_screen")
    object Add: NavRoute("add_screen")
    object Note: NavRoute("note_screen")

}


@Composable
fun NoteNavHost(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.Start.rote){
        composable(NavRoute.Start.rote){ Start(navController = navController)}
        composable(NavRoute.Main.rote){ Main(navController = navController)}
        composable(NavRoute.Add.rote){ Add(navController = navController)}
        composable(NavRoute.Note.rote){ Note(navController = navController)}


        }
    }

