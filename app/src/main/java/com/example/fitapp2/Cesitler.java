package com.example.fitapp2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Cesitler extends Activity {

    Button temelGidagecis;
    Button kaydetKaloribtn;
    LinearLayout linearLayout;

    SharedPreferencesSinifi shePre = new SharedPreferencesSinifi();
    CheckBox yumurta,yumurta2,yumurta3,patates1,salatalik,domates,kasarpey,kasartost,
    ekmek,nutella,patatespogaca,siyahzeytin,beyazpeynir,omlet,karisiktost,menemen,yesilzeytin;

    CheckBox EzoCorba,DomCorba,MerCorba,YaylaCorba,TavukSuyuCorba,ArpaSehCorba;

    CheckBox princpilav,misirpilav,mengenpilav,sebzepilav,bulgurpilav,meyhanepilav;

    CheckBox sebzeturlu,tavuksote,mantarsote,kadinbudukofte,imambayildi,tavuksis,tazefasulye,firinntavuk,misketkofte,
            kurufasulye,tavukfajita,biberdolma,bezelye,pilicpane;

    CheckBox karpuz,cilek,erik,elma,uzum,karadut,portakal,kavun,kiraz,kayisi,visne;
    CheckBox asure,baklava,kunefe,dondurma,lokum,tulumba,puding,magnolya,kemalpasa,revani,kazandibi;
    CheckBox kola,fanta,sprite,ayran,sut,portsuyu,icetea,salgam,limonsoda,cay,su;

    TextView yemekSonucTextDegiskeni;
    TextView kaloriSonucTextDegiskeni;

    Context context=this;
    String yemekSonuc="";
    Integer kalori = 0,sabahKalori = 0,ogleKalori =0,aksamKalori = 0;
    boolean isVisible = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cesitler);

        Button temelGidagecis = (Button)findViewById(R.id.buttonBasicFood);
        Button corbagecis = (Button)findViewById(R.id.buttonVegetables);
        Button pilavgecis = (Button)findViewById(R.id.buttonNuts);
        Button anayemekgecis = (Button)findViewById(R.id.buttonLegumes);
        Button meyvesebzegecis = (Button)findViewById(R.id.buttonFruits);
        Button tatligecis = (Button)findViewById(R.id.buttonTatli);
        Button icecekgecis = (Button)findViewById(R.id.buttonİceceks);

        Button kaydetKaloribtn = (Button)findViewById(R.id.KaydetKalori);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linear1);
        LinearLayout linearLayout2 = (LinearLayout)findViewById(R.id.linear2);
        LinearLayout linearLayout3 = (LinearLayout)findViewById(R.id.linear3);
        LinearLayout linearLayout4 = (LinearLayout)findViewById(R.id.linear4);
        LinearLayout linearLayout5 = (LinearLayout)findViewById(R.id.linear5);
        LinearLayout linearLayout6 = (LinearLayout)findViewById(R.id.linear6);
        LinearLayout linearLayout7 = (LinearLayout)findViewById(R.id.linear7);


        yumurta=(CheckBox) findViewById(R.id.checkBox1);
        yumurta2=(CheckBox) findViewById(R.id.checkBox2);
        yumurta3=(CheckBox) findViewById(R.id.checkBox3);
        patates1=(CheckBox) findViewById(R.id.checkBox4);
        salatalik=(CheckBox) findViewById(R.id.checkBox5);
        domates=(CheckBox) findViewById(R.id.checkBox6);
        kasarpey=(CheckBox) findViewById(R.id.checkBox7);
        kasartost=(CheckBox) findViewById(R.id.checkBox8);

        ekmek=(CheckBox) findViewById(R.id.checkBox9);
        nutella=(CheckBox) findViewById(R.id.checkBox10);
        patatespogaca=(CheckBox) findViewById(R.id.checkBox11);
        siyahzeytin=(CheckBox) findViewById(R.id.checkBox12);
        beyazpeynir=(CheckBox) findViewById(R.id.checkBox13);
        omlet=(CheckBox) findViewById(R.id.checkBox14);
        karisiktost=(CheckBox) findViewById(R.id.checkBox15);
        menemen=(CheckBox) findViewById(R.id.checkBox16);
        yesilzeytin=(CheckBox) findViewById(R.id.checkBox17);

        EzoCorba=(CheckBox) findViewById(R.id.checkBox18);
        DomCorba=(CheckBox) findViewById(R.id.checkBox19);
        MerCorba=(CheckBox) findViewById(R.id.checkBox20);
        YaylaCorba=(CheckBox) findViewById(R.id.checkBox21);
        TavukSuyuCorba=(CheckBox) findViewById(R.id.checkBox22);
        ArpaSehCorba=(CheckBox) findViewById(R.id.checkBox23);

        princpilav=(CheckBox) findViewById(R.id.checkBox24);
        misirpilav=(CheckBox) findViewById(R.id.checkBox25);
        mengenpilav=(CheckBox) findViewById(R.id.checkBox26);
        sebzepilav=(CheckBox) findViewById(R.id.checkBox27);
        bulgurpilav=(CheckBox) findViewById(R.id.checkBox28);
        meyhanepilav=(CheckBox) findViewById(R.id.checkBox29);

        sebzeturlu=(CheckBox) findViewById(R.id.checkBox30);
        tavuksote=(CheckBox) findViewById(R.id.checkBox31);
        mantarsote=(CheckBox) findViewById(R.id.checkBox32);
        kadinbudukofte=(CheckBox) findViewById(R.id.checkBox33);
        imambayildi=(CheckBox) findViewById(R.id.checkBox34);
        tavuksis=(CheckBox) findViewById(R.id.checkBox35);
        tazefasulye=(CheckBox) findViewById(R.id.checkBox36);
        firinntavuk=(CheckBox) findViewById(R.id.checkBox37);
        misketkofte=(CheckBox) findViewById(R.id.checkBox38);
        kurufasulye=(CheckBox) findViewById(R.id.checkBox39);
        tavukfajita=(CheckBox) findViewById(R.id.checkBox40);
        biberdolma=(CheckBox) findViewById(R.id.checkBox41);
        bezelye=(CheckBox) findViewById(R.id.checkBox42);
        pilicpane=(CheckBox) findViewById(R.id.checkBox43);



        karpuz=(CheckBox) findViewById(R.id.checkBox44);
        cilek=(CheckBox) findViewById(R.id.checkBox45);
        erik=(CheckBox) findViewById(R.id.checkBox46);
        elma=(CheckBox) findViewById(R.id.checkBox47);
        uzum=(CheckBox) findViewById(R.id.checkBox48);
        karadut=(CheckBox) findViewById(R.id.checkBox49);
        portakal=(CheckBox) findViewById(R.id.checkBox50);
        kavun=(CheckBox) findViewById(R.id.checkBox51);
        kiraz=(CheckBox) findViewById(R.id.checkBox52);
        kayisi=(CheckBox) findViewById(R.id.checkBox53);
        visne=(CheckBox) findViewById(R.id.checkBox54);


        asure=(CheckBox) findViewById(R.id.checkBox55);
        baklava=(CheckBox) findViewById(R.id.checkBox56);
        kunefe=(CheckBox) findViewById(R.id.checkBox57);
        dondurma=(CheckBox) findViewById(R.id.checkBox58);
        lokum=(CheckBox) findViewById(R.id.checkBox59);
        tulumba=(CheckBox) findViewById(R.id.checkBox60);
        puding=(CheckBox) findViewById(R.id.checkBox61);
        magnolya=(CheckBox) findViewById(R.id.checkBox62);
        kemalpasa=(CheckBox) findViewById(R.id.checkBox63);
        revani=(CheckBox) findViewById(R.id.checkBox64);
        kazandibi=(CheckBox) findViewById(R.id.checkBox65);

        kola=(CheckBox) findViewById(R.id.checkBox66);
        fanta=(CheckBox) findViewById(R.id.checkBox67);
        sprite=(CheckBox) findViewById(R.id.checkBox68);
        ayran=(CheckBox) findViewById(R.id.checkBox69);
        sut=(CheckBox) findViewById(R.id.checkBox70);
        portsuyu=(CheckBox) findViewById(R.id.checkBox71);
        icetea=(CheckBox) findViewById(R.id.checkBox72);
        salgam=(CheckBox) findViewById(R.id.checkBox73);
        limonsoda=(CheckBox) findViewById(R.id.checkBox74);
        cay=(CheckBox) findViewById(R.id.checkBox75);
        su=(CheckBox) findViewById(R.id.checkBox76);

        yemekSonucTextDegiskeni=(TextView) findViewById(R.id.yemekSonucText);
        kaloriSonucTextDegiskeni =(TextView)findViewById(R.id.kaloriSonucTextDegiskeni);


        kaydetKaloribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cesitler.this, MainActivity.class);
