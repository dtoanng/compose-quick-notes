package com.samsung.shrc.dtoanng.compose_quick_notes.core.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface QuickNoteDao {

    @Upsert
    suspend fun upsertQuickNoteEntity(quickNoteEntity: QuickNoteEntity)

    @Query("SELECT * FROM quickNoteEntity")
    suspend fun getAllQuickNoteEntities(): List<QuickNoteEntity>

    @Delete
    suspend fun deleteQuickNoteEntity(quickNoteEntity: QuickNoteEntity)
}