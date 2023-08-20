package com.example.fitapp2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class GunlukKalori extends Activity implements AdapterView.OnItemSelectedListener{

    SharedPreferencesSinifi shePre = new SharedPreferencesSinifi();
    Context context =this;
    EditText edittextBoy,edittextKilo,edittextYas;
    RadioButton cinsiyetDgskn;
    RadioGroup radioGroup;
    Button hesaplabtngunluk,verilerigetirbtn;
    TextView sonucDgskn;
    Spinner spinnerDegsken;
    String secim,secilenCinsiyet;
    Double bmhSonuc ;
    String boydeger,kilodeger,yasdeger;
    Integer actPosition =0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gunlukkalori);

        radioGroup = findViewById(R.id.radioGroup);
        edittextBoy = findViewById(R.id.editTextBoyGunluk);
        edittextKilo = findViewById(R.id.editTextKiloGunluk);
        edittextYas = findViewById(R.id.editTextYasGunluk);
        sonucDgskn = findViewById(R.id.sonucEndeksTextViewGunluk);
        hesaplabtngunluk = findViewById(R.id.SonucEndeksGunluk);
        verilerigetirbtn = findViewById(R.id.verilerigetir);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                cinsiyetDgskn = findViewById(checkedId);
                String selectedGender = cinsiyetDgskn.getText().toString().trim();
                secilenCinsiyet = selectedGender;
                Toast.makeText(getApplicationContext(), "Seçilen cinsiyet: " + selectedGender, Toast.LENGTH_SHORT).show();
            }
        });

        verilerigetirbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boydeger = shePre.dosyadanStringVeri0ku(context,"boydegerKey1");
                kilodeger = shePre.dosyadanStringVeri0ku(context,"kilodegerKey2");
                yasdeger = shePre.dosyadanStringVeri0ku(context,"yasdegerKey3");


                edittextBoy.setText(boydeger);
                edittextKilo.setText(kilodeger);
                edittextYas.setText(yasdeger);


            }
        });

        hesaplabtngunluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String yastext = edittextYas.getText().toString();
                String kilotext = edittextKilo.getText().toString();
                String boytext = edittextBoy.getText().toString();
