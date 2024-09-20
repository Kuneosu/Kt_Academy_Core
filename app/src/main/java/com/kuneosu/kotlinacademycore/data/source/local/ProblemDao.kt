package com.kuneosu.kotlinacademycore.data.source.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kuneosu.kotlinacademycore.domain.model.Problem
import kotlinx.coroutines.flow.Flow

@Dao
interface ProblemDao {
    @Query("SELECT * FROM problem")
    fun getAll(): Flow<List<Problem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(problem: Problem)

    @Delete
    suspend fun delete(problem: Problem)

    @Query("SELECT * FROM problem WHERE id = :id")
    suspend fun selectProblem(id: Int): Problem?

}