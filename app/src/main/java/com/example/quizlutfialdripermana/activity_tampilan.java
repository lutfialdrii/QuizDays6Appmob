package com.example.quizlutfialdripermana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_tampilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //deklarasi bre!
        TextView tvNamaPelanggan = null, tvAlamatPelanggan = null, tvJenisKelamin = null, tvTipePelanggan = null,tvNamaBarang = null;
        tvNamaPelanggan = (TextView) findViewById(R.id.tvNamaPelangganView);
        tvJenisKelamin = (TextView) findViewById(R.id.tvJenisKelaminView);
        tvAlamatPelanggan = (TextView) findViewById(R.id.tvAlamatPelangganView);
        tvTipePelanggan = (TextView) findViewById(R.id.tvTipeMember);
        tvNamaBarang = (TextView) findViewById(R.id.tvNamaBarangView);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tampilan);

        //ambil data dari intent
        tvNamaPelanggan.setText("Nama Pelanggan : "+getIntent().getStringExtra("nama"));
        tvJenisKelamin.setText("Jenis Kelamin : "+getIntent().getStringExtra("jeniskelamin"));
        tvAlamatPelanggan.setText("Alamat Pelanggan : "+getIntent().getStringExtra("alamat"));
        tvTipePelanggan.setText("Tipe Pelanggan : "+getIntent().getStringExtra("tipepelanggan"));
        tvNamaBarang.setText("Nama Barang : "+getIntent().getStringExtra("namabarang"));

    }
}