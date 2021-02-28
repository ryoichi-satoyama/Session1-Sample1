package com.example.session1_kazan.entity

import com.google.gson.annotations.SerializedName

data class Employees(
    @SerializedName("ID")
    val id: Long,
    @SerializedName("LastName")
    val lastName: String,
    @SerializedName("FirstName")
    val firstName: String,
    @SerializedName("Phone")
    val phone: String
) {
    override fun toString(): String {
//        return "$firstName $lastName"
        return firstName
    }
}