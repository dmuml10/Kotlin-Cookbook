package ch8

import kotlin.properties.Delegates

var watched: Int by Delegates.observable(1) { prop, old, new ->
    println("${prop.name} changed from $old to $new")
}

var checked: Int by Delegates.vetoable(0) { prop, old, new ->
    println("Trying to change ${prop.name} from $old to $new")
    new >= 0
}

fun main() {
    watched = 1
    watched = 2

    checked = -1
    println(checked)
    checked = 2
    println(checked)
}

data class Project(val map: MutableMap<String, Any?>) {
    val name: String by map
    var priority: Int by map
    var completed: Boolean by map
}