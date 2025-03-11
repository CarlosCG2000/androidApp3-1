package es.upsa.a0_curso_3_app_en_1.todoapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import es.upsa.a0_curso_3_app_en_1.R
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityImcCalculatorBinding
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityTodoBinding

class TodoActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityTodoBinding

    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private val categories = listOf<TaskCategory>(
        TaskCategory.Business,
        TaskCategory.Personal,
        TaskCategory.Other
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityTodoBinding.inflate(this.layoutInflater)
        setContentView(viewBinding.root)

        initComponent()
        initUI()
    }

    private fun initComponent(){
        rvCategories = viewBinding.rvCategories
    }

    private fun initUI(){
       // Vamos a tener que crear un adaptador y un viewHolder
       // El adapter es una clase que conecta toda la información con el RecyclerView. Es el puente entre los datos (items) y la interfaz (RecyclerView).
       // Y el ViewHolder va a ser la clase que lo pinta.

        // les pasamos las categorias
        categoriesAdapter = CategoriesAdapter(categories)

        // layoutManager se encarga de que la vista sea horizontal o vertical
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // pasamos por ultimo el adapter
        rvCategories.adapter = categoriesAdapter
    }

}