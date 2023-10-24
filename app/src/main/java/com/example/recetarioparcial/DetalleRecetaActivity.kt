package com.example.recetarioparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class DetalleRecetaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_receta)

        val receta = intent.getSerializableExtra("receta") as Receta
        val fotoReceta: ImageView = findViewById(R.id.fotoReceta)
        val ingredientesReceta: TextView = findViewById(R.id.ingredientesReceta)

        Picasso.get().load(receta.fotoUrl).into(fotoReceta)
        ingredientesReceta.text = "Ingredientes:\n${receta.ingredientes.joinToString(separator = "\n")}"
    }
}
