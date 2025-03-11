package es.upsa.a0_curso_3_app_en_1.imcCalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import es.upsa.a0_curso_3_app_en_1.R
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityResultImcactivityBinding

class ResultIMCActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityResultImcactivityBinding

    private lateinit var tvResult: TextView
    private lateinit var tvIMC: TextView
    private lateinit var tvDescription: TextView

    private lateinit var btAtras: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityResultImcactivityBinding.inflate(this.layoutInflater)
        setContentView(viewBinding.root)

        // Recibir parametros de la pantalla principal
        val result = intent.extras?.getDouble(ImcCalculatorActivity.Companion.IMC_KEY) ?: -1.0

        initComponents()
        initUI(result)
        irAtras()
    }

    private fun initComponents(){
        tvResult = viewBinding.tvResult
        tvIMC = viewBinding.tvIMC
        tvDescription = viewBinding.tvDescription
        btAtras = viewBinding.btnRecalculate
    }

    private fun initUI(result: Double){

        tvIMC.text = result.toString()

        when(result){

            in 0.00..18.50 -> { // Bajo
                tvResult.text = getString(R.string.bajo_peso)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tvDescription.text = getString(R.string.descrip_bajo)
            }
            in 18.51..24.99 -> { // Normal
                tvResult.text = getString(R.string.normal)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tvDescription.text = getString(R.string.descrip_normal)
            }
            in 25.00..29.99 -> { // Sobrepeso
                tvResult.text = getString(R.string.sobrepeso)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.peso_sobrepeso))
                tvDescription.text = getString(R.string.descrip_sobrepeso)
            }
            in 30.00..99.00 -> { // Obesidad
                tvResult.text = getString(R.string.obesidad)
                tvResult.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tvDescription.text = getString(R.string.descrip_obesidad)
            }
            else -> {  // Error
                tvResult.text = getString(R.string.error)
                tvIMC.text = getString(R.string.error)
                tvDescription.text = getString(R.string.error)
            }

        }
    }

    private fun irAtras(){
        btAtras.setOnClickListener {
            onBackPressedDispatcher.onBackPressed() // Volver atrás
        }
    }
}