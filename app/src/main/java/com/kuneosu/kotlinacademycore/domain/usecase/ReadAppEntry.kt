package com.kuneosu.kotlinacademycore.domain.usecase

import com.kuneosu.kotlinacademycore.domain.manager.LocalUserManager

import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }
}