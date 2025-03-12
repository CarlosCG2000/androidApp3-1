package es.upsa.a0_curso_3_app_en_1.todoapp.task

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import es.upsa.a0_curso_3_app_en_1.R
import es.upsa.a0_curso_3_app_en_1.todoapp.category.TaskCategory

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val tvTask: TextView = view.findViewById<TextView>(R.id.tvTask)
    private val cbTask: CheckBox = view.findViewById<CheckBox>(R.id.cbTask)

    fun render(task: Task){
        tvTask.text = task.name

        cbTask.isChecked = task.isSelector

        if (task.isSelector){ // si la tarea esta seleccionada
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG // tachar el texto
        } else {
            tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        val color = when(task.category){
            TaskCategory.Business -> R.color.todo_business_category
            TaskCategory.Other -> R.color.todo_other_category
            TaskCategory.Personal -> R.color.todo_personal_category
        }

        // Estableces el color en el radio button
        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context, color)  // todas las vistas tienen el contexto de us actividad
        )

    }
}