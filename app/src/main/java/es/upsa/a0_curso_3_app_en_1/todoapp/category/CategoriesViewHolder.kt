package es.upsa.a0_curso_3_app_en_1.todoapp.category

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import es.upsa.a0_curso_3_app_en_1.R

class CategoriesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val viewContainer: CardView = view.findViewById<CardView>(R.id.viewContainerCategory)
    private val tvCategoryName: TextView = view.findViewById<TextView>(R.id.tvCategoryName)
    private val divider: View = view.findViewById<TextView>(R.id.divider)

    fun render(taskCategory: TaskCategory, onItemSelected:(Int) -> Unit){

        val color = if (taskCategory.isSelected){
            R.color.todo_background_card
        } else {
            R.color.todo_background_disabled
        }

        // Establecemos el color
        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))

        itemView.setOnClickListener {
            onItemSelected(layoutPosition)  // en el TodoActivity llega la funcion lAmbda con su logica
        }

        when(taskCategory){

            TaskCategory.Business -> {
                tvCategoryName.text = "Negocios"

                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_business_category)
                )
            }

            TaskCategory.Other -> {
                tvCategoryName.text = "Otros"

                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_other_category)
                )
            }

            TaskCategory.Personal -> {
                tvCategoryName.text = "Personal"

                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.todo_personal_category)
                )
            }
        }
    }

}