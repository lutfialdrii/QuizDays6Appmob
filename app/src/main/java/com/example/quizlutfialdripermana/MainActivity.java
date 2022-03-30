package com.example.quizlutfialdripermana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btnProses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_transaksi1);
        btnProses = (Button) findViewById(R.id.btnProses);
    }

    public void btnProses(View view) {
        String jenisKelamin = null;
        EditText etNamaPelanggan = null, etAlamatPelanggan = null, etJumlahBarang;
        RadioGroup rgJenisKelamin, rgTipePelanggan, rgNamaBarang;
        RadioButton rbJenisKelamin, rbTipePelanggan, rbNamaBarang;


        //deklarasi ni cuy
        etNamaPelanggan = (EditText) findViewById(R.id.etNamaPelanggan);
        etJumlahBarang = (EditText) findViewById(R.id.etJumlahBarang);
        etAlamatPelanggan = (EditText) findViewById(R.id.etAlamatPelanggan);

        //Jenis Kelamin
        rgJenisKelamin = (RadioGroup) findViewById(R.id.rgJenisKelamin);
        int selectedidJenisKelamin =rgJenisKelamin.getCheckedRadioButtonId();
        rbJenisKelamin = (RadioButton) findViewById(selectedidJenisKelamin);

        String pilihanJenisKelamin = rbJenisKelamin.getText().toString().trim();
        switch (pilihanJenisKelamin){
            case "Pria" :
                jenisKelamin = "Pria";
                break;
            case "Perempuan" :
                jenisKelamin = "Perempuan";
                break;
        }
        //Tipe Pelanggan
        rgTipePelanggan = (RadioGroup) findViewById(R.id.rgTipePelanggan);
        int selectedidTipePelanggan =rgTipePelanggan.getCheckedRadioButtonId();
        rbTipePelanggan = (RadioButton) findViewById(selectedidTipePelanggan);

        String pilihanTipePelanggan = rbTipePelanggan.getText().toString().trim();
        String TipePelanggan = null;
        switch (pilihanTipePelanggan){
            case "Gold" :
                TipePelanggan = "Gold";
                break;
            case "Silver" :
                TipePelanggan = "Silver";
                break;
            case "Biasa" :
                TipePelanggan = "Biasa";
                break;
        }
        //Nama Barang
        rgNamaBarang = (RadioGroup) findViewById(R.id.rgNamaBarang);
        int selectedidNamaBarang =rgNamaBarang.getCheckedRadioButtonId();
        rbNamaBarang = (RadioButton) findViewById(selectedidNamaBarang);

        String pilihanNamabarang = rbNamaBarang.getText().toString().trim();
        String NamaBarang = null;
        switch (pilihanNamabarang){
            case "Android" :
                NamaBarang = "Android";
                break;
            case "Iphone" :
                NamaBarang = "Iphone";
                break;
            case "Windows Phone" :
                NamaBarang = "Windows Phone";
                break;
        }

        String nama = etNamaPelanggan.getText().toString();
        String alamat = etAlamatPelanggan.getText().toString();


        if (view.getId() == R.id.btnProses) {
            Intent moveIntent = new Intent(MainActivity.this, activity_tampilan.class);
//            moveIntent.putExtra("nama", etNamaPelanggan.getText().toString());
//            moveIntent.putExtra("alamat", etAlamatPelanggan.getText().toString());
//            moveIntent.putExtra("jeniskelamin", jenisKelamin);
//            moveIntent.putExtra("tipepelanggan", TipePelanggan);
//            moveIntent.putExtra("namabarang", NamaBarang);
            startActivity(moveIntent);
        }
    }
}