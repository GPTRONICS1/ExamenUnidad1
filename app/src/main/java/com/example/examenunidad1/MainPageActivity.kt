package com.example.examenunidad1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.widget.Toolbar
import com.google.android.material.navigation.NavigationView

class MainPageActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        // Configuración del DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView: NavigationView = findViewById(R.id.nav_view)

        // Manejo de la navegación
        toolbar.setNavigationIcon(R.drawable.ic_menu) // Asegúrate de tener un ícono de menú
        toolbar.setNavigationOnClickListener {
            drawerLayout.open() // Abre el menú desplegable
        }

        // Configura cualquier otra lógica para el menú, si es necesario
    }
}
