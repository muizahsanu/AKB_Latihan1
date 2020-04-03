package com.example.akblatihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar.*

class DaftarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        btn_masuk.setOnClickListener(){
            val kode_keluarga = frm_kode.text.toString()
            if(kode_keluarga.isEmpty()){
                frm_kode.setError("Kode keluarga tidak boleh kosong")
            }
            else if(kode_keluarga.length < 6){
                frm_kode.setError("Kode keluarga minimal 6 karakter")
            }
            else{
                val intent = Intent(this,BiodataActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
