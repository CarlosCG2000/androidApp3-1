package es.upsa.a0_curso_3_app_en_1.todoapp

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityTodoBinding
import es.upsa.a0_curso_3_app_en_1.todoapp.category.CategoriesAdapter
import es.upsa.a0_curso_3_app_en_1.todoapp.category.TaskCategory
import es.upsa.a0_curso_3_app_en_1.todoapp.category.TaskCategory.*
import es.upsa.a0_curso_3_app_en_1.todoapp.task.Task
import es.upsa.a0_curso_3_app_en_1.todoapp.task.TaskAdapter

class TodoActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityTodoBinding

    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rvTasks: RecyclerView
    private lateinit var tasksAdapter: TaskAdapter

    private lateinit var fabAddTask: FloatingActionButton

    // Es el listado que le estoy pasando
    private val categories = listOf<TaskCategory>(
        Business, // TaskCategory.Business
        Personal,
        Other
    )

    // mutable poprque se van a ir borrando y añadiendo a la lista
    private val tasks = mutableListOf<Task>(
        Task("PruebaBusiness", Business), // , TaskCategory.Business
        Task("PruebaPersonal", Personal),
        Task("PruebaOther", Other)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityTodoBinding.inflate(this.layoutInflater)
        setContentView(viewBinding.root)

        initComponent()
        initCategoriesUI()
        initTasksUI()
        initListenerDialog()
    }

    private fun initComponent(){
        rvCategories = viewBinding.rvCategories
        rvTasks = viewBinding.rvTasks
        fabAddTask= viewBinding.fabAddTask
    }

    private fun initCategoriesUI(){
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

    private fun initTasksUI(){
        // les pasamos las tasks
        tasksAdapter = TaskAdapter(tasks)
        // layoutManager en vertical (por defecto
        rvTasks.layoutManager = LinearLayoutManager(this)
        // pasamos por ultimo el adapter
        rvTasks.adapter = tasksAdapter

    }

    private fun initListenerDialog(){
        fabAddTask.setOnClickListener {

        }
    }

    private fun showDialog(){
        // Hay varios tipos de dialogos (pop up).
        val dialog = Dialog(this) // creamos el dialogo

        // Hay que crear la vista del dialogo y asignarselo. (dialog_task.xml)



    }

}