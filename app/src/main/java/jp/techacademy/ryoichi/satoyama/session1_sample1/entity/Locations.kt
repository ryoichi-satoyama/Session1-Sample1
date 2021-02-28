package com.example.session1_kazan.entity

import com.google.gson.annotations.SerializedName

data class Locations(
    @SerializedName("ID")
    val id: Long,
    @SerializedName("Name")
    val name: String,
    @SerializedName("DepartmentLocations")
    var departmentLocations: List<Any>?) {
    override fun toString(): String {
        return name
    }
}