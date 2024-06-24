package com.samsung.shrc.dtoanng.compose_quick_notes.core.data.repository

import com.samsung.shrc.dtoanng.compose_quick_notes.core.data.local.QuickNoteDB
import com.samsung.shrc.dtoanng.compose_quick_notes.core.data.mapper.toQuickNoteEntityForDelete
import com.samsung.shrc.dtoanng.compose_quick_notes.core.data.mapper.toQuickNoteEntityForInsert
import com.samsung.shrc.dtoanng.compose_quick_notes.core.data.mapper.toQuickNoteItem
import com.samsung.shrc.dtoanng.compose_quick_notes.core.domain.model.QuickNoteItem
import com.samsung.shrc.dtoanng.compose_quick_notes.core.domain.repository.IQuickNoteRepository

class QuickNoteRepositoryImpl(quickNoteDB: QuickNoteDB) : IQuickNoteRepository {

    private val quickNoteDao = quickNoteDB.quickNoteDao

    override suspend fun upsertQuickNote(quickNoteItem: QuickNoteItem) {
        quickNoteDao.upsertQuickNoteEntity(quickNoteItem.toQuickNoteEntityForInsert())
    }

    override suspend fun deleteQuickNote(quickNoteItem: QuickNoteItem) {
        quickNoteDao.deleteQuickNoteEntity(quickNoteItem.toQuickNoteEntityForDelete())
    }

    override suspend fun getAllNotes(): List<QuickNoteItem> {
        return quickNoteDao.getAllQuickNoteEntities().map { quickNoteEntity ->
            quickNoteEntity.toQuickNoteItem()
        }
    }
}