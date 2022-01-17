package ch9

import java.time.LocalDate

data class Book(
    val isbn: String,
    val title: String,
    val author: String,
    val published: LocalDate
)