package jp.techacademy.ryoichi.satoyama.session1_sample1

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor

object Api {
    private val URL = "http://10.0.2.2/api/"
    fun getData(name: String): String {
        val url = StringBuilder()
            .append(URL)
            .append(name)
            .toString()
        val client = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
        val request = Request.Builder()
            .url(url)
            .build()

        var response: Response = client.newCall(request).execute()
        return response.body?.string().toString()
    }
}