package com.kuneosu.kotlinacademycore.data.repository

import com.kuneosu.kotlinacademycore.data.source.local.ProblemDao
import com.kuneosu.kotlinacademycore.domain.model.Problem
import com.kuneosu.kotlinacademycore.domain.repository.ProblemRepository
import kotlinx.coroutines.flow.Flow

class ProblemRepositoryImpl(
    private val dao: ProblemDao
) : ProblemRepository {
    override fun getProblems(): Flow<List<Problem>> {
        return dao.getAll()
    }

    override suspend fun selectProblem(id: Int): Problem? {
        return dao.selectProblem(id)
    }

    override suspend fun upsertProblem(problem: Problem) {
        dao.upsert(problem)
    }

    override suspend fun deleteProblem(problem: Problem) {
        dao.delete(problem)
    }
}