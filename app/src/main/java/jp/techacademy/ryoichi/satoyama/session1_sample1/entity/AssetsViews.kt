package jp.techacademy.ryoichi.satoyama.session1_sample1.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class AssetsViews(
    @SerializedName("AssetID")
    val assetId: Long,
    @SerializedName("AssetSN")
    val assetSn: String,
    @SerializedName("AssetName")
    val assetName: String,
    @SerializedName("DepartmentLocationID")
    val departmentLocationId: Long,
    @SerializedName("Department")
    val departmentName: String,
    @SerializedName("AssetGroup")
    val assetGroupName: String,
    @SerializedName("Location")
    val locationName: String,
    @SerializedName("Description")
    val description: String,
    @SerializedName("FirstName")
    val firstname: String,
    @SerializedName("WarrantyDate")
    val warrantyDate: Date
): Serializable {

}