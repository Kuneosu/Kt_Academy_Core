package com.kuneosu.kotlinacademycore.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Problem(
    @PrimaryKey val id: Int,
    val title: String,
)
