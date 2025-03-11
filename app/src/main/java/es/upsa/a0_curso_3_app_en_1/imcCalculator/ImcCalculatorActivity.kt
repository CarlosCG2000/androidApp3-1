package es.upsa.a0_curso_3_app_en_1.imcCalculator

import android.content.Context
import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import es.upsa.a0_curso_3_app_en_1.Logger
import es.upsa.a0_curso_3_app_en_1.R
import es.upsa.a0_curso_3_app_en_1.imcCalculator.ResultIMCActivity
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityImcCalculatorBinding

class ImcCalculatorActivity : AppCompatActivity(), Logger {

    // ______________________ ATRIBUTOS ______________________
    private lateinit var viewBinding: ActivityImcCalculatorBinding

    private lateinit var vcMale: CardView
    private lateinit var vcFemale: CardView
    private var isViewSelected: Boolean = true // marcado el hombre, false es la mujer

    private lateinit var tvHeigth: TextView
    var currentHeigth: Int = 160
    private lateinit var rangeSlider: RangeSlider

    private lateinit var tvWeight: TextView
    private var currentWeight = 65
    private lateinit var btSubtract: FloatingActionButton
    private lateinit var btPlus: FloatingActionButton

    private lateinit var tvAge: TextView
    private var currentAge = 25
    private lateinit var btSubtractAge: FloatingActionButton
    private lateinit var btPlusAge: FloatingActionButton

    private lateinit var btCalculoNavegacion: Button

    // Atributo estatico con una constante con el nombre del parámetro para la navegación.
    // Todo lo que esta dentro puede acceder cualquier fichero a ello
    companion object {
        const val IMC_KEY = "IMC_RESULT"
    }

    // __________________________________________________________

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        viewBinding = ActivityImcCalculatorBinding.inflate(this.layoutInflater)
        setContentView(viewBinding.root)

        initComponents()
        initListenersClickGender()  // de los botones de de genero
        initListenersChangeHeitgh() // del slider de altura
        initListenersClickWeitgh() // de los botones de peso
        initListenersClickAge() // de los botones de la edad
        initListenersClickCalcNavegacion() // calcular el IMC y navegar a la siguiente página
    }

    // ______________________ FUNCIONES DE IMPLEMENTACIÓN ______________________
    fun initComponents(){
        vcMale = viewBinding.cvMale
        vcFemale = viewBinding.cvFemale

        tvHeigth = viewBinding.tvValorSlider
        tvHeigth.text = getString(R.string.layout_valor_slider, currentHeigth) // por defecto el text del slider
        rangeSlider = viewBinding.rsHeigth
        rangeSlider.setValues(currentHeigth.toFloat())  // por defecto el valor del slider

        tvWeight = viewBinding.tvValorPeso
        tvWeight.text = getString(R.string.label_peso, currentWeight)
        btSubtract = viewBinding.btSubtract
        btPlus = viewBinding.btPlus

        tvAge = viewBinding.tvValorEdad
        tvAge.text = getString(R.string.label_edad, currentAge)
        btSubtractAge = viewBinding.btSubtractAge
        btPlusAge = viewBinding.btPlusAge

        btCalculoNavegacion = viewBinding.btNavegar
    }

    fun initListenersClickGender(){
        vcMale.setOnClickListener {
            isViewSelected = true // hombre seleccionado
            setBackgroundColor()
            logInfo("Color de fondo hombre a $isViewSelected")
        }

        vcFemale.setOnClickListener {
            isViewSelected = false // mujer seleccionada
            setBackgroundColor()
            logInfo("Color de fondo mujer a ${!isViewSelected}")
        }
    }

    fun initListenersChangeHeitgh(){
       rangeSlider.addOnChangeListener { _, valor, _ ->
           currentHeigth = valor.toInt()
           tvHeigth.text = getString(R.string.layout_valor_slider, currentHeigth)
       }
    }

    fun initListenersClickWeitgh(){
        btSubtract.setOnClickListener {
            currentWeight -= 1
            tvWeight.text = getString(R.string.label_peso, currentWeight)
        }

        btPlus.setOnClickListener {
            currentWeight += 1
            tvWeight.text = getString(R.string.label_peso, currentWeight)
        }
    }

    fun initListenersClickAge(){
        btSubtractAge.setOnClickListener {
            currentAge -= 1
            tvAge.text = getString(R.string.label_edad, currentAge)
        }

        btPlusAge.setOnClickListener {
            currentAge += 1
            tvAge.text = getString(R.string.label_edad, currentAge)
        }
    }

    fun initListenersClickCalcNavegacion() {
        btCalculoNavegacion.setOnClickListener {
            val df = DecimalFormat("#.##")
            val alturaMetros = currentHeigth.toFloat() / 100

            val imc = df.format(currentWeight / (alturaMetros * alturaMetros))
            logInfo("Resultado del calculo $imc")

            val intent = Intent(this, ResultIMCActivity::class.java) // navegación a ResultIMCActivity
            intent.putExtra(IMC_KEY, imc.toDouble()) // envio de parametro en la navegación
            startActivity(intent)

            logInfo("Enviando...")
        }
    }

    fun setBackgroundColor(){
        vcMale.setCardBackgroundColor(getBackgroundColor(isViewSelected))
        vcFemale.setCardBackgroundColor(getBackgroundColor(!isViewSelected))
    }

    fun getBackgroundColor(isViewSelect: Boolean): Int{

        val colorReference = if (isViewSelect){
            R.color.background_component_selected
        } else {
            R.color.background_component
        }

        return ContextCompat.getColor(this, colorReference) // Crear el color (es un Int)
    }

     // __________________________________________________________

}

