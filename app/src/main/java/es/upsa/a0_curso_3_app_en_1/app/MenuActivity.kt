package es.upsa.a0_curso_3_app_en_1.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.upsa.a0_curso_3_app_en_1.app.imcCalculator.ImcCalculatorActivity
import es.upsa.a0_curso_3_app_en_1.app.primeraApp.FirstAppActivity
import es.upsa.a0_curso_3_app_en_1.app.superheroapp.SuperHeroListActivity
import es.upsa.a0_curso_3_app_en_1.app.todoapp.TodoActivity

import es.upsa.a0_curso_3_app_en_1.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMenuBinding.inflate( this.layoutInflater )
        setContentView(viewBinding.root)

        viewBinding.bt1.setOnClickListener { navegarToEjemploApp() }
        viewBinding.btIMC.setOnClickListener { navegarToIMCApp() }
        viewBinding.btTODO.setOnClickListener { navegarToTODOApp() }
        viewBinding.btSuperHero.setOnClickListener { navegarSuperHeroApp() }

    }

    private fun navegarToEjemploApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }

    private fun navegarToIMCApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navegarToTODOApp(){
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navegarSuperHeroApp(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }

}