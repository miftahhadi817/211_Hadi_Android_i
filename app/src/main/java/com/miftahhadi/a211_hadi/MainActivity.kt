package com.miftahhadi.a211_hadi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val kodeEditText = findViewById<EditText>(R.id.kodeEditText)
        val tanggalEditText = findViewById<EditText>(R.id.tanggalEditText)
        val alamatEditText = findViewById<EditText>(R.id.alamatEditText)
        val totalEditText = findViewById<EditText>(R.id.totalEditText)


        simpanButton.setOnClickListener {
            Toast.makeText(this,"Data Barang berhasil disimpan ",Toast.LENGTH_SHORT).show()

            val nama = namaEditText.text.toString()
            val kode = kodeEditText.text.toString()
            val tanggal = tanggalEditText.text.toString()
            val alamat = alamatEditText.text.toString()
            val total = totalEditText.text.toString().toInt()

            val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("kode", kode)
            intent.putExtra("tanggal", tanggal)
            intent.putExtra("alamat", alamat)
            intent.putExtra("total", total)
            startActivity(intent)
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}