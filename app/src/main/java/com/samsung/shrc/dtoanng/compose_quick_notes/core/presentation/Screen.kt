package com.samsung.shrc.dtoanng.compose_quick_notes.core.presentation

sealed interface Screen {
    data object NoteList: Screen
    data object AddNote: Screen
}