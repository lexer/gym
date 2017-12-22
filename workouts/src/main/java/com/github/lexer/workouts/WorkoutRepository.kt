package com.github.lexer.workouts

import io.reactivex.Observable

interface WorkoutRepository {
    fun getAll(): Observable<List<Workout>>
}