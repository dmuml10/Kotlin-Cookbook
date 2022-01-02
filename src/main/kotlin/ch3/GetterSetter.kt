package ch3


class GetterSetter(val name: String) {

    val isLowPriority
        get() = priority < 3

    var priority = 3
        set(value) {
            field = value.coerceIn(1..5)
        }

}

var myTask = GetterSetter("Name").apply { priority = 4 }

class Task2(val name: String, _priority: Int = DEFAULT_PRIORITY) {

    companion object {
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
    }

    var priority = validPriority(_priority)
        set(value) {
            field = validPriority(value)
        }

    private fun validPriority(p: Int) =
        p.coerceIn(MIN_PRIORITY, MAX_PRIORITY)
}