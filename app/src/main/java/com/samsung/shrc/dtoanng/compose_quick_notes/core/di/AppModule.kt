package com.samsung.shrc.dtoanng.compose_quick_notes.core.di

import android.app.Application
import androidx.room.Room
import com.samsung.shrc.dtoanng.compose_quick_notes.core.data.local.IQuickNoteDao
import com.samsung.shrc.dtoanng.compose_quick_notes.core.data.local.QuickNoteDB
import com.samsung.shrc.dtoanng.compose_quick_notes.core.data.repository.QuickNoteRepositoryImpl
import com.samsung.shrc.dtoanng.compose_quick_notes.core.domain.repository.IQuickNoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideQuickNoteDB(application: Application): QuickNoteDB {
        return Room.databaseBuilder(
            application,
            QuickNoteDB::class.java,
            "quick_notes_db.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideQuickNoteRepository(quickNoteDao: IQuickNoteDao): IQuickNoteRepository {
        return QuickNoteRepositoryImpl(quickNoteDao)
    }
}