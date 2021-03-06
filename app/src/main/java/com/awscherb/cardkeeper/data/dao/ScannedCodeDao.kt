package com.awscherb.cardkeeper.data.dao

import androidx.room.*
import com.awscherb.cardkeeper.data.model.ScannedCode
import kotlinx.coroutines.flow.Flow

@Dao
interface ScannedCodeDao {

    @Query("SELECT * FROM scannedCode WHERE id = :id LIMIT 1")
    suspend fun getScannedCode(id: Int): ScannedCode

    @Query("SELECT * FROM scannedCode")
    fun listScannedCodes(): Flow<List<ScannedCode>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCode(code: ScannedCode): Long

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateCode(code: ScannedCode)

    @Delete
    suspend fun deleteCode(code: ScannedCode)
}