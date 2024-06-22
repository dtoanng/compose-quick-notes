package com.samsung.shrc.dtoanng.compose_quick_notes.core.domain.model

data class QuickNoteItem(
    var title: String,
    var description: String,
    var imageUrl: String,
    var dateAdded: Long,
    val id: Int = 0,
)
