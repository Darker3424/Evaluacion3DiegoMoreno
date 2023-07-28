package pe.company.evaluacion3diegomoreno.Data.Repository

import pe.company.evaluacion3diegomoreno.Model.Product
import pe.company.evaluacion3diegomoreno.Data.Retrofit.RetrofitHelper

class ProductsRepository {

    suspend fun getProducts(): List<Product>{
        val response = RetrofitHelper.gotInstance.getAllProducts()
        return response.products
    }
}