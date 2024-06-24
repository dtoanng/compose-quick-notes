package com.samsung.shrc.dtoanng.compose_quick_notes.core.domain.repository

import com.samsung.shrc.dtoanng.compose_quick_notes.core.domain.model.QuickNoteItem

interface IQuickNoteRepository {
    suspend fun upsertQuickNote(quickNoteItem: QuickNoteItem)
    suspend fun deleteQuickNote(quickNoteItem: QuickNoteItem)
    suspend fun getAllNotes(): List<QuickNoteItem>
}