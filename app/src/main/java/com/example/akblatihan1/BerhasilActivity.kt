package com.example.akblatihan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_berhasil.*

class BerhasilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berhasil)


        val nama = intent.getStringExtra(EXTRA_MESSAGE)
        tv_berhasil.setText(
            "Beres! Sekarang "+nama +" udah bisa ngecek penggunaan HP mu tiap hari buat " +
                    "bantu kamu ngatur waktu :)"
        )
    }
}
