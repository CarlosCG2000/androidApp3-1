package es.upsa.a0_curso_3_app_en_1.todoapp.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.upsa.a0_curso_3_app_en_1.R

class CategoriesAdapter(private val categories:List<TaskCategory>,
    private val onItemSelected:(Int) -> Unit // lamnbda para obtener el item u filtrar
    ): RecyclerView.Adapter<CategoriesViewHolder>() {

    // Monta una vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        // Estoy creando un viewHolder (contiene el layout - view) para cada uno de los items
        return CategoriesViewHolder(view)
    }

    // Pasa la informaicion que le tengo que pasar
    override fun onBindViewHolder( holder: CategoriesViewHolder, position: Int ) {
        //holder es como lla mar a cada uno de los items
        holder.render(categories[position],
                      onItemSelected) // la lambda que esta tambein en el render del ViewHolder (Categories)
    }

    // Muestra el tamaño de elementos que le pasemos
    override fun getItemCount(): Int = categories.size

}