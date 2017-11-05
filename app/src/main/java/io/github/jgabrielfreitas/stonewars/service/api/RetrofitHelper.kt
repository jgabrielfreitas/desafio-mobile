package io.github.jgabrielfreitas.stonewars.service.api

import io.github.jgabrielfreitas.stonewars.BuildConfig.STONE_WARS_API
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory.create as gsonConverter

/**
 * Created by JGabrielFreitas on 05/11/2017.
 */

class RetrofitHelper {

    fun createRetrofitInstance(url: String = STONE_WARS_API, client: OkHttpClient = createClientHttp()): Retrofit {
        return Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(gsonConverter())
                .build()
    }

    private fun createClientHttp(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

}
