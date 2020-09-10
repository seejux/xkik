package com.seeju.xkik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seeju.xkik.data.Preferences

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        if (intent.hasExtra("select_new_pack")) {
            val extra = intent.getStringExtra("select_new_pack")
                ?: throw IllegalStateException("Extra cannot be null")
//            Timber.i("Instaprefs was started with Intent Extra 'select_new_pack' - '$extra'. Selecting new Pack.")
            Preferences.SELECTED_PACKS.putPref(extra)
            finish()
            return
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}