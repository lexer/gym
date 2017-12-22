package com.github.lexer.workouts

data class Workout(
        val name: String,
        val breakInterval: Long,
        val exerciseInterval: Long,
        val exercises: List<WorkoutExercise>) {
}