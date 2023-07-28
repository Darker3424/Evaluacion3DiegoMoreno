package pe.company.evaluacion3diegomoreno.Model

data class Product (
    val id: Int,
    val firstName: String,
    val lastName: String,
    val fullName: String,
    val title: String,
    val family: String,
    val isFavorite: Boolean,
    val imgUrl: String = ""
)

fun getData(): List<Product> = listOf(
    Product(0, "Daenerys", "Targaryen", "Daenerys Targaryen", "Mother of Dragons", "House Targaryen", false,"https://thronesapi.com/assets/images/daenerys.jpg"),
    Product(1, "Samwell", "Tarly", "Samwell Tarly", "Maester", "House Tarly", true, "https://thronesapi.com/assets/images/sam.jpg"),
    Product(2, "Jon", "Snow", "Jon Snow", "King of the North", "House Stark", true, "https://thronesapi.com/assets/images/jon-snow.jpg"),
    Product(3, "Arya", "Stark", "Arya Stark", "No One", "House Stark", true, "https://thronesapi.com/assets/images/arya-stark.jpg"),
    Product(4, "Sansa", "Stark", "Sansa Stark", "Lady of Winterfell", "House Stark", false, "https://thronesapi.com/assets/images/sansa-stark.jpeg"),
    Product(5, "Brandon", "Stark", "Brandon Stark", "Lord of Winterfell", "House Stark", false, "https://thronesapi.com/assets/images/bran-stark.jpg"),
    Product(6, "Ned", "Stark", "Ned Stark", "Lord of Winterfell", "House Stark", false, "https://thronesapi.com/assets/images/ned-stark.jpg"),
    Product(7, "Robert", "Baratheon", "Robert Baratheon", "Lord of the Seven Kingdoms", "House Baratheon", false, "https://thronesapi.com/assets/images/robert-baratheon.jpeg")
)