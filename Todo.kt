package com.thousif.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date,
)

fun getFakeTodo(): List<Todo>{
    return listOf<Todo>(
        Todo(1, "Todo 1", Date.from(Instant.now())),
        Todo(2, "Todo 2", Date.from(Instant.now())),
        Todo(3, "Todo 3", Date.from(Instant.now())),
        Todo(3, "Todo 3", Date.from(Instant.now())),

    )
}