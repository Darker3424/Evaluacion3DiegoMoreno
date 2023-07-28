package pe.company.evaluacion3diegomoreno.Retrofit

import retrofit2.http.GET

interface GotInstance {
    @GET("")
    fun getAllProducts()
}