
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



