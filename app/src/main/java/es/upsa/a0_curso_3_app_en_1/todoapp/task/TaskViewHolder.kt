package es.upsa.a0_curso_3_app_en_1.todoapp.task

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import es.upsa.a0_curso_3_app_en_1.R

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val tvTask: TextView = view.findViewById<TextView>(R.id.tvTask)
    private val cbTask: CheckBox = view.findViewById<CheckBox>(R.id.cbTask)

    fun render(task: Task){
        tvTask.text = task.name
    }
}