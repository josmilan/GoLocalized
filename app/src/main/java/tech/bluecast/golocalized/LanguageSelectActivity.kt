package tech.bluecast.golocalized

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import tech.bluecast.golocale.GoLocale


class LanguageSelectActivity :AppCompatActivity() {

    lateinit var btnEnglish:Button
    lateinit var btnMalayalam:Button
    lateinit var btnArabic:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_select)

        btnEnglish = findViewById(R.id.btnEnglish)
        btnMalayalam = findViewById(R.id.btnMalayalam)
        btnArabic = findViewById(R.id.btnArabic)

        btnEnglish.setOnClickListener {
            GoLocale.setLocale(this@LanguageSelectActivity,"en")
        }
        btnMalayalam.setOnClickListener {
            GoLocale.setLocale(applicationContext,"ml-rIN")
        }
        btnArabic.setOnClickListener {
            GoLocale.setLocale(applicationContext,"ar")
        }
    }
}