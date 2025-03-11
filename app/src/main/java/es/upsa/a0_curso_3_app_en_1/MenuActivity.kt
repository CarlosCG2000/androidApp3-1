package es.upsa.a0_curso_3_app_en_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import es.upsa.a0_curso_3_app_en_1.databinding.ActivityMenuBinding
import es.upsa.a0_curso_3_app_en_1.imcCalculator.ImcCalculatorActivity
import es.upsa.a0_curso_3_app_en_1.primeraApp.FirstAppActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMenuBinding.inflate( this.layoutInflater )
        setContentView(viewBinding.root)

        viewBinding.bt1.setOnClickListener { navegarToEjemploApp() }
        viewBinding.btIMC.setOnClickListener { navegarToIMCApp() }
    }

    private fun navegarToEjemploApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navegarToIMCApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

}