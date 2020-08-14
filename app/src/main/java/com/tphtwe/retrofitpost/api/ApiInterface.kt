package com.tphtwe.retrofitpost.api

import com.tphtwe.retrofitpost.model.City
import com.tphtwe.retrofitpost.model.CityX
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiInterface{
    @FormUrlEncoded
    @POST("city")
    fun getCity(
        @Field("city_name")cityName:String
    ):Call<City>

}