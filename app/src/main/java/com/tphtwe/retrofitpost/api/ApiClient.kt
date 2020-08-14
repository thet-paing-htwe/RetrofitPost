package com.tphtwe.retrofitpost.api

import com.google.gson.Gson
import com.tphtwe.retrofitpost.model.City
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    var BaseUrl="http://food-delivery-shwe-sin-soe.khaingthinkyi.me/api/setup/"
    var apiInterface:ApiInterface
    init {
        var retrofit=Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory(GsonConverterFactory.create()).build()
        apiInterface=retrofit.create(ApiInterface::class.java)
    }
    fun addCity(cityName:String):Call<City>{
        return apiInterface.getCity(cityName)
    }
}