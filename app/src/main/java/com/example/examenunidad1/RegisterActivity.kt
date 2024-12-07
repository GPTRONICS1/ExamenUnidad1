package com.example.examenunidad1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register) // Asegúrate de que el nombre del layout es correcto

        // Inicializa el botón
        val nextButton = findViewById<Button>(R.id.nextButton)

        // Configura el evento onClick para el botón
        nextButton.setOnClickListener {
            // Navega a PhotoUploadActivity
            val intent = Intent(this, PhotoUploadActivity::class.java)
            startActivity(intent)
        }
    }
}
