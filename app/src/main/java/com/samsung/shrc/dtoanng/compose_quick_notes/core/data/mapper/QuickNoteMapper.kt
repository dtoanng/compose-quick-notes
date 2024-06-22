package com.samsung.shrc.dtoanng.compose_quick_notes.core.data.mapper

import com.samsung.shrc.dtoanng.compose_quick_notes.core.data.local.QuickNoteEntity
import com.samsung.shrc.dtoanng.compose_quick_notes.core.domain.model.QuickNoteItem

fun QuickNoteItem.toQuickNoteEntityForInsert() = QuickNoteEntity(
    title = title,
    description = description,
    imageUrl = imageUrl,
    dateAdded = dateAdded
)

fun QuickNoteItem.toQuickNoteEntityForDelete() = QuickNoteEntity(
    id = id,
    title = title,
    description = description,
    imageUrl = imageUrl,
    dateAdded = dateAdded
)

fun QuickNoteEntity.toQuickNoteItem() = QuickNoteItem(
    id = id ?: 0,
    title = title,
    description = description,
    imageUrl = imageUrl,
    dateAdded = dateAdded
)