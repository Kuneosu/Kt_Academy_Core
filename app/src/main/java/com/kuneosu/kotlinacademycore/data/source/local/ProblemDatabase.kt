package com.kuneosu.kotlinacademycore.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kuneosu.kotlinacademycore.domain.model.Problem

@Database(entities = [Problem::class], version = 1)
abstract class ProblemDatabase : RoomDatabase() {

    abstract val problemDao: ProblemDao
}