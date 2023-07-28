package pe.company.evaluacion3diegomoreno.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    object RetrofitHelper {
        private val retrofitInstance: Retrofit = Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val gotInstance = retrofitInstance.create(GotInstance::class.java)
    }

}