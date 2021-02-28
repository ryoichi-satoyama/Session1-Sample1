package com.example.session1_kazan.entity

import com.google.gson.annotations.SerializedName

data class AssetGroups(
    @SerializedName("ID")
    val id: Long,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Assets")
    val assets: List<Any>?) {
    override fun toString(): String {
        return name
    }
}