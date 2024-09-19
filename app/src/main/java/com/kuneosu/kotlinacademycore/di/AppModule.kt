package com.kuneosu.kotlinacademycore.di

import android.app.Application
import com.kuneosu.kotlinacademycore.data.manager.LocalUserManagerImpl
import com.kuneosu.kotlinacademycore.domain.manager.LocalUserManager
import com.kuneosu.kotlinacademycore.domain.usecase.AppEntryUseCases
import com.kuneosu.kotlinacademycore.domain.usecase.ReadAppEntry
import com.kuneosu.kotlinacademycore.domain.usecase.SaveAppEntry
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
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) =
        AppEntryUseCases(
            readAppEntry = ReadAppEntry(localUserManager),
            saveAppEntry = SaveAppEntry(localUserManager)
        )
}