package com.example.quizlutfialdripermana;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_transaksi1);
        Button btnProses = findViewById(R.id.btnProses);
        btnProses.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //deklarasi
        String jenisKelamin = null;
        RadioGroup rgJenisKelamin, rgTipePelanggan, rgNamaBarang;
        RadioButton rbJenisKelamin, rbTipePelanggan, rbNamaBarang;
        EditText etNamaPelanggan = findViewById(R.id.etNamaPelanggan);
        EditText etAlamatPelanggan = findViewById(R.id.etAlamatPelanggan);
        EditText etJumlahBarang = findViewById(R.id.etJumlahBarang);
        if (view.getId() == R.id.btnProses) {
            Intent moveIntent = new Intent(this, activity_tampilan.class);

            //radio Grup Tipe Pelanggan
            rgTipePelanggan = findViewById(R.id.rgTipePelanggan);
            int selectedidTipePelanggan = rgTipePelanggan.getCheckedRadioButtonId();
            rbTipePelanggan = findViewById(selectedidTipePelanggan);

            //radio Grup Jenis Kelamin
            rgJenisKelamin = findViewById(R.id.rgJenisKelamin);
            int selectedidJenisKelamin =rgJenisKelamin.getCheckedRadioButtonId();
            rbJenisKelamin = findViewById(selectedidJenisKelamin);

            //passing nama
            String nama = etNamaPelanggan.getText().toString();
            moveIntent.putExtra("nama", nama);

            //passingJenisKelamin
            String pilihanJenisKelamin = rbJenisKelamin.getText().toString().trim();
            switch (pilihanJenisKelamin) {
                case "Pria":
                    jenisKelamin = "Pria";
                    break;
                case "Perempuan":
                    jenisKelamin = "Perempuan";
                    break;
            }
            moveIntent.putExtra("jeniskelamin", jenisKelamin);

            //passing nama barang dan Harga Barang
            rgNamaBarang = (RadioGroup) findViewById(R.id.rgNamaBarang);
            int selectedidNamaBarang =rgNamaBarang.getCheckedRadioButtonId();
            rbNamaBarang = (RadioButton) findViewById(selectedidNamaBarang);

            double Discount = 0;
            int hargaBarang = 0;
            String pilihanNamabarang = rbNamaBarang.getText().toString().trim();
            String NamaBarang = null;
            switch (pilihanNamabarang){
                case "Android" :
                    NamaBarang = "Android";
                    hargaBarang = 1000000;
                    Discount = 0.01;
                    break;
                case "Iphone" :
                    NamaBarang = "Iphone";
                    hargaBarang = 2000000;
                    Discount = 0.02;
                    break;
                case "Windows Phone" :
                    NamaBarang = "Windows Phone";
                    hargaBarang = 3000000;
                    Discount = 0.03;
                    break;
            }
            //merubah integer menjadi string
            String HargaBarang = ""+ hargaBarang;

            moveIntent.putExtra("namabarang", NamaBarang);
            moveIntent.putExtra("hargabarang", HargaBarang);
            //passing Jumlah Barang
            String JumlahBarang = etJumlahBarang.getText().toString();
            moveIntent.putExtra("jumlahbarang", JumlahBarang);

            //totalharga
            int totalHarga = hargaBarang * Integer.parseInt(etJumlahBarang.getText().toString());
            String TotalHarga = ""+totalHarga;
            moveIntent.putExtra("totalharga", TotalHarga);

            //discountHarga
            double nominalDiscount = hargaBarang * Discount * (Integer.parseInt((etJumlahBarang.getText().toString())));
            String DiscountView = ""+nominalDiscount;
            moveIntent.putExtra("discountharga", DiscountView);

            //passingAlamat
            String alamat = etAlamatPelanggan.getText().toString();
            moveIntent.putExtra("alamat", alamat);

            //passing Tipe Pelanggan
            double discountMember = 0;
            String pilihanTipePelanggan = rbTipePelanggan.getText().toString().trim();
            String TipePelanggan = null;
            switch (pilihanTipePelanggan){
                case "Gold" :
                    TipePelanggan = "Gold";
                    discountMember = 0.1;
                    break;
                case "Silver" :
                    TipePelanggan = "Silver";
                    discountMember = 0.075;
                    break;
                case "Biasa" :
                    TipePelanggan = "Biasa";
                    discountMember = 0.01;
                    break;
            }
            moveIntent.putExtra("tipemember", TipePelanggan);

            //discountMember
            double nominalDiscountMember= hargaBarang * discountMember * (Integer.parseInt((etJumlahBarang.getText().toString())));
            String stringNominalDiscMember = ""+ nominalDiscountMember;
            moveIntent.putExtra("discountmember",stringNominalDiscMember);

            //JumlahBayar
            double jumlahBayar = totalHarga - (nominalDiscountMember+nominalDiscount);
            String stringJumlahBayar = "" + jumlahBayar;
            moveIntent.putExtra("jumlahbayar",stringJumlahBayar);

            startActivity(moveIntent);

        }
    }
}