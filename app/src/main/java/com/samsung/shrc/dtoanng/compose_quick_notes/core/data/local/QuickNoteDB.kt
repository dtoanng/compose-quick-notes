package com.samsung.shrc.dtoanng.compose_quick_notes.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [QuickNoteEntity::class],
    version = 1
)
abstract class QuickNoteDB : RoomDatabase() {
    abstract val quickNoteDao: IQuickNoteDao
}