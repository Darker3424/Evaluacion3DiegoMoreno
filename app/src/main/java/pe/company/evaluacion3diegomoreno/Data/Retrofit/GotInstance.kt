package pe.company.evaluacion3diegomoreno.Data.Retrofit

import pe.company.evaluacion3diegomoreno.Data.Response.ProductListResponse
import retrofit2.http.GET

interface GotInstance {
    @GET("/api/v2/Characters")
    suspend fun getAllProducts(): ProductListResponse
}