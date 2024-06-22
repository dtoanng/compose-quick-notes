package com.samsung.shrc.dtoanng.compose_quick_notes.core.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class QuickNoteEntity(
    var title: String,
    var description: String,
    var imageUrl: String,
    var dateAdded: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)
