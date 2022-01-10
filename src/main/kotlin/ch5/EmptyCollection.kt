package ch5

data class Product(val name: String,
                    var price: Double,
                    var onSale: Boolean = false)

fun nameOfProductsOnSale(products: List<Product>) {
    products.filter { it.onSale }
        .map { it.name }
        .joinToString(separator = ",")
}

fun nameOfProductsOnSale_isEmptyCollection(products: List<Product>) {
    products.filter { it.onSale }
        .map { it.name }
        .ifEmpty { listOf("none") }
        .joinToString(separator = ",")
}