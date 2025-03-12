package es.upsa.a0_curso_3_app_en_1.todoapp

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import es.upsa.a0_curso_3_app_en_1.R
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
        categoriesAdapter = CategoriesAdapter(categories){ position ->
            onItemCategorySelect(position)
        }

        // layoutManager se encarga de que la vista sea horizontal o vertical
        rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // pasamos por ultimo el adapter
        rvCategories.adapter = categoriesAdapter
    }

    private fun initTasksUI(){
        // les pasamos las tasks y la funcion lambda que se ejecuta
        tasksAdapter = TaskAdapter(
            tasks
        ){ position ->
            onItemTaskSelected(position) // que cambia el check y actualiza la vista
        }

        // layoutManager en vertical (por defecto
        rvTasks.layoutManager = LinearLayoutManager(this)
        // pasamos por ultimo el adapter
        rvTasks.adapter = tasksAdapter

    }

    private fun onItemCategorySelect(position:Int){
        // acceder al listaod de categorias y modifcar el valor de id selectec cuando se pulse
        categories[position].isSelected = !categories[position].isSelected

        categoriesAdapter.notifyItemChanged(position) // ha habido un item que ha estado modificado,en vez de como 'updateTasks()' que es mas general diciencio que se ha modficado algo en los TASK
        updateTasks()
    }

    private fun onItemTaskSelected(position:Int){
        tasks[position].isSelector = !tasks[position].isSelector // si estaba seleccionado hay que deseleccionarlo y al reves si estaba deseleccionarlo hay que seleccionarlo
        updateTasks() // hay que notificar los CAMBIOS AL TASK
    }

    private fun initListenerDialog(){
        fabAddTask.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog(){
        // Hay varios tipos de dialogos (pop up).
        val dialog = Dialog(this) // creamos el dialogo

        // Hay que crear la vista del dialogo y asignarselo. (dialog_task.xml)
        dialog.setContentView(R.layout.dialog_task)

        // Lógica del dialogo
        val btnAddTask: Button = dialog.findViewById<Button>(R.id.btnAddTask)
        val etTask: EditText = dialog.findViewById<EditText>(R.id.etTask)
        val rgCategories: RadioGroup = dialog.findViewById<RadioGroup>(R.id.rgCategories)

        btnAddTask.setOnClickListener {
            val currentTask = etTask.text.toString()

            if (currentTask.isNotEmpty()) {
                // Dame el id del boton seleccionado del radio
                val selectedId = rgCategories.checkedRadioButtonId
                // Dame el boton seleccionado del radio
                val selectedRadioButton = rgCategories.findViewById<RadioButton>(selectedId)

                val currentCategory: TaskCategory = when (selectedRadioButton.text) {
                    /*"Negocios"*/ getString(R.string.todo_dialog_category_business) -> Business // TaskCategory.Business
                    /*"Personal"*/ getString(R.string.todo_dialog_category_personal) -> Personal
                    else -> Other
                }

                // añadir una nueva tarea al listado de tareas
                tasks.add(Task(currentTask, currentCategory))

                // aunque actualizamos la lista del RecicledView hay que avisar al adapter
                updateTasks()

                dialog.hide() // se cierre el dialogo
            }
        }

        // Mostramos el dialogo
        dialog.show()
    }

    // Lo que va a hacer es avisar al adaptador de que hay nuevos items
    private fun updateTasks(){
        // filtrar las categorias solo seleccionadas
        val selectedCategories: List<TaskCategory> = categories.filter { categoriaItem ->
            categoriaItem.isSelected
        }

        // filtra entre todas las tareas, de las categorias seleccionadas si pertenene a esa categoria
        val newTasks = tasks.filter { taskItem ->
            selectedCategories.contains(taskItem.category)
        }

        tasksAdapter.tasks = newTasks

        tasksAdapter.notifyDataSetChanged() // no es lo mas optimo porque va acomprobar uno por uno todas las tareas.


    }

}