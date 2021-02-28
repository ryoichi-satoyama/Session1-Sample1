package jp.techacademy.ryoichi.satoyama.session1_sample1

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken

object JsonParse {
    val gson = GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create()
    inline fun <reified T, E> fromJson(site: String): E {
        return gson.fromJson(Api.getData(site), object : TypeToken<T>(){}.type)
    }
}