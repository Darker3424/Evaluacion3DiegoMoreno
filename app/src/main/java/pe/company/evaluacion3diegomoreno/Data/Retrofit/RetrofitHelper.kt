package pe.company.evaluacion3diegomoreno.Data.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object RetrofitHelper {
    private val retrofitInstance: Retrofit = Retrofit.Builder()
        .baseUrl("https://thronesapi.com/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val gotInstance = retrofitInstance.create(GotInstance::class.java)
}