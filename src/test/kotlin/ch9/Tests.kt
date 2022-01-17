package ch9

import org.junit.jupiter.api.*
import java.time.LocalDate

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JUnit5ListTests {
    private val strings =
        listOf("this", "is", "a", "list", "of", "strings")

    private lateinit var modifiable: MutableList<Int>

    @BeforeEach
    fun setUp() {
        modifiable = mutableListOf(3, 1, 4, 1, 5)
        println("Before: $modifiable")
    }

    @AfterEach
    fun finish() {
        println("After: $modifiable")
    }

    @Test
    internal fun `test book the hard way`() {
        val date = LocalDate.now()
        val book = Book("1935182943", "Making Java Groovy", "Ken Kousen", date)
        assert(book.isbn == "1935182943")
        assert(book.title == "Making Java Groovy")
        assert(book.author == "Ken Kousen")
        assert(book.published == date)
    }

}