package pe.company.evaluacion3diegomoreno.Model

data class Product (
    val id: Int,
    val firstName: String,
    val lastName: String,
    val fullName: String,
    val title: String,
    val family: String
)

fun getData(): List<Product> = listOf(
    Product(3, "Jon", "Snow", "Jon Snow", "King of the North", "House Stark")
)