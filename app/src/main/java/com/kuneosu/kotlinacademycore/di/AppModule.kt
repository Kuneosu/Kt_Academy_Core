package com.kuneosu.kotlinacademycore.di

import android.app.Application
import androidx.room.Room
import com.kuneosu.kotlinacademycore.data.manager.LocalUserManagerImpl
import com.kuneosu.kotlinacademycore.data.repository.ProblemRepositoryImpl
import com.kuneosu.kotlinacademycore.data.source.local.ProblemDao
import com.kuneosu.kotlinacademycore.data.source.local.ProblemDatabase
import com.kuneosu.kotlinacademycore.domain.manager.LocalUserManager
import com.kuneosu.kotlinacademycore.domain.repository.ProblemRepository
import com.kuneosu.kotlinacademycore.domain.usecase.appentry.AppEntryUseCases
import com.kuneosu.kotlinacademycore.domain.usecase.appentry.ReadAppEntry
import com.kuneosu.kotlinacademycore.domain.usecase.appentry.SaveAppEntry
import com.kuneosu.kotlinacademycore.domain.usecase.problem.DeleteProblem
import com.kuneosu.kotlinacademycore.domain.usecase.problem.GetProblem
import com.kuneosu.kotlinacademycore.domain.usecase.problem.ProblemUseCases
import com.kuneosu.kotlinacademycore.domain.usecase.problem.SelectProblem
import com.kuneosu.kotlinacademycore.domain.usecase.problem.UpsertProblem
import com.kuneosu.kotlinacademycore.util.Constants.PROBLEM_DATABASE_NAME
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


    @Provides
    @Singleton
    fun provideProblemRepository(
        problemDao: ProblemDao
    ): ProblemRepository = ProblemRepositoryImpl(problemDao)

    @Provides
    @Singleton
    fun provideProblemUseCases(
        problemRepository: ProblemRepository
    ): ProblemUseCases {
        return ProblemUseCases(
            getProblems = GetProblem(problemRepository),
            selectProblem = SelectProblem(problemRepository),
            upsertProblem = UpsertProblem(problemRepository),
            deleteProblem = DeleteProblem(problemRepository)
        )
    }

    @Provides
    @Singleton
    fun provideProblemDatabase(
        application: Application
    ): ProblemDatabase {
        return Room.databaseBuilder(
            context = application,
            klass = ProblemDatabase::class.java,
            name = PROBLEM_DATABASE_NAME,
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideProblemDao(
        problemDatabase: ProblemDatabase
    ): ProblemDao = problemDatabase.problemDao


}