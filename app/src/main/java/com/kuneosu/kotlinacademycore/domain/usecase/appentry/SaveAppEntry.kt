package com.kuneosu.kotlinacademycore.domain.usecase.appentry

import com.kuneosu.kotlinacademycore.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}