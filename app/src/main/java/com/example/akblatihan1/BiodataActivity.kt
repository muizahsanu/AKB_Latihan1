package com.example.akblatihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_biodata.*

class BiodataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        btn_selanjutnya.setOnClickListener(){
            val nama = frm_nama_biodata.text.toString()
            val umur = frm_umur.text.toString()
            if(nama.isEmpty()){
                frm_nama_biodata.setError("Nama tidak boleh kosong")
            }
            else if(umur.isEmpty()){
                frm_umur.setError("Umur tidak boleh kosong")
            }
            else{
                val intent = Intent(this,BerhasilActivity::class.java)
                    .putExtra(EXTRA_MESSAGE,nama)
                startActivity(intent)
            }
        }
    }
}
