package es.upsa.a0_curso_3_app_en_1.primeraApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import es.upsa.a0_curso_3_app_en_1.R
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityFirstAppBinding


// class es como un contenedor de funciones
class FirstAppActivity : AppCompatActivity() {

    // private var viewBinding: ActivityFirstAppBinding? = null

    companion object // es un contenedor añadir variables 'static' en Kotlin
    {
        private val TAG = FirstAppActivity::class.java.name
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        // decimos a Android que genere automáticamente la clase, importante antes del 'setContentView'
        val viewBinding = ActivityFirstAppBinding.inflate( this.layoutInflater )
        // setContentView(R.layout.activity_first_app)
         setContentView( viewBinding.root ) // fijamos que la vista es el elemento raiz.

        // _____________ ACCION DE PULSAR EL BOTON _____________
        viewBinding.bt.setOnClickListener {

            val nameEditext =  viewBinding.et.text.toString() // recogemos valor del EditText

            if ( nameEditext.isNotEmpty() ) {
                Log.i(TAG, "Pulsando el botón con text ${nameEditext}")

                // ______________ NAVEGACIÓN ______________
                // Necesitamos el contexto (this, significa esta Activity) y a que actividad queremos ir
                val intent = Intent(this, ResultActivity::class.java)
                // le puedo pasar información a la otra Actividad
                intent.putExtra(getString(R.string.extra_name), nameEditext)
                // La navegación a través del intent
                startActivity(intent)
            }
        }

    }
}

