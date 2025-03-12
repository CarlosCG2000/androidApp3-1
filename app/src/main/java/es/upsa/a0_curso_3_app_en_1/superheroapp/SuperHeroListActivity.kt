package es.upsa.a0_curso_3_app_en_1.superheroapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import es.upsa.a0_curso_3_app_en_1.Logger
import es.upsa.a0_curso_3_app_en_1.databinding.ActivitySuperHeroListBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SuperHeroListActivity : AppCompatActivity(), Logger {

    private lateinit var viewBinding: ActivitySuperHeroListBinding
    private lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        viewBinding = ActivitySuperHeroListBinding.inflate(this.layoutInflater)
        setContentView(viewBinding.root)

        retrofit = getRetrofit()
        initUI()
    }

    private fun initUI(){

        viewBinding.searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
            // Se llamara cuando pulsemos en el boton de  buscar
            override fun onQueryTextSubmit(query: String?): Boolean {
                logInfo("Realizando búsqueda de Superhero: ${query.orEmpty()}")

                searchByName(query.orEmpty()) // si es null que devuelva texto vacio
                return false
            }

            // Se llamara cada vez que pongamos una letra. No la voy a utilizar lo pongo a flase
            override fun onQueryTextChange(newText: String?): Boolean = false

        })
    }

    private fun searchByName(query: String) {

        viewBinding.progressBar.isVisible = true

        // Trabajando con corrutinas
        logInfo("Antes de entrar en el hilo principal")

        lifecycleScope.launch(Dispatchers.IO) { // en el hilo secundario (para servidores)
            try {
                val response: Response<SuperHeroDataResponse> = retrofit
                    .create(ApiService::class.java)
                    .getSuperheroes(superheroName = query)

                logInfo("Dentro del hilo secundario")

                if (response.isSuccessful) {
                    logInfo("Funciona correcto la llamada a la API")

                    val body: SuperHeroDataResponse? = response.body()

                    if(body != null) {
                        withContext(Dispatchers.Main) { // volvemos al hilo principal (interfaz)
                            logInfo("Volvemos al hilo principal con ${body.response}")
                            // Aquí podrías actualizar la UI con los datos
                            viewBinding.progressBar.isVisible = false
                        }
                    }

                } else {
                    logError("No funciona la llamada a la API - Código: ${response.code()}")
                }
            } catch (e: Exception) {
                logError("Error en la petición: ${e.localizedMessage}")
            }
        }
    }

    // El objeto Retrofit para llamar a la API
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://superheroapi.com/") // PONER EL '/' CUIDADO NO OLVIDARLO
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}