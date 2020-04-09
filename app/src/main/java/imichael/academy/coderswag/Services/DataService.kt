package imichael.academy.coderswag.Services

import imichael.academy.coderswag.Model.Category
import imichael.academy.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("IMichael Graphic Beanie", "$18", "hat1"),
        Product("IMichael Hat Black", "$20", "hat2"),
        Product("IMichael Hat White", "$18", "hat3"),
        Product("IMichael Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("IMichael Hoodie Gray", "$28", "hoodie1"),
        Product("IMichael Hoodie Red", "$32", "hoodie2"),
        Product("IMichael Gray Hoodie", "$28", "hoodie3"),
        Product("IMichael Black Hoodie", "$40", "hoodie4")
    )

    val shirts = listOf(
        Product("IMichael Shirt Black", "$18", "shirt1"),
        Product("IMichael Badge Light Gray", "$20", "shirt2"),
        Product("IMichael Logo Shirt Red", "$22", "shirt3"),
        Product("IMichael Hustle", "$22", "shirt4"),
        Product("IMichael Kickflip Studios", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when (category) {
            "Shirts" -> shirts
            "Hats" -> hats
            "Hoodies" -> hoodies
            else -> digitalGoods
        }
    }

}