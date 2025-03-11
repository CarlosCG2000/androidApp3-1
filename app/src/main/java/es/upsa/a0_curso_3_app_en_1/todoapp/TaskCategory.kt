package es.upsa.a0_curso_3_app_en_1.todoapp

sealed class TaskCategory {
    object Personal: TaskCategory()
    object Business: TaskCategory()
    object Other: TaskCategory()
}

// List<TaskCategory>  -->  Esta lista ya podria contener tanto Personal, Business, Other

