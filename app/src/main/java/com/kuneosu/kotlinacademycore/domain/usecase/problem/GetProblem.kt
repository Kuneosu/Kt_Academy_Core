package com.kuneosu.kotlinacademycore.domain.usecase.problem

import com.kuneosu.kotlinacademycore.domain.repository.ProblemRepository

class GetProblem(
    private val repository: ProblemRepository
) {
    operator fun invoke() = repository.getProblems()
}