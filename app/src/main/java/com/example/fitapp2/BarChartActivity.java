package com.example.fitapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Calendar;

public class BarChartActivity extends AppCompatActivity {


    SharedPreferencesSinifi shePre = new SharedPreferencesSinifi();
    Context context =this;

    Button gunlukkayitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graphicmain);

        gunlukkayitbtn = findViewById(R.id.günlükKaloriKayit);



        BarChart barChart = findViewById(R.id.barchart);




        int veri1 = shePre.dosyadanIntVeriOku(context,"grpveri1");
        int veri2 = shePre.dosyadanIntVeriOku(context,"grpveri2");
        int veri3 = shePre.dosyadanIntVeriOku(context,"grpveri3");
        int veri4 = shePre.dosyadanIntVeriOku(context,"grpveri4");
        int veri5 = shePre.dosyadanIntVeriOku(context,"grpveri5");
        int veri6 = shePre.dosyadanIntVeriOku(context,"grpveri6");
        int veri7 = shePre.dosyadanIntVeriOku(context,"grpveri7");


        float veri1f = (float)veri1;
        float veri2f = (float)veri2;
        float veri3f = (float)veri3;
        float veri4f = (float)veri4;
        float veri5f = (float)veri5;
        float veri6f = (float)veri6;
        float veri7f = (float)veri7;

        ArrayList<BarEntry> visitors = new ArrayList<>();
        visitors.add(new BarEntry(2014,veri1f));
        visitors.add(new BarEntry(2015,veri2f));
        visitors.add(new BarEntry(2016,veri3f));
        visitors.add(new BarEntry(2017,veri4f));
        visitors.add(new BarEntry(2018,veri5f));
        visitors.add(new BarEntry(2019,veri6f));
        visitors.add(new BarEntry(2020,veri7f));



        gunlukkayitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int toplam = shePre.dosyadanIntVeriOku(context,"toplamKey1");
                float toplamFLT =toplam;

                Calendar calendar = Calendar.getInstance();
                int currentMonth = calendar.get(Calendar.MONTH) + 1;
                int currentDay = calendar.get(Calendar.DAY_OF_MONTH);


                float startXValue = currentMonth + (float)currentDay/100; // Günü yüzdelik olarak ekliyoruz



                if (visitors.size() >= 7) {

                    visitors.remove(0);


                    for (int i = 0; i < visitors.size(); i++) {
                        BarEntry currentEntry = visitors.get(i);
                        float newXValue = currentEntry.getX() - 1f;
                        float newYValue = currentEntry.getY();
                        visitors.set(i, new BarEntry(newXValue, newYValue));
                    }
                    shePre.dosyayaIntVeriYaz(context,veri2,"grpveri1");
                    shePre.dosyayaIntVeriYaz(context,veri3,"grpveri2");
                    shePre.dosyayaIntVeriYaz(context,veri4,"grpveri3");
                    shePre.dosyayaIntVeriYaz(context,veri5,"grpveri4");
                    shePre.dosyayaIntVeriYaz(context,veri6,"grpveri5");
                    shePre.dosyayaIntVeriYaz(context,veri7,"grpveri6");
                    shePre.dosyayaIntVeriYaz(context,toplam,"grpveri7");

                    barChart.invalidate();
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }




            }
        });



        BarDataSet barDataSet = new BarDataSet(visitors, "Visitors");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);


        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart Example");
        barChart.animateY(2000);













    }
}