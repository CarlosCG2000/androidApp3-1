package es.upsa.a0_curso_3_app_en_1.app.todoapp.task

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.upsa.a0_curso_3_app_en_1.R

//  onTaskSelected es una funcion labmda que va a recibir un Int devolver un void
class TaskAdapter(var tasks: List<Task>,
                  private val onTaskSelected:(Int) -> Unit)
                    : RecyclerView.Adapter<TaskViewHolder>() {

    override fun onCreateViewHolder( parent: ViewGroup,  viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)

        return TaskViewHolder(view)
    }

    override fun onBindViewHolder( holder: TaskViewHolder,  position: Int) {
        holder.render(tasks[position])

        holder.itemView.setOnClickListener { // es todo la celda todo el Task
            onTaskSelected(position) // la función labmda es ejecutada, la cual llama en el ·"TodoActivity" donde se declara la funcion dentro de la lambda
        }
    }

    override fun getItemCount() = tasks.size
}