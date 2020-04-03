package com.example.akblatihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/*Tanggal Pengerjaan: 2 april 2020
* Nama : Muiz Ahsanu Haqi
* NIM  : 10117199
* Kelas: IF-5*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_mulai.setOnClickListener(){
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
        }
    }

}
