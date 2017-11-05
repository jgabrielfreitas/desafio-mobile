package io.github.jgabrielfreitas.stonewars.service.api

import io.github.jgabrielfreitas.stonewars.BuildConfig.STONE_WARS_API
import retrofit2.Retrofit

/**
 * Created by JGabrielFreitas on 05/11/2017.
 */

class RetrofitHelper {

    fun createRetrofitInstance(url: String = STONE_WARS_API): Retrofit {
        return Retrofit.Builder()
                       .baseUrl(url)
                       .build()
    }

}