//                intent.putExtra("sayiAnahtar", kalori);
                int controlSabah = shePre.dosyadanIntVeriOku(context,"intKeyControlSabah");
                if(controlSabah == 1) {
                    shePre.dosyayaStringVeriYaz(context, yemekSonuc, "sKey1");
                    sabahKalori = kalori;
                    shePre.dosyayaIntVeriYaz(context, sabahKalori, "intSabahKaloriKey1");
                }
                int controlOgle = shePre.dosyadanIntVeriOku(context,"intKeyControlOgle");
                if(controlOgle == 2) {
                    shePre.dosyayaStringVeriYaz(context, yemekSonuc, "sKey2");
                    ogleKalori = kalori;
                    shePre.dosyayaIntVeriYaz(context, ogleKalori, "intOgleKaloriKey2");
                }
                int controlAksam = shePre.dosyadanIntVeriOku(context,"intKeyControlAksam");
                if(controlAksam == 3) {
                    shePre.dosyayaStringVeriYaz(context, yemekSonuc, "sKey3");
                    aksamKalori = kalori;
                    shePre.dosyayaIntVeriYaz(context, aksamKalori, "intAksamKaloriKey3");
                }
                startActivity(intent);
            }
        });

        temelGidagecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    linearLayout.setVisibility(View.GONE);
                    isVisible = false;
                } else {
                    linearLayout.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

        corbagecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    linearLayout2.setVisibility(View.GONE);
                    isVisible = false;
                } else {
                    linearLayout2.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

        pilavgecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    linearLayout3.setVisibility(View.GONE);
                    isVisible = false;
                } else {
                    linearLayout3.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

        anayemekgecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    linearLayout4.setVisibility(View.GONE);
                    isVisible = false;
                } else {
                    linearLayout4.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

        meyvesebzegecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    linearLayout5.setVisibility(View.GONE);
                    isVisible = false;
                } else {
                    linearLayout5.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

        tatligecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    linearLayout6.setVisibility(View.GONE);
                    isVisible = false;
                } else {
                    linearLayout6.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

        icecekgecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isVisible) {
                    linearLayout7.setVisibility(View.GONE);
                    isVisible = false;
                } else {
                    linearLayout7.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });

        yumurta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    yemekSonuc += "-Haş.Yumurta";
                    kalori +=78;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Haş.Yumurta"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Haş.Yumurta")+12);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=78;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));

            }
        });

        yumurta2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Sah.Yumurta";
                    kalori +=120;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Sah.Yumurta"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Sah.Yumurta")+12);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=120;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        yumurta3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Suc.Yumurta";
                    kalori +=242;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Suc.Yumurta"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Suc.Yumurta")+12 );
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=242;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        patates1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Pat.Kızartması";
                    kalori +=312;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Pat.Kızartması"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Pat.Kızartması")+15);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=312;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        salatalik.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Salatalık";
                    kalori +=10;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Salatalık"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Salatalık")+10);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=10;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        domates.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Domates";
                    kalori +=10;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Domates"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Domates")+8);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=10;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });



        kasarpey.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kaşar Peynir";
                    kalori +=106;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kaşar Peynir"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kaşar Peynir")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        kasartost.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kaşarlı Tost";
                    kalori +=212;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kaşarlı Tost"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kaşarlı Tost")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=212;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });








        ekmek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    yemekSonuc += "-Ekmek";
                    kalori +=132;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Ekmek"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Ekmek")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=132;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));

            }
        });

        nutella.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Nutella";
                    kalori +=120;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Nutella"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Nutella")+8);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=120;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        patatespogaca.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Pat.Poğaça";
                    kalori +=246;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Pat.Poğaça"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Pat.Poğaça")+11);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=246;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        siyahzeytin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Siyah Zeytin";
                    kalori +=25;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Siyah Zeytin"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Siyah Zeytin")+12);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=25;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        beyazpeynir.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Beyaz Peynir";
                    kalori +=200;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Beyaz Peynir"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Beyaz Peynir")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=200;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        omlet.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Omlet";
                    kalori +=154;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Omlet"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Omlet")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=154;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });



        karisiktost.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Karışık Tost";
                    kalori +=256;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Karışık Tost"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Karışık Tost")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=256;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        menemen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Menemen";
                    kalori +=106;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Menemen"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Menemen")+8);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        yesilzeytin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Yeşil Zeytin";
                    kalori +=40;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Yeşil Zeytin"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Yeşil Zeytin")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=40;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        EzoCorba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Ezogelin Çorba";
                    kalori +=45;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Ezogelin Çorba"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Ezogelin Çorba")+15);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=45;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        DomCorba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Domates Çorba";
                    kalori +=30;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Domates Çorba"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Domates Çorba")+14);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=30;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        MerCorba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Mercimek Çorba";
                    kalori +=56;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Mercimek Çorba"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Mercimek Çorba")+15);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=56;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        YaylaCorba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Yayla Çorba";
                    kalori +=50;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Yayla Çorba"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Yayla Çorba")+12);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=50;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        TavukSuyuCorba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Tavuk Suyu Çorba";
                    kalori +=55;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Tavuk Suyu Çorba"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Tavuk Suyu Çorba")+17);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=55;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        ArpaSehCorba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Arpa Şeh.Corba";
                    kalori +=91;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Arpa Şeh.Corba"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Arpa Şeh.Corba")+15);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=91;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        princpilav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    yemekSonuc += "-Pirinç Pilavı";
                    kalori +=360;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Pirinç Pilavı"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Pirinç Pilavı")+14);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=360;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));

            }
        });


        misirpilav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    yemekSonuc += "-Mısırlı Pirinç Pilavı";
                    kalori +=303;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Mısırlı Pirinç Pilavı"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Mısırlı Pirinç Pilavı")+22);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=303;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));

            }
        });


        mengenpilav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    yemekSonuc += "-Mengen Pilavı";
                    kalori +=101;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Mengen Pilavı"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Mengen Pilavı")+14);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=101;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));

            }
        });


        sebzepilav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    yemekSonuc += "-Sebze Pilavı";
                    kalori +=137;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Sebze Pilavı"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Sebze Pilavı")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=137;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));

            }
        });


        bulgurpilav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    yemekSonuc += "-Bulgur Pilavı";
                    kalori +=244;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Bulgur Pilavı"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Bulgur Pilavı")+14);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=244;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));

            }
        });


        meyhanepilav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true)
                {
                    yemekSonuc += "-Meyhane Pilavı";
                    kalori +=200;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Meyhane Pilavı"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Meyhane Pilavı")+15);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=200;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));

            }
        });


        sebzeturlu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Sebze Türlü";
                    kalori +=65;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Sebze Türlü"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Sebze Türlü")+12);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=65;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        tavuksote.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Tavuk Sote";
                    kalori +=169;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Tavuk Sote"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Tavuk Sote")+11);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=169;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        mantarsote.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Mantar Sote";
                    kalori +=63;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Mantar Sote"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Mantar Sote")+11);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=63;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        kadinbudukofte.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kadınbudu Köfte";
                    kalori +=405;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kadınbudu Köfte"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kadınbudu Köfte")+16);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=405;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        imambayildi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-İmambayıldı";
                    kalori +=164;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-İmambayıldı"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-İmambayıldı")+12);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=164;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        tavuksis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Tavuk Şiş";
                    kalori +=126;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Tavuk Şiş"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Tavuk Şiş")+10);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=126;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });



        tazefasulye.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Taze Fasulye";
                    kalori +=31;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Taze Fasulye"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Taze Fasulye")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=31;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        firinntavuk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Fırın Tavuk";
                    kalori +=138;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Fırın Tavuk"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Fırın Tavuk")+12);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=138;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        misketkofte.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Misket Köfte";
                    kalori +=197;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Misket Köfte"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Misket Köfte")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=197;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        kurufasulye.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kuru Fasulye";
                    kalori +=97;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kuru Fasulye"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kuru Fasulye")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=97;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        tavukfajita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Tavuk Fajita";
                    kalori +=143;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Tavuk Fajita"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Tavuk Fajita")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=143;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        biberdolma.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Biber Dolma";
                    kalori +=79;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Biber Dolma"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Biber Dolma")+12);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=79;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        bezelye.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Bezelye";
                    kalori +=84;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Bezelye"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Bezelye")+8);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=84;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        pilicpane.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Piliç Pane";
                    kalori +=264;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Piliç Pane"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Piliç Pane")+11);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=264;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        karpuz.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Karpuz";
                    kalori +=30;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Karpuz"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Karpuz")+7);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=30;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        cilek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Çilek";
                    kalori +=33;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Çilek"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Çilek")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=33;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        erik.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Erik";
                    kalori +=46;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Erik"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Erik")+5);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=46;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        elma.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Elma";
                    kalori +=52;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Elma"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Elma")+5);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=52;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        uzum.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Üzüm";
                    kalori +=33;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Üzüm"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Üzüm")+5);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=33;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        karadut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Karadut";
                    kalori +=22;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Karadut"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Karadut")+8);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=22;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        portakal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Portakal";
                    kalori +=47;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Portakal"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Portakal")+9);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=47;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        kavun.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kavun";
                    kalori +=34;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kavun"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kavun")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=34;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        kiraz.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kiraz";
                    kalori +=25;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kiraz"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kiraz")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=25;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        kayisi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kayısı";
                    kalori +=24;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kayısı"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kayısı")+7);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=24;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        visne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Vişne";
                    kalori +=25;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Vişne"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Vişne")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=25;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        asure.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Aşure";
                    kalori +=313;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Aşure"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Aşure")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });
        baklava.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Baklava";
                    kalori +=434;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Baklava"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Baklava")+8);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        kunefe.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Künefe";
                    kalori +=253;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Künefe"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Künefe")+7);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        dondurma.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Dondurma";
                    kalori +=208;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Dondurma"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Dondurma")+9);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        lokum.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Lokum";
                    kalori +=359;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Lokum"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Lokum")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        tulumba.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Tulumba";
                    kalori +=284;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Tulumba"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Tulumba")+8);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        puding.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Puding";
                    kalori +=120;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Puding"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Puding")+7);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        magnolya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Magnolya";
                    kalori +=238;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Magnolya"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Magnolya")+9);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        kemalpasa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kemalpaşa";
                    kalori +=167;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kemalpaşa"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kemalpaşa")+10);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        revani.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Revani";
                    kalori +=697;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Revani"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Revani")+7);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });

        kazandibi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kazandibi";
                    kalori +=201;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kazandibi"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kazandibi")+10);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=106;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        kola.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Kola";
                    kalori +=201;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Kola"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Kola")+5);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=201;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        fanta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Fanta";
                    kalori +=155;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Fanta"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Fanta")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=155;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        sprite.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Sprite";
                    kalori +=130;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Sprite"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Sprite")+7);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=130;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        ayran.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Ayran";
                    kalori +=80;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Ayran"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Ayran")+6);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=80;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        sut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Süt";
                    kalori +=85;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Süt"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Süt")+4);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=85;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        portsuyu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Portakal Suyu";
                    kalori +=90;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Portakal Suyu"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Portakal Suyu")+14);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=90;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        icetea.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-İce Tea";
                    kalori +=99;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-İce Tea"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-İce Tea")+8);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=99;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        salgam.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Şalgam";
                    kalori +=10;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Şalgam"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Şalgam")+7);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=10;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        limonsoda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Limonlu Soda";
                    kalori +=41;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Limonlu Soda"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Limonlu Soda")+13);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=41;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        cay.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Çay";
                    kalori +=1;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Çay"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Çay")+4);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=1;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });


        su.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true) {
                    yemekSonuc += "-Su";
                    kalori +=0;
                    buttonView.setTextColor(Color.GREEN);
                }
                else
                {
                    String oncesi=yemekSonuc.substring(0,yemekSonuc.indexOf("-Su"));
                    String sonrasi=yemekSonuc.substring(yemekSonuc.indexOf("-Su")+3);
                    yemekSonuc=oncesi+sonrasi;
                    kalori -=0;
                    buttonView.setTextColor(Color.BLACK);
                }
                yemekSonucTextDegiskeni.setText(yemekSonuc);
                kaloriSonucTextDegiskeni.setText(String.valueOf(kalori+" kcal"));
            }
        });





    }
}
