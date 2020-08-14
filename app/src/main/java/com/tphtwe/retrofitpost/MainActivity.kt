package com.tphtwe.retrofitpost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tphtwe.retrofitpost.api.ApiClient
import com.tphtwe.retrofitpost.model.City
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var apiClient=ApiClient()
        var call=apiClient.addCity("Hlegu")
        call.enqueue(object :Callback<City>{
            override fun onFailure(call: Call<City>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<City>, response: Response<City>) {
                text.text=response.body()!!.city.city_name
            }

        })
    }
}