package com.kuneosu.kotlinacademycore.domain.usecase.problem

import com.kuneosu.kotlinacademycore.domain.model.Problem
import com.kuneosu.kotlinacademycore.domain.repository.ProblemRepository

class UpsertProblem(
    private val repository: ProblemRepository
) {
    suspend operator fun invoke(problem: Problem) = repository.upsertProblem(problem)
}