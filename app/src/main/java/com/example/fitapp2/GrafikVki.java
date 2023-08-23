package com.example.fitapp2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class GrafikVki extends Activity {
    SeekBar seekbar1;
    TextView text1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kitleendeksgrafik);

        Intent intent1 = getIntent();
        float alinanSayi1 = intent1.getFloatExtra("sayiAnahtarindeks", 0);

        seekbar1 = findViewById(R.id.seekBar2);
        text1 = findViewById(R.id.textviewSeek);

        int intValue = (int) alinanSayi1;
        seekbar1.setMax(55);
        seekbar1.setProgress(intValue);
        text1.setText(String.valueOf(intValue));
        if(intValue >= 0 & intValue <18 ) {
            text1.setTextColor(Color.rgb(58, 133, 133));
        }
        if(intValue >= 18 & intValue <25 ) {
            text1.setTextColor(Color.rgb(45,198,198));
        }
        if(intValue >= 25 & intValue < 30 ) {
            text1.setTextColor(Color.rgb(244,202,202));
        }
        if(intValue >= 30 & intValue <40 ) {
            text1.setTextColor(Color.rgb(243,159,159));
        }
        if(intValue >= 40 ) {
            text1.setTextColor(Color.rgb(210,74,74));
        }


        seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

//
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }
            //region Benim method
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
            //endregion
        });








    }


}
