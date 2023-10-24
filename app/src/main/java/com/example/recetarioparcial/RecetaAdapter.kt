package com.example.recetarioparcial

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecetaAdapter(private val recetas: List<Receta>) :
    RecyclerView.Adapter<RecetaAdapter.RecetaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_receta, parent, false)
        return RecetaViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecetaViewHolder, position: Int) {
        val receta = recetas[position]
        holder.bind(receta)
    }

    override fun getItemCount(): Int {
        return recetas.size
    }

    class RecetaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nombreReceta: TextView = itemView.findViewById(R.id.nombreReceta)
        private val dificultadReceta: TextView = itemView.findViewById(R.id.dificultadReceta)
        private val origenReceta: TextView = itemView.findViewById(R.id.origenReceta)
        private val fotoReceta: ImageView = itemView.findViewById(R.id.fotoReceta)

        fun bind(receta: Receta) {
            nombreReceta.text = receta.nombre
            dificultadReceta.text = "Dificultad: ${receta.dificultad}"
            origenReceta.text = "Origen: ${receta.origen}"
            Picasso.get().load(receta.fotoUrl).into(fotoReceta)


            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetalleRecetaActivity::class.java)
                intent.putExtra("receta", receta)
                itemView.context.startActivity(intent)
            }
        }
    }
}


