package com.example.quizlutfialdripermana;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_tampilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tampilan);

        //deklarasi bre!
        TextView tvNamaPelanggan = findViewById(R.id.tvNamaPelangganView);
        TextView tvJenisKelamin = findViewById(R.id.tvJenisKelaminView);
        TextView tvAlamatPelanggan = findViewById(R.id.tvAlamatPelangganView);
        TextView tvTipeMember = findViewById(R.id.tvTipeMember);
        TextView tvNamaBarang = findViewById(R.id.tvNamaBarangView);
        TextView tvJumlahBarang = findViewById(R.id.tvJumlahBarangView);
        TextView tvHargaBarang = findViewById(R.id.tvHargaBarangView);
        TextView tvTotalHarga = findViewById(R.id.tvTotalHargaView);
        TextView tvDiscountHarga = findViewById(R.id.tvDiscountView);
        TextView tvDiscountMember = findViewById(R.id.tvDiscountMemberView);
        TextView tvJumlahBayar = findViewById(R.id.tvJumlahBayarView);

        //ambil data dari intent
        tvNamaPelanggan.setText("Nama Pelanggan : "+getIntent().getStringExtra("nama"));
        tvJenisKelamin.setText("Jenis Kelamin : "+getIntent().getStringExtra("jeniskelamin"));
        tvAlamatPelanggan.setText("Alamat Pelanggan : "+getIntent().getStringExtra("alamat"));
        tvTipeMember.setText("Tipe Member : "+getIntent().getStringExtra("tipemember"));
        tvNamaBarang.setText("Nama Barang : "+getIntent().getStringExtra("namabarang"));
        tvJumlahBarang.setText("Jumlah Barang : "+getIntent().getStringExtra("jumlahbarang"));
        tvHargaBarang.setText("Harga Barang : Rp." + getIntent().getStringExtra("hargabarang"));
        tvTotalHarga.setText("Total : Rp." + getIntent().getStringExtra("totalharga"));
        tvDiscountHarga.setText("Discount Harga : Rp." + getIntent().getStringExtra("discountharga"));
        tvDiscountMember.setText("Discount Member : Rp." + getIntent().getStringExtra("discountmember"));
        tvJumlahBayar.setText("Jumlah Bayar : Rp." + getIntent().getStringExtra("jumlahbayar"));
    }
}