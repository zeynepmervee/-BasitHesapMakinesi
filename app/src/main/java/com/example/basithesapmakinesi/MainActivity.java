package com.example.basithesapmakinesi;

import android.os.Bundle;

import androidx. appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText editTxtBirinciSayi, editTxtIkinciSayi;
    private TextView txtSonuc;
    private String birinciSayi, ikinciSayi;
    private int s1, s2, sonuc;
    private Hesapla hesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtBirinciSayi = (EditText) findViewById(R.id.editTxtBirinciSayi);
        editTxtIkinciSayi = (EditText) findViewById(R.id.editTxtIkinciSayi);
        txtSonuc = (TextView) findViewById(R.id.txtViewSonuc);

    }

    public void btnHesapla(View v) {
        birinciSayi = editTxtBirinciSayi.getText().toString(); //edit textten birinci sayiyi alacak stringe çevirecek
        ikinciSayi = editTxtIkinciSayi.getText().toString();
        if (!TextUtils.isEmpty(birinciSayi) && !TextUtils.isEmpty(ikinciSayi)) {
            s1 = Integer.valueOf(birinciSayi);
            s2 = Integer.valueOf(ikinciSayi);
            hesapla = new Hesapla(s1, s2);
            if (v.getId() == R.id.btnTopla) {
                sonuc = hesapla.toplam();
            } else if (v.getId() == R.id.btnFark) {
                sonuc = hesapla.fark();
            } else if (v.getId() == R.id.btnCarp) {
                sonuc = hesapla.carpim();
            } else if (v.getId() == R.id.btnBolme) {
                sonuc = hesapla.bolum();
            }
            txtSonuc.setText("Sonuc: " + sonuc);
        } else txtSonuc.setText("Girilen degerler bos olamaz.");
        //ctrl+alt+L kodların şeklini düzeltir.


    }
}