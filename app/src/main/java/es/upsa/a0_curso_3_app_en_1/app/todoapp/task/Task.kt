package es.upsa.a0_curso_3_app_en_1.app.todoapp.task

import es.upsa.a0_curso_3_app_en_1.app.todoapp.category.TaskCategory

data class Task(val name:String, val category: TaskCategory, var isSelector: Boolean = false){



}