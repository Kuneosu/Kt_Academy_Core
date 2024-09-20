package com.kuneosu.kotlinacademycore.domain.usecase.problem

data class ProblemUseCases(
    val upsertProblem: UpsertProblem,
    val selectProblem: SelectProblem,
    val deleteProblem: DeleteProblem,
    val getProblems: GetProblem
)