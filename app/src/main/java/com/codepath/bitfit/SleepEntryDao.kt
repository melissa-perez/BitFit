package com.codepath.bitfit

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface SleepEntryDao {
    @Query("SELECT * FROM sleep_entry_table")
    fun getAllSleepEntries(): Flow<List<SleepEntryEntity>>

    @Insert
    fun insertSleepEntry(entry: SleepEntryEntity)

    @Query("DELETE FROM sleep_entry_table")
    fun deleteAllSleepEntries()
}