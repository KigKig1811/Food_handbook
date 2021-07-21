package com.example.foodhandbook

import com.example.foodhandbook.api.MiddleBannerApi
import com.example.foodhandbook.model.Middle_banner
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AppConfig {
    const val BASE_URL = "https://reqres.in"

     fun getMiddleBanner(){
        val retrofitBuilder   = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(MiddleBannerApi::class.java)

         val retrofitData = retrofitBuilder.getMiddleNote()

         retrofitData.enqueue(object : Callback<List<Middle_banner>?> {
             override fun onResponse(
                 call: Call<List<Middle_banner>?>,
                 response: Response<List<Middle_banner>?>
             ) {
                 TODO("Not yet implemented")
             }

             override fun onFailure(call: Call<List<Middle_banner>?>, t: Throwable) {
                 TODO("Not yet implemented")
             }
         })
    }
}