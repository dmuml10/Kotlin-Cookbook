package ch3

class Customer(val name: String) {
    private var _messages: List<String>? = null

    val messagesLazy: List<String> by lazy { loadMessages() }

    val messages: List<String>
    get() {
        if (_messages == null) {
            _messages = loadMessages()
        }
        return _messages!!
    }

    private fun loadMessages(): MutableList<String> =
        mutableListOf(
            "Initial contact",
            "Convinced them to use Kotlin",
            "Sold training class. Sweet."
        ).also { println("Loaded messages") }
}