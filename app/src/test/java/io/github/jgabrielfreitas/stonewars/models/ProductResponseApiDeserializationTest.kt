package io.github.jgabrielfreitas.stonewars.models

import com.google.gson.Gson
import io.github.jgabrielfreitas.stonewars.ProductBaseTest
import io.github.jgabrielfreitas.stonewars.ProductBaseTest.Companion.productResonseApi
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by JGabrielFreitas on 16/10/2017.
 */
class ProductResponseApiDeserializationTest {

    var productList: ProductResponseApi? = null

    @Before
    fun init() { productList = deserialize_product() }

    @Test
    fun product_deserialization_not_null() {

        assertNotNull(productList)
    }

    @Test
    fun product_deserialization_not_empty() {

        assertTrue(!productList!!.isEmpty())
    }

    @Test
    fun product_deserialization_at_last_two_itens() {

        assertTrue(productList!!.size > 2)
    }

    private fun deserialize_product() : ProductResponseApi? {

        return Gson().fromJson(productResonseApi, ProductResponseApi::class.java)
    }
}
