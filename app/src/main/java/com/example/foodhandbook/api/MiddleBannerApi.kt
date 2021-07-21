package com.example.foodhandbook.api

import com.example.foodhandbook.model.Middle_banner
import retrofit2.Call
import retrofit2.http.GET

interface MiddleBannerApi {

    @GET("/api/unknown?fbclid=IwAR0kgHAQvfb1LUiv3Vq0CLDaPSpZICmPh47mvR6u5Br1_gM5r7LXwk4WFT4")
    fun getMiddleNote() : Call
}