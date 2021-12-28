package ch2

import java.text.NumberFormat

fun addProduct(name: String, price: Double = 0.0, desc: String? = null) =
    "Adding product with $name, ${desc ?: "None" }, and " +
            NumberFormat.getCurrencyInstance().format(price)