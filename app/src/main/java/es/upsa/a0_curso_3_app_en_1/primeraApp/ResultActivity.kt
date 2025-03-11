package es.upsa.a0_curso_3_app_en_1.primeraApp

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.upsa.a0_curso_3_app_en_1.R
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityFirstAppBinding
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // decimos a Android que genere automáticamente la clase, importante antes del 'setContentView'
        val viewBinding = ActivityResultBinding.inflate( this.layoutInflater )
        // setContentView(R.layout.activity_first_app)
        setContentView( viewBinding.root ) // fijamos que la vista es el elemento raiz.

        // ______________ RECOGER VALOR DE NAGEGACIÓN ______________
        val name = intent.extras?.getString("EXTRA_NAME").orEmpty() // me devuelve el valor de pasado por la otra pantalla

        // SE MUESTRA POR PANTALLA
        viewBinding.tv.setText(name)
    }
}