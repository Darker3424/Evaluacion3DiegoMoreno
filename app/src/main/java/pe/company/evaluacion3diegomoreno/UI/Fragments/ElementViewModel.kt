package pe.company.evaluacion3diegomoreno.UI.Fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pe.company.evaluacion3diegomoreno.Data.Repository.ProductsRepository
import pe.company.evaluacion3diegomoreno.Model.Product
import pe.company.evaluacion3diegomoreno.Model.getData

class ElementViewModel: ViewModel() {
    val products: MutableLiveData<List<Product>> = MutableLiveData<List<Product>>()
    private val repository = ProductsRepository()

    fun getProducts(){
        val allProducts = getData()
        products.value = allProducts
    }

    fun getProductsFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response = repository.getProducts()
            products.value = response
        }
    }
}