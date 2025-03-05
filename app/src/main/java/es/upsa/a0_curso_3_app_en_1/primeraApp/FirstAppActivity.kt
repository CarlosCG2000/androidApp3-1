package es.upsa.a0_curso_3_app_en_1.primeraApp

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

        val viewBinding = ActivityFirstAppBinding.inflate( this.getLayoutInflater() ); // decimos a Android que genere automáticamente la clase, importante antes del 'setContentView'
        // setContentView(R.layout.activity_first_app)
         setContentView( viewBinding.getRoot() ) // fijamos que la vista es el elemento raiz.

        val btn:AppCompatButton = viewBinding.bt // findViewById<AppCompatButton>(R.id.bt)
        val edtext:AppCompatEditText = viewBinding.et

        btn.setOnClickListener {
            // View.OnClickListener() {}
            val name = edtext.text.toString()

            if ( name.isNotEmpty() )
                Log.i(TAG, "Pulsando el botón con text ${edtext.text.toString()}")
        }

    }
}

