package fr.isen.karrai.isensmartcompanion.API

import fr.isen.karrai.isensmartcompanion.model.Event
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// ✅ Interface API Retrofit
interface EventsApiService {
    @GET("events.json")
    fun getEvents(): Call<List<Event>>
}

// ✅ Singleton Retrofit pour gérer l'API
object RetrofitInstance {
    private const val BASE_URL = "https://isen-smart-companion-default-rtdb.europe-west1.firebasedatabase.app/"

    val api: EventsApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) // Utilisation de Gson pour convertir le JSON
            .build()
            .create(EventsApiService::class.java)
    }
}

