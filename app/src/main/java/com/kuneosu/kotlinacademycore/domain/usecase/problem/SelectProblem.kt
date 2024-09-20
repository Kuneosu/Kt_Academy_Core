package com.kuneosu.kotlinacademycore.domain.usecase.problem

import com.kuneosu.kotlinacademycore.domain.repository.ProblemRepository

class SelectProblem(
    private val repository: ProblemRepository
) {
    suspend fun invoke(id: Int) = repository.selectProblem(id)
}