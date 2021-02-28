package jp.techacademy.ryoichi.satoyama.session1_sample1

import android.app.DatePickerDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import com.example.session1_kazan.entity.AssetGroups
import com.example.session1_kazan.entity.Departments
import jp.techacademy.ryoichi.satoyama.session1_sample1.entity.AssetsViews
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
    var departmentList = mutableListOf<Departments>()
    var assetGroupsList = mutableListOf<AssetGroups>()

    lateinit var departmentAdapter: ArrayAdapter<Departments>
    lateinit var assetGroupsAdapter: ArrayAdapter<AssetGroups>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder = StrictMode.ThreadPolicy.Builder()
        builder.permitAll()
        StrictMode.setThreadPolicy(builder.build())

        fab.setOnClickListener {
            val intent = Intent(this, AssetInfoActivity::class.java)
            startActivity(intent)
        }

        LocalData.load()

//        departmentList = JsonParse.fromJson<List<Departments>, MutableList<Departments>>("departments")
//        departmentList.add(0, Departments(-1, "", null))
//        departmentAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, departmentList)
        departmentAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, LocalData.departmentList)
        departmentSpinner.adapter = departmentAdapter

//        assetGroupsList = JsonParse.fromJson<List<AssetGroups>, MutableList<AssetGroups>>("assetGroups")
//        assetGroupsList.add(0, AssetGroups(-1, "", null))
//        assetGroupsAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, assetGroupsList)
        assetGroupsAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, LocalData.assetGroupList)
        assetGroupSpinner.adapter = assetGroupsAdapter
//
//        startDateEditText.setOnClickListener { showDatePickerDialog(true) }
//        endDateEditText.setOnClickListener { showDatePickerDialog(false) }

        startDateEditText.setOnClickListener { showDatePickerDialog(this,it) }
        endDateEditText.setOnClickListener { showDatePickerDialog(this, it) }

        val assetListAdapter = AssetListAdapter(this)
        assetListView.adapter = assetListAdapter
        assetListAdapter.setList(JsonParse.fromJson<List<AssetsViews>, MutableList<AssetsViews>>("AssetsViews"))


    }

//    fun showDatePickerDialog(isStart: Boolean) {
//        val now = LocalDate.now()
//        var dialog = DatePickerDialog(
//            this,
//            DatePickerDialog.OnDateSetListener() { view, year, month, dayOfMonth ->
//                val dateStr = "$year-${format(month, 2)}-${format(dayOfMonth, 2)}"
//                if (isStart) {
//                    startDateEditText.setText(dateStr)
//                } else {
//                    endDateEditText.setText(dateStr)
//                }
//            }, now.year, now.monthValue, now.dayOfMonth
//        )
//        dialog.show()
//    }


}
fun showDatePickerDialog(context: Context,editText: View) {
    val now = LocalDate.now()
    var dialog = DatePickerDialog(
        context,
        DatePickerDialog.OnDateSetListener() { view, year, month, dayOfMonth ->
            val dateStr = "$year-${format(month, 2)}-${format(dayOfMonth, 2)}"
            (editText as EditText).setText(dateStr)
        }, now.year, now.monthValue, now.dayOfMonth
    )
    dialog.show()
}

fun format(num: Int, digit: Int): String {
    return String.format("%0${digit}d", num)
}