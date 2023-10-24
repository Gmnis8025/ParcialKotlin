package com.example.recetarioparcial

import java.io.Serializable

data class Receta(
    val nombre: String,
    val dificultad: String,
    val origen: String,
    val ingredientes: List<String>,
    val fotoUrl: String
) : Serializable

