package com.example.examenunidad1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PhotoUploadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_upload) // Asegúrate de que el nombre del layout es correcto

        // Inicializa el botón "Registrarse"
        val buttonRegister = findViewById<Button>(R.id.buttonRegister)

        // Configura el evento onClick para el botón
        buttonRegister.setOnClickListener {
            // Regresa a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Opcional: cierra PhotoUploadActivity para que no vuelva a ser accesible al presionar "Atrás"
        }
    }
}
