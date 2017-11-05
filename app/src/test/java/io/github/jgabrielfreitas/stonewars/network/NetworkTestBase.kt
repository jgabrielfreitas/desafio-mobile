package io.github.jgabrielfreitas.stonewars.network

import org.junit.Before

import io.github.jgabrielfreitas.stonewars.service.api.RetrofitHelper
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import retrofit2.Retrofit

/**
 * Created by JGabrielFreitas on 05/11/2017.
 */

open class NetworkTestBase {

    lateinit var mockWebServer: MockWebServer
    lateinit var retrofit: Retrofit

    @Before
    fun init() {
        mockWebServer = MockWebServer()
        retrofit = RetrofitHelper().createRetrofitInstance(mockWebServer.url("").toString())
    }

    @After
    fun finish_test() {
        mockWebServer.shutdown()
    }
}