//                checkRadioButtonSelection();
                boolean isSelected = checkRadioButtonSelection1();
                if (TextUtils.isEmpty(yastext) || TextUtils.isEmpty(kilotext) || TextUtils.isEmpty(boytext) || !isSelected) {
                    // EditText boş, kullanıcıya uyarı ver
                    AlertDialog.Builder builder = new AlertDialog.Builder(GunlukKalori.this);
                    builder.setTitle("Uyarı");
                    builder.setMessage("Lütfen Boyunuz, Kilonuz ve Cinsiyetiniz için değer giriniz !");
                    builder.setPositiveButton("Tamam", null);
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
                else {
                    String yastext3 = edittextYas.getText().toString();
                    String kilotext2 = edittextKilo.getText().toString();
                    String boytext1 = edittextBoy.getText().toString();
                    shePre.dosyayaStringVeriYaz(context, boytext1, "boydegerKey1");
                    shePre.dosyayaStringVeriYaz(context, kilotext2, "kilodegerKey2");
                    shePre.dosyayaStringVeriYaz(context, yastext3, "yasdegerKey3");

                    double yasDegerSon = Double.parseDouble(yastext);
                    double kiloDegerSon = Double.parseDouble(kilotext);
                    double boyDegerSon = Double.parseDouble(boytext);

                    String boyson = Double.toString(boyDegerSon);
                    switch (secilenCinsiyet) {
                        case "Erkek":
                            if (actPosition == 1) {
                                double bmhSonuc = 66.5 + (13.75 * kiloDegerSon) + (5 * boyDegerSon) - (6.77 * yasDegerSon);
                                bmhSonuc *= 1.2;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else if (actPosition == 2) {
                                double bmhSonuc = 66.5 + (13.75 * kiloDegerSon) + (5 * boyDegerSon) - (6.77 * yasDegerSon);
                                bmhSonuc *= 1.375;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else if (actPosition == 3) {
                                double bmhSonuc = 66.5 + (13.75 * kiloDegerSon) + (5 * boyDegerSon) - (6.77 * yasDegerSon);
                                bmhSonuc *= 1.55;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else if (actPosition == 4) {
                                double bmhSonuc = 66.5 + (13.75 * kiloDegerSon) + (5 * boyDegerSon) - (6.77 * yasDegerSon);
                                bmhSonuc *= 1.725;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else if (actPosition == 5) {
                                double bmhSonuc = 66.5 + (13.75 * kiloDegerSon) + (5 * boyDegerSon) - (6.77 * yasDegerSon);
                                bmhSonuc *= 1.9;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else
                                Toast.makeText(getApplicationContext(), "Hatalı ifx", Toast.LENGTH_SHORT).show();
                            break;


                        case "Kadın":
                            if (actPosition == 1) {
                                double bmhSonuc = 655.1 + (9.56 * kiloDegerSon) + (1.85 * boyDegerSon) - (4.67 * yasDegerSon);
                                bmhSonuc *= 1.2;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else if (actPosition == 2) {
                                double bmhSonuc = 655.1 + (9.56 * kiloDegerSon) + (1.85 * boyDegerSon) - (4.67 * yasDegerSon);
                                bmhSonuc *= 1.375;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else if (actPosition == 3) {
                                double bmhSonuc = 655.1 + (9.56 * kiloDegerSon) + (1.85 * boyDegerSon) - (4.67 * yasDegerSon);
                                bmhSonuc *= 1.55;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else if (actPosition == 4) {
                                double bmhSonuc = 655.1 + (9.56 * kiloDegerSon) + (1.85 * boyDegerSon) - (4.67 * yasDegerSon);
                                bmhSonuc *= 1.725;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else if (actPosition == 5) {
                                double bmhSonuc = 655.1 + (9.56 * kiloDegerSon) + (1.85 * boyDegerSon) - (4.67 * yasDegerSon);
                                bmhSonuc *= 1.9;
                                int tamSayi = (int) bmhSonuc;
                                String sonuc = Integer.toString(tamSayi);
                                sonucDgskn.setText(sonuc);
                                sonucDgskn.setBackgroundColor(Color.GREEN);

                                Intent intent = new Intent(GunlukKalori.this, MainActivity.class);
                                shePre.dosyayaIntVeriYaz(context, tamSayi, "intGerekenKaloriKey1");
                                startActivity(intent);
                            } else
                                Toast.makeText(getApplicationContext(), "Hatalı ifx", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }


            }
        });

        spinnerDegsken = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDegsken.setAdapter(adapter);
        spinnerDegsken.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);





    }

    private void checkRadioButtonSelection() {
        // Seçilen RadioButton'un ID'sini alıyoruz
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

        if (selectedRadioButtonId == -1) {
            // Hiçbir RadioButton seçilmemiş
            showAlertDialog("Uyarı", "Lütfen bir cinsiyet seçin.");
        } else {
            // Seçilen RadioButton'u alıyoruz
            RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);

            // Seçilen RadioButton'un metnini alıyoruz
            String selectedText = selectedRadioButton.getText().toString();

            // Seçilen RadioButton'un metnini kullanarak alert dialog oluşturuyoruz
            showAlertDialog("Seçim", "Seçilen seçenek: " + selectedText);
        }
    }

    private boolean checkRadioButtonSelection1() {
        // Seçilen RadioButton'un ID'sini alıyoruz
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

        if (selectedRadioButtonId == -1) {
            // Hiçbir RadioButton seçilmemiş

            return false;
        } else {
            // Seçilen RadioButton'u alıyoruz
//            RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
//
//            // Seçilen RadioButton'un metnini alıyoruz
//            String selectedText = selectedRadioButton.getText().toString();

            // Seçilen RadioButton'un metnini kullanarak alert dialog oluşturuyoruz
//            showAlertDialog("Seçim", "Seçilen seçenek: " + selectedText);
            return true;
        }
    }

    private void showAlertDialog(String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(GunlukKalori.this).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Tamam",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Alert dialog tamam butonuna basıldığında yapılacak işlemleri buraya yazabilirsiniz.
                    }
                });
        alertDialog.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedOption = parent.getItemAtPosition(position).toString();

            switch (selectedOption) {
                case "Hareketsiz":
                    actPosition = 1;
                    break;
                case "Düşük Aktvite":
                    actPosition = 2;
                    break;
                case "Orta Aktvite":
                    actPosition = 3;
                    break;
                case "Yüksek Aktvite":
                    actPosition = 4;
                    break;
                case "Çok Yüksek Aktvite":
                    actPosition = 5;
                    break;
                default:
                    // Belirtilen seçeneklerden farklı bir değer ise burası çalışır
                    break;
        }

        Toast.makeText(getApplicationContext(), "Seçilen seçenek: " + selectedOption, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

}
