package es.upsa.a0_curso_3_app_en_1.imcCalculator

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityImcCalculatorBinding


class ImcCalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val viewBinding = ActivityImcCalculatorBinding.inflate(this.layoutInflater)

        setContentView(viewBinding.root)



    }


}