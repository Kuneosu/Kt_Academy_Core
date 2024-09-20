package com.kuneosu.kotlinacademycore.domain.repository

import com.kuneosu.kotlinacademycore.domain.model.Problem
import kotlinx.coroutines.flow.Flow

interface ProblemRepository {

    fun getProblems(): Flow<List<Problem>>

    suspend fun selectProblem(id: Int): Problem?

    suspend fun upsertProblem(problem: Problem)

    suspend fun deleteProblem(problem: Problem)
}