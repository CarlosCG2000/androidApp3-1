package es.upsa.a0_curso_3_app_en_1.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.upsa.a0_curso_3_app_en_1.R
import es.upsa.a0_curso_3_app_en_1.databinding.ActivityTodoBinding


class CategoriesAdapter(private val categories:List<TaskCategory>): RecyclerView.Adapter<CategoriesViewHolder>() {

    // Monta una vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)

        // Estoy creando un viewHolder (contiene el layout - view) para cada uno de los items
        return CategoriesViewHolder(view)
    }

    // Pasa la informaicion que le tengo que pasar
    override fun onBindViewHolder( holder: CategoriesViewHolder, position: Int ) {
        //holder es como lla mar a cada uno de los items
        holder.render(categories[position])
    }

    // Muestra el tamaño de elementos que le pasemos
    override fun getItemCount(): Int = categories.size

}