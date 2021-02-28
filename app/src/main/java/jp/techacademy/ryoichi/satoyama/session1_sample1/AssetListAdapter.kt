package jp.techacademy.ryoichi.satoyama.session1_sample1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import jp.techacademy.ryoichi.satoyama.session1_sample1.entity.AssetsViews
import kotlinx.android.synthetic.main.list_assets.view.*

class AssetListAdapter(context: Context): BaseAdapter() {
    var mList = mutableListOf<AssetsViews>()

    var mLayoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        var view = convertView
//        if(view == null) {
//            view = mLayoutInflater.inflate(R.layout.list_assets, parent, false)
//        }

        val view = convertView ?: mLayoutInflater.inflate(R.layout.list_assets, parent, false)

        val asset = mList[position]
        view.assetNameTextView.text = asset.assetName
        view.assetSnTextView.text = asset.assetSn
        view.departmentTextView.text = asset.departmentName

        return view
    }

    override fun getItem(position: Int): Any {
        return mList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return mList.size
    }

    fun setList(list: MutableList<AssetsViews>) {
        this.mList = list
        notifyDataSetChanged()
    }
}