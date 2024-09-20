package com.kuneosu.kotlinacademycore.domain.usecase.problem

import com.kuneosu.kotlinacademycore.domain.model.Problem
import com.kuneosu.kotlinacademycore.domain.repository.ProblemRepository

class DeleteProblem(
    private val repository: ProblemRepository
) {
    suspend fun invoke(problem: Problem) = repository.deleteProblem(problem)
}