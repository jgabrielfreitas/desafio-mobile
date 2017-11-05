package io.github.jgabrielfreitas.stonewars.service.interfaces

import io.github.jgabrielfreitas.stonewars.models.ProductResponseApi
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by JGabrielFreitas on 05/11/2017.
 */

interface ProductInterface {

    @GET("stone-pagamentos/desafio-mobile/master/products.json")
    fun allProducts(): Call<ProductResponseApi>
}
