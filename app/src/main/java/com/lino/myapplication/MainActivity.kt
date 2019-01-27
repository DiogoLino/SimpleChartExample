package com.lino.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lino.simplechart.entities.ChartItem
import kotlinx.android.synthetic.main.my_activity.*
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_activity)

        // Create your ArrayList of ChartItem and Pass it in draw chart
        val chartArray = arrayListOf<ChartItem>().apply {
            add(ChartItem(BigDecimal(25000),BigDecimal(14000),"JAN"))
            add(ChartItem(BigDecimal(48600.23),BigDecimal(5000),"FEB"))
            add(ChartItem(BigDecimal(45000.45),BigDecimal(45645),"MAR"))
            add(ChartItem(BigDecimal(15000.45),BigDecimal(20000),"APR"))
            add(ChartItem(BigDecimal(34597),BigDecimal(20000),"JUN"))
            add(ChartItem(BigDecimal(45454),BigDecimal(60000),"JUL"))
        }

        myChart.drawChart(chartArray,"EUR") {
            onItemCLiked(it)
        }
    }


    private fun onItemCLiked(item : ChartItem){
        // do stuff with your item when clicked
        Toast.makeText(this,"clicked " + item.date,Toast.LENGTH_SHORT).show()
    }

}
