package pe.company.evaluacion3diegomoreno.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import pe.company.evaluacion3diegomoreno.R
import pe.company.evaluacion3diegomoreno.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtHello.text = "Hola Kotlin"

        val fragmentView = supportFragmentManager.findFragmentById(R.id.fav_navigation) as NavHostFragment
        val navController = fragmentView.navController
        binding.bnvStore.setupWithNavController(navController)
    }
}