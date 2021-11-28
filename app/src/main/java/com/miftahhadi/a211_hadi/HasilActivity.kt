package com.miftahhadi.a211_hadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val kode = intent.getStringExtra("kode")
        val tanggal = intent.getStringExtra("tanggal")
        val alamat = intent.getStringExtra("alamat")
        val total = intent.getIntExtra("total", 0)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val kodeTextView = findViewById<TextView>(R.id.kodeTextView)
        val tanggalTextView = findViewById<TextView>(R.id.tanggalTextView)
        val alamatTextView = findViewById<TextView>(R.id.alamatTextView)
        val totalTextView = findViewById<TextView>(R.id.totalTextView)

        namaTextView.setText(nama)
        kodeTextView.setText(kode)
        tanggalTextView.setText(tanggal)
        alamatTextView.setText(alamat)
        totalTextView.setText(total.toString())
    }
}