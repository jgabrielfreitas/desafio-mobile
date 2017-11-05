package io.github.jgabrielfreitas.stonewars.network

import io.github.jgabrielfreitas.stonewars.models.ProductResponseApi
import io.github.jgabrielfreitas.stonewars.service.interfaces.ProductInterface
import okhttp3.mockwebserver.MockResponse
import org.junit.Assert.assertNotNull
import org.junit.Test
import retrofit2.Call
import io.github.jgabrielfreitas.stonewars.ProductBaseTest.Companion.productResonseApi as mockResponseApi

/**
 * Created by JGabrielFreitas on 05/11/2017.
 */

class Products : NetworkTestBase() {

    @Test
    fun get_all_products_from_api() {

        mockWebServer.enqueue(MockResponse().setBody(mockResponseApi))

        val productInterface = retrofit.create(ProductInterface::class.java)
        val productsCall: Call<ProductResponseApi> = productInterface.allProducts()
        assertNotNull(productsCall.execute())
    }
}
