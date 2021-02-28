package jp.techacademy.ryoichi.satoyama.session1_sample1

import com.example.session1_kazan.entity.AssetGroups
import com.example.session1_kazan.entity.Departments
import jp.techacademy.ryoichi.satoyama.session1_sample1.entity.AssetsViews

object LocalData {
//    val departmentList by lazy { JsonParse.fromJson<List<Departments>, MutableList<Departments>>("departments") }
//    val assetGroupList by lazy { JsonParse.fromJson<List<Departments>, MutableList<Departments>>("departments") }
//    val assetsViewList by lazy { JsonParse.fromJson<List<Departments>, MutableList<Departments>>("departments") }
//    lateinit var departmentList = mutableListOf<Departments>()
//    lateinit var assetGroupList = mutableListOf<AssetGroups>()
//    lateinit var assetsViewList = mutableListOf<AssetsViews>()

    var departmentList = mutableListOf<Departments>()
    var assetGroupList = mutableListOf<AssetGroups>()
    var assetsViewList = mutableListOf<AssetsViews>()

    fun load() {
        departmentList.add(0, Departments(-1, "", null))
        departmentList.addAll(JsonParse.fromJson<List<Departments>, MutableList<Departments>>("departments"))
        assetGroupList.add(0, AssetGroups(-1, "", null))
        assetGroupList.addAll(JsonParse.fromJson<List<AssetGroups>, MutableList<AssetGroups>>("AssetGroups"))
    }
}