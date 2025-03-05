package es.upsa.a0_curso_3_app_en_1.primeraApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityFirstAppBinding


// class es como un contenedor de funciones
class FirstAppActivity : AppCompatActivity() {

    // private var viewBinding: ActivityFirstAppBinding? = null
    private val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val viewBinding = ActivityFirstAppBinding.inflate( this.layoutInflater); // decimos a Android que genere automáticamente la clase, importante antes del 'setContentView'
        // setContentView(R.layout.activity_first_app)
         setContentView( viewBinding.root ) // fijamos que la vista es el elemento raiz.

        val btn:AppCompatButton = viewBinding.bt // findViewById<AppCompatButton>(R.id.bt)
        val edtext:AppCompatEditText = viewBinding.et

        btn.setOnClickListener {
            // View.OnClickListener() {}
            val name = edtext.text.toString()

            if ( name.isNotEmpty() ) {
                Log.i(TAG, "Pulsando el botón con text ${edtext.text.toString()}")

                // Necesitamos el contexto (this, significa esta Activity) y a que actividad queremos ir
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name) // le puedo pasar informacion a la otra Actividad
                // La navegacion a traves del intent
                startActivity(intent)
            }
        }

    }
}

