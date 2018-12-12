package cubex.mahesh.spinner_dec7am

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_language_selection.*

class LanguageSelection : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_selection)

        english.setOnClickListener {


            val i = Intent(this@LanguageSelection,
                                            MainActivity::class.java)
            startActivity(i)
        }

        hindi.setOnClickListener {
            val i = Intent(this@LanguageSelection,
                MainActivity::class.java)
            startActivity(i)
        }



    }
}
