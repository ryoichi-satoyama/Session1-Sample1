package com.example.session1_kazan.entity

import com.google.gson.annotations.SerializedName
import java.util.*

data class Assets(
    @SerializedName("ID")
    val id: Long,
    @SerializedName("AssetSN")
    val assetSn: String,
    @SerializedName("AssetName")
    val assetName: String,
    @SerializedName("DepartmentLocationID")
    val departmentLocationId: Long,
    @SerializedName("EmployeeID")
    val employeeId: Long,
    @SerializedName("AssetGroupID")
    val assetGroupId: Long,
    @SerializedName("Description")
    val description: String,
    @SerializedName("WarrantyDate")
    val warrantyDate: Date)
