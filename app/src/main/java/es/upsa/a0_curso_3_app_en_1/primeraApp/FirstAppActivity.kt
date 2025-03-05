package es.upsa.a0_curso_3_app_en_1.primeraApp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.upsa.a0_curso_3_app_en_1.R
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityFirstAppBinding


// class es como un contenedor de funciones
class FirstAppActivity : AppCompatActivity() {

    // private var viewBinding: ActivityFirstAppBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val viewBinding = ActivityFirstAppBinding.inflate( this.getLayoutInflater() ); // decimos a Android que genere automáticamente la clase, importante antes del 'setContentView'
        // setContentView(R.layout.activity_first_app)
         setContentView( viewBinding.getRoot() ) // fijamos que la vista es el elemento raiz.

        val btn = viewBinding.bt

        btn.setOnClickListener {
           
        }
    }
}