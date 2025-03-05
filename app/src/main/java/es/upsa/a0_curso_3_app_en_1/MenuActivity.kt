package es.upsa.a0_curso_3_app_en_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import es.upsa.a0_curso_3_app_en_1.databinding.ActivityMenuBinding
import es.upsa.a0_curso_3_app_en_1.primeraApp.FirstAppActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding = ActivityMenuBinding.inflate( this.layoutInflater )

        setContentView(viewBinding.root)

        val btInicio:Button = viewBinding.bt1

        btInicio.setOnClickListener { navegarToEjemploApp() }
    }
    
    private fun navegarToEjemploApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }


}