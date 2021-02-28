package com.example.session1_kazan.entity

import com.google.gson.annotations.SerializedName

data class Departments(
    @SerializedName("ID")
    var id: Long,
    @SerializedName("Name")
    var name: String,
    @SerializedName("DepartmentLocations")
    var departmentLocations: List<Any>?) {
    override fun toString(): String {
        return name
    }
}