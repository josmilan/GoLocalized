package tech.bluecast.golocalized

import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import tech.bluecast.golocale.GoLocale


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun attachBaseContext(newBase: Context) {
        var newBase = newBase
        newBase = GoLocale.onAttach(newBase,"en")
        super.attachBaseContext(newBase)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.selectLang -> {
                GoLocale.setLocale(this@MainActivity,"ar")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onResume() {
        super.onResume()
        val lang = GoLocale.getLanguage(applicationContext)
        GoLocale.setLocale(applicationContext, lang)
    }
}
