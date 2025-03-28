
Aprende a programar sin conocimientos previos. Empezaremos desde lo más básico hasta conseguir desarrollar una aplicación completa.

## Aprende a PROGRAMAR aplicaciones ANDROID en KOTLIN desde CERO.
El curso se irá haciendo en DIRECTO en [TWITCH](https://www.twitch.tv/aristidevs), donde además de explicar resolveré dudas y haremos ejercicios. Una vez esté el contenido grabado y editado se irá subiendo a [YOUTUBE](https://www.youtube.com/@aristidevs).

El temario del curso será:
- [¿Qué es Kotlin?](https://youtu.be/vJapzH_46a8) ✅
- [Instalar Android Studio para Kotlin](https://youtu.be/vJapzH_46a8?t=200) ✅

- [Valores y variables en Kotlin](https://youtu.be/vJapzH_46a8?t=1097) ✅
- [Trabajando con variables en Kotlin](https://youtu.be/vJapzH_46a8?t=2275) ✅
- [Funciones en Kotlin](https://youtu.be/vJapzH_46a8?t=3128) ✅
- [Funciones con parámetros de entrada y salida](https://youtu.be/vJapzH_46a8?t=3699) ✅
- [Instrucciones if-else en Kotlin](https://youtu.be/vJapzH_46a8?t=4428) ✅
- [Expresión when en Kotlin](https://youtu.be/vJapzH_46a8?t=6334) ✅
- [Nulabilidad](https://youtu.be/vJapzH_46a8?t=7666) ✅
- [Ejercicios If-else/When](https://youtu.be/vJapzH_46a8?t=8097) ✅
- [Arrays en Kotlin](https://youtu.be/vJapzH_46a8?t=9141) ✅
- [Listas en Kotlin](https://youtu.be/vJapzH_46a8?t=10165) ✅

- [Desarrollando nuestra primera APP](https://youtu.be/vJapzH_46a8?t=11200) ✅
  - Navegación de pantallas ✅
- [Crear un menú para navegar entre apps](https://youtu.be/vJapzH_46a8?t=14874) ✅

- [Diseñar y programar app completa IMC](https://youtu.be/vJapzH_46a8?t=15773) ✅
  - Cambios entre pantallas ✅
  - Gestión y creación de colores ✅
  - Diseño de UI ✅
  - CardView ✅
  - RangeSlider ✅
  - Compatibilidad con múltiples idiomas (Strings) ✅
  - Listeners y clicks ✅

- [Diseñar y programar app completa TODO](https://youtu.be/vJapzH_46a8?t=23805) ✅
  - Recyclerview ✅
  - Dialog ✅
  - Sealed class ✅
  - Funciones lambdas ✅

- [Diseñar y programar una buscador de Superhéroes](https://youtu.be/ndqIqh6joGA?t=9)
  - SearchView
  - Consumo de APIs con Retrofit
  - Funciones lambdas
  - Recyclerview

- [Diseñar y programar una pantalla de ajustes con persistencia de datos](https://youtu.be/ndqIqh6joGA?t=10446)
  - Persistencia de datos con DataStore
  - Switch y RangeSlider
  - Modo noche

=====================================================================================================

## ESQUELETO DE LA APP

- Fichero `MenuActivity.kt`: es un `class`.
- Fichero `Logger.kt`: es una `interface` donde se definen los casos posibles de lineas de log.

* Carpeta `primeraApp`:
    - Fichero `FirstAppActivity.kt`: es un `class`
    - Fichero `ResultActivity.kt`: es un `class`

* Carpeta `imcCalculator`:
    - Fichero `ImcCalculatorActivity.kt`: es un `class`
    - Fichero `ResultIMCActivity.kt`: es un `class`

* Carpeta `todoapp`:
    - Fichero `TodoActivity.kt`: es un `class`

    + Subcarpeta `category`:
        - Fichero `TaskCategory.kt`: es un `sealed class`
        - Fichero `CategoriesAdapter.kt`: es un `class`
        - Fichero `CategoriesViewHolder.kt`: es un `class`

    + Subcarpeta `task`:
        - Fichero `Task.kt`: es un `data class`
        - Fichero `TaskAdapter.kt`: es un `class`
        - Fichero `TaskViewHolder.kt`: es un `class`

* Carpeta `superheroapp`:
    - Fichero `ApiService.kt`: es un `interface`
    - Fichero `SuperHeroDataResponse.kt`: es un `data class`
    - Fichero `SuperheroAdapter.kt`: es un `class`
    - Fichero `SuperheroViewHolder.kt`: es un `class`
    - Fichero `SuperHeroListActivity.kt`: es un `class`

* Carpeta de recursos `layout`:
    - Fichero `FirstAppActivity.xml`: vista Primera App Ejemplo
    - Fichero `ResultActivity.xml`: vista Primera App Ejemplo
    - Fichero `MenuActivity.xml`: vista IMC Calculator
    - Fichero `ImcCalculatorActivity.xml`: vista IMC Calculator
    - Fichero `ResultIMCActivity.xml`: vista IMC Calculator
    - Fichero `TodoActivity.xml`: vista TODO List
    - Fichero `ItemTodoTask.xml`: vista TODO List
    - Fichero `ItemTaskCategory.xml`: vista TODO List
    - Fichero `DialogTask.xml`: vista TODO List
    - Fichero `SuperHeroListActivity.xml`: vista SuperHero
    - ...

# VIDEO: CURSO: ANDROID desde CERO con KOTLIN - TUTORIAL ANDROID STUDIO [2023] - PARTE 1
# URL: `https://www.youtube.com/watch?v=vJapzH_46a8` (`HORAS 9:21`)

# 0. Introducción del proyecto
Lo primero que hay que hacer es entender el proyecto.

Nuestra app se divide en dos partes:
- `la visual`: los elementos (`layouts`) del dispositivo. Bien en `XML` o `Jetpack Compose`.
- `la logica`: la `interacción` con los elementos del dispositivo. En `Java` o `Kotlin`.

Esto es un `activity`: el conjunto entre la parte lógica y la parte visual.

Vamos a dividir para cada mini proyecto `un package`, para probar muchas cosas en un mismo proyecto.

* Esto `no es lo recomendable`, ya que lo que deberiamos es seguir `una arquitectura` para probarlo con `Clean Arquitecture` pero como es el primer proyecto para verlo con funciona nos vale.

# 1. Primera App
Creamos en un package nuevo con el nombre `primeraApp`.

Creamos dentro un `Empty Views Activity` (ojo cuidado no una `Empty Activity` que utiliza `Jetpack Compose` en vez de `XML`) llamado `FirstAppActivity` y solo esta vez la seleccionaremos como `Launcher Activity` ya que no tenemos ninguna pantalla.

* [ Ver mejor en clases de Roberto `de la explicación de los Layout` ]
En este curso empezamos por explicación de `FrameLayout`, `LinearLayout` y `ContraintLayout` (lo mejor).
Podemos extraer `nuevas propiedades` y conocimientos que no tengo de las `clases del grado con Roberto`.

Tener en cuenta que se pueden `anidar unos layouts` dentro de otros.

El fichero `AndroidManifest.xml` es donde se encuentran que `Activities` se tiene, que permisos, etc.

## 1.1. Navegación de pantallas
Para navegar usamos los `intents`

- Pantalla inicio:
```java
    // Necesitamos el contexto (this, significa esta Activity) y a que actividad queremos ir
    val intent = Intent(this, ResultActivity::class.java)
    intent.putExtra("EXTRA_NAME", name) // le puedo pasar informacion a la otra Actividad
    // La navegacion a traves del intent
    startActivity(intent)
```

Pantalla llegar:
```java
 val name = intent.extras?.getString("EXTRA_NAME").orEmpty() // me devuelve el valor de pasado por la otra pantalla
```

## 1.2. Crear un menú para navegar entre apps
### `[ MIRAR COMO SERIA PARA REPLICAR MI MENU DE LOS SIMPSONS PUEDO CREAR UNA APLICACIÓN PARA EMPEZAR A VERLO ]`

# 2. Diseñar y programar app completa IMC
Definición de `los colores` en los `recursos: colors.xml`.
### `[ DEFINIR LOS COLORES DE MI APLICACIÓN IGUALMENTE EN LOS RECURSOS ANTES DE COMENZAR LA APLICACIÓN]`

Las `vistas` se va a formar a partir de `varios componentes`.

He creado una interfaz llamada `Logger.kt` donde defino todo los logs con su tags para poder implementarlo en los ficheros.

Los `Themes` son los temas que tengo, solo hay uno puesto en el `Manifest` pero puedo personalizar los mios propios.

Un `RecycledView` es la forma correcta de cargar listas de elementos.
Vamos a tener que crear un `adaptador` y un `viewHolder`.
El `adapter` es una clase que conecta toda la información con el `RecyclerView`. Es el puente entre los datos `(items)` y la interfaz `(RecyclerView)`. Y el `ViewHolder` va a ser la clase que lo pinta.

Vamos a necesitar las `Sealed Class`. Las clases selladas, con esto vamos a crear subclases o sub objetos de esta clase principal. Son como enumerados con superpoderes porque pueden contener estados.

# VIDEO: CURSO: ANDROID desde CERO con KOTLIN - TUTORIAL ANDROID STUDIO [2023] - PARTE 2
# URL: `https://www.youtube.com/watch?v=ndqIqh6joGA` (`HORAS 4:11`)

Añadimos la dependencia para consumir APIS: `retroFit`.
Ponemos en el buscador de dependencias `com.squareup.retrofit2:retrofit` y `com.squareup.retrofit2:converter-gson`.

Las `corrutinas` para que no sea secuencial la llamada a la API ya que la llamada a servicios no debe hacerse en el hilo principal y bloquenado este por ello.
Con las corrutinas podemos hacer llamadas asincronas.

Los `permisos en el Manifest`: permiso de internet:  <uses-permission android:name="android.permission.INTERNET"/>

# ____________________________________________________

# ¿Android el VM es el activity?
No, en Android el ViewModel (VM) no es la Activity. Son dos componentes diferentes con responsabilidades distintas:
•	Activity / Fragment → Se encarga de la interfaz de usuario (UI).
•	ViewModel → Maneja la lógica de negocio y datos de manera persistente.

🔹 Ejemplo de ViewModel en Android

# 📌 Diferencias entre Activity y ViewModel en Android
## 🔹 Responsabilidad
- **Activity / Fragment:** Gestionar la UI
- **ViewModel:** Gestionar la lógica y datos

## 🔹 Ciclo de vida
- **Activity / Fragment:** Atado a la UI (se destruye con ella)
- **ViewModel:** Sobrevive a cambios de configuración (como rotación de pantalla)

## 🔹 Dónde se usa
- **Activity / Fragment:** XML (Layouts), eventos de UI
- **ViewModel:** Mantiene datos, llamadas a la API, operaciones de base de datos

## 🔹 Ejemplo de uso
- **Activity / Fragment:** Mostrar un `RecyclerView`, recibir clicks de botones
- **ViewModel:** Obtener datos de una API, aplicar lógica de negocio

1️⃣ Definir el ViewModel
```java
class SuperHeroViewModel : ViewModel() {
    private val _superheroData = MutableLiveData<List<SuperHero>>()
    val superheroData: LiveData<List<SuperHero>> get() = _superheroData

    fun fetchSuperheroes(query: String) {
        viewModelScope.launch {
            val response = api.getSuperheroes(query)
            if (response.isSuccessful) {
                _superheroData.postValue(response.body()?.results)
            }
        }
    }
}
```

2️⃣ Usar el ViewModel en la Activity
```java
class SuperHeroListActivity : AppCompatActivity() {
    private lateinit var viewModel: SuperHeroViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_superhero_list)

        viewModel = ViewModelProvider(this)[SuperHeroViewModel::class.java]

        viewModel.superheroData.observe(this) { superheroes ->
            // Actualizar la UI con los datos
        }

        searchButton.setOnClickListener {
            viewModel.fetchSuperheroes("Batman")
        }
    }
}
```

🔹 Beneficios del ViewModel

✅ Sobrevive a cambios de configuración (como rotar la pantalla).
✅ Separa la lógica de negocio de la UI.
✅ Evita pérdida de datos cuando la Activity se destruye y se vuelve a crear.

Si en tu app tienes lógica que quieres mantener aunque la Activity se destruya, usa un ViewModel. 🚀

# ____________________________________________________

# MIN 1:09:49
...

# _____________ NUEVO CURSO DE ARIS: `Paging 3 en Jetpack Compose - [GUÍA COMPLETA] - Proyecto Completo MVVM` _____________
(`https://www.youtube.com/watch?v=4iJ2C9A0-Gk`)

Proyecto: `1_App_Paginacion` (carpeta `App_Android`) Incluye: `Hilt`, `Retroit`, `Paging 3`.

## Paginación
¿Mi app se podria mejorar en vez de llamando a todos los personajes o episodios de sus json usandolo con paging 3? SI

## Dependencias
Añadimos dependencias:
`pagingCompose` = "3.3.0"
`hilt` = "2.49"
`hiltNavigationCompose` = "1.2.0"
`retrofit` = "2.9.0"
`coilCompose` = "2.8.0"

## Arquitectura
Nos vamos a saltar la capa de `domain` porque el proyecto va a ser simple. Entonces solo vamos a tener la capa de `data` y `presentation`.
- Carpeta `data`
X Carpeta `domain` (nos la saltamos en este mini proyecto)
- Carpeta `presentation`

## Pasos iniciales
- `AppPaginacionApplication.kt`: contiene la extension de `Application()`
- `AndroidManifest.xml`: se le debe añadir la linea `android:name=".AppPaginacionApplication"` y la conexión a internet
- `MainActivity`: se añade la macro para inyección de dependencias.
- Carpeta `presentation`
    + `RickListViewModel.kt` con inyección de dependecias
    + `RickListScreen.kt` por parámetro se le pasa el View Model correspondiente (creando justo antes)

## Cuerpo de la aplicación
- Carpeta `data`
    + Carpeta `response`
        * `ResponseWrapper.kt` respuesta de la api.
        * `CharacterResponse.kt`, entidad de la respuesta de la api con mappea a `CharacterModel` (entidad de presentation)
        * `InfoResponse.kt`, entidad de la respuesta de la api que contiene la info para la páginación.
    + `RickMortyApiService.kt`, define la llamada HTTP con @GET.
    + `RickRepository`, recibe RickMortyApiService mediante @Inject, se conecta con Retrofit y carga los datos en páginas.
    + `CharacterPagingSource`, se conecta con Retrofit y carga los datos en páginas.
- Carpeta `di`
    + `NetworkModule.kt`, configura Retrofit, OkHttp y la API de Rick & Morty con Hilt para la inyección de dependencias.
- Carpeta `presentantion`
  + Carpeta `model`
        * `CharacterModel.kt`
  + `RickListScreen.kt`
  + `RickListViewModel.kt`
- `AppPaginacionApplication.kt`
- `MainActivity.kt`

## `Retroit` con API `http://rickandmortyapi.com/`
Lo bueno que esta API tiene paginación incluida
La API de paginación se caracterizan por estar formados por los resultados y por la `info` que nos ayuda a la paginación.

```json
{
  "info": {
    "count": 826,
    "pages": 42,
    "next": "https://rickandmortyapi.com/api/character/?page=2",
    "prev": null
  },
  "results": [
    {
      "id": 1,
      "name": "Rick Sanchez",
      "status": "Alive",
      "species": "Human",
      "type": "",
      "gender": "Male",
      "origin": {
        "name": "Earth",
        "url": "https://rickandmortyapi.com/api/location/1"
      },
      "location": {
        "name": "Earth",
        "url": "https://rickandmortyapi.com/api/location/20"
      },
      "image": "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
      "episode": [
        "https://rickandmortyapi.com/api/episode/1",
        "https://rickandmortyapi.com/api/episode/2",
        // ...
      ],
      "url": "https://rickandmortyapi.com/api/character/1",
      "created": "2017-11-04T18:48:46.250Z"
    },
    // ...
  ]
}
```

### [DUDA] ¿Si es una mock de datos sin paginación o una api sin paginación se puede hacer?

🔹 `Retrofit` → Responsable de la conexión con la API
Retrofit se encarga de `definir y ejecutar las solicitudes HTTP` a la API de Rick & Morty.

📌 Dónde está en tu código:
•	`RickMortyApiService`: Define la llamada HTTP con `@GET`.
•	`NetworkModule`: Configura `Retrofit con Hilt` para la inyección de dependencias.

## `Hilt` → Inyección de dependencias
Hilt se encarga de gestionar `las dependencias de Retrofit y del repositorio`, evitando que instanciemos manualmente los objetos.

📌 Dónde está en tu código:
•	`NetworkModule`: Es un `módulo de Hilt` que provee `Retrofit` y `OkHttp`.
•	`RickRepository`: Recibe `RickMortyApiService` mediante `@Inject`.
•	`AppPaginacionApplication`: Usa `@HiltAndroidApp` para inicializar Hilt.
•	`RickListViewModel`: Usa `@HiltViewModel` para que Hilt gestione su instancia.

## `Paging 3` → Manejo de paginación de datos
Paging 3 `carga` los personajes de Rick & Morty `en partes`, en lugar de descargar todos a la vez.

📌 Dónde está en tu código:
•	`CharacterPagingSource`: Se conecta con Retrofit y carga los datos en páginas.
•	`RickRepository`: Usa Pager para manejar la paginación.
•	`RickListViewModel`: Exposición de PagingData<CharacterModel>.
•	`RickListScreen`: Usa collectAsLazyPagingItems() para convertir PagingData en un formato compatible con Jetpack Compose.
•	`CharactersList`: Usa LazyColumn para mostrar la lista paginada.

## Si solo quieres implementar una de estas en tu proyecto
✅ Si solo quieres `Retrofit` → Usa `RickMortyApiService` y `NetworkModule`. No necesitas `PagingSource` ni `Pager`.
✅ Si solo quieres `Hilt` → Usa `NetworkModule` y `@Inject` en tus clases. No necesitas `PagingSource`. Aplica` @HiltViewModel` y ` @HiltAndroidApp` sin necesidad de paginación. Usa `PagingData` y `LazyPagingItems`, pero podrías usar una fuente de `datos local` en vez de `Retrofit`.
✅ Si solo quieres `Paging 3 `→ Usa `PagingSource` y `Pager`, pero en vez de una `API real`, podrías usar una `lista local`.
✅ Si solo `Jetpack Compose`: Usa LazyColumn para mostrar listas sin Paging 3.

# _____________ NUEVO CURSO DE ARIS: `MVVM con JETPACK COMPOSE desde CERO - [GUÍA COMPLETA] - Proyecto Completo MVVM` _____________
(`https://www.youtube.com/watch?v=EmUx8wgRxJw`)

Proyecto: `2_ArquitecturaMVVM` (carpeta `App_Android`) Incluye: `ViewModel`, `LiveData`, `Screen Compose Personalizada`

Esquema:
- `MainActitivity.kt`
- Carpeta `ui`
    `LoginScreen.kt`
    `LoginViewModel.kt`

Muy simple.

