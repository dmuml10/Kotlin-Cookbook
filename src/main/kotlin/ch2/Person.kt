package ch2

class Person(val first: String,
             val middle: String?,
             val last: String)

val jkRowling = Person("Joanne", null, "Rowling")
val northWest = Person("North", null, "West")

class Test {
    fun checkPerson() {
        val p = Person(first = "North", middle = null, last = "West")
        if (p.middle != null) {
            val middleNameLength = p.middle.length
        }

        if (p.middle != null) {
            //val middleNameLength = p.middle.length  1
            val middleNameLength = p.middle!!.length
        }

        // Safe call; the resulting type is Int?
        val middleNameLength = p.middle?.length

        // Elvis operator (?:), returns 0 if middle is null
        val middleNameLengthDefault = p.middle?.length ?: 0

        // The cast will either succeed, resulting in a Person, or will fail, and p1 will receive null as a result.
        val p1 = p as? Person

    }
}
