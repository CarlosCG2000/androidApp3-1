
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

- [Desarrollando nuestra primera APP](https://youtu.be/vJapzH_46a8?t=11200)
  - Navegación de pantallas
- [Crear un menú para navegar entre apps](https://youtu.be/vJapzH_46a8?t=14874)
- [Diseñar y programar app completa IMC](https://youtu.be/vJapzH_46a8?t=15773)
  - Cambios entre pantallas
  - Gestión y creación de colores
  - Diseño de UI
  - CardView
  - RangeSlider
  - Compatibilidad con múltiples idiomas (Strings)
  - Listeners y clicks
- [Diseñar y programar app completa TODO](https://youtu.be/vJapzH_46a8?t=23805)
  - Recyclerview
  - Dialog
  - Sealed class
  - Funciones lambdas
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

MIN 03:07:06

# Introducción del proyecto
Lo primero que hay que hacer es entender el proyecto.

Nuestra app se divide en dos partes:
- `la visual`: los elementos (`layouts`) del dispositivo. Bien en `XML` o `Jetpack Compose`.
- `la logica`: la `interacción` con los elementos del dispositivo. En `Java` o `Kotlin`.

Esto es un `activity`: el conjunto entre la parte lógica y la parte visual.

Vamos a dividir para cada mini proyecto `un package`, para probar muchas cosas en un mismo proyecto.

* Esto `no es lo recomendable`, ya que lo que deberiamos es seguir `una arquitectura` para probarlo con `Clean Arquitecture` pero como es el primer proyecto para verlo con funciona nos vale.

# Primera App
Creamos en un package nuevo con el nombre `primeraApp`.

Creamos dentro un `Empty Views Activity` (ojo cuidado no una `Empty Activity` que utiliza `Jetpack Compose` en vez de `XML`) llamado `FirstAppActivity` y solo esta vez la seleccionaremos como `Launcher Activity` ya que no tenemos ninguna pantalla.

* [ Ver mejor en clases de Roberto `de la explicación de los Layout` ]
En este curso empezamos por explicación de `FrameLayout`, `LinearLayout` y `ContraintLayout` (lo mejor).
Podemos extraer `nuevas propiedades` y conocimientos que no tengo de las `clases del grado con Roberto`.

Tener en cuenta que se pueden `anidar unos layouts` dentro de otros.

El fichero `AndroidManifest.xml` es donde se encuentras que `Activities` se tiene, que permisos, etc.


