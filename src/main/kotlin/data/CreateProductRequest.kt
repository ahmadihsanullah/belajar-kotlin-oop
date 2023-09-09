package data

import annotation.NotBlank

data class CreateProductRequest(
    @NotBlank
    val name: String,
    @NotBlank
    val description: String,
    @NotBlank
    val price: Long
)

data class CreateCategoryProduct(
    @NotBlank
    val name: String,
    @NotBlank
    val status: String,
)
