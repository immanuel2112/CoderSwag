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
        Product("IMichael Graphic Beanie", "$18", "hat01"),
        Product("IMichael Hat Black", "$20", "hat02"),
        Product("IMichael Hat White", "$18", "hat03"),
        Product("IMichael Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("IMichael Hoodie Gray", "$28", "hoodie01"),
        Product("IMichael Hoodie Red", "$32", "hoodie02"),
        Product("IMichael Gray Hoodie", "$28", "hoodie03"),
        Product("IMichael Black Hoodie", "$40", "hoodie04")
    )

    val shirts = listOf(
        Product("IMichael Shirt Black", "$18", "shirt01"),
        Product("IMichael Badge Light Gray", "$20", "shirt02"),
        Product("IMichael Logo Shirt Red", "$22", "shirt03"),
        Product("IMichael Hustle", "$22", "shirt04"),
        Product("IMichael Kickflip Studios", "$18", "shirt05")
    )
}