package com.example.recetarioparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val recetas = obtenerRecetas()
        val adapter = RecetaAdapter(recetas)
        recyclerView.adapter = adapter
    }

    private fun obtenerRecetas(): List<Receta> {
        val recetas = mutableListOf<Receta>()
        val receta1 = Receta(
            "Pad Thai",
            "Medio",
            "Tailandia",
            listOf("Fideos de arroz", "Tofu", "Cacahuetes", "Salsa de tamarindo"),
            "https://s1.eestatic.com/2023/03/10/cocinillas/recetas/pasta-y-arroz/747435731_231542213_1706x960.jpg"
        )
        recetas.add(receta1)

        val receta2 = Receta(
            "Sopa de Miso",
            "Fácil",
            "Japón",
            listOf("Pasta de miso", "Tofu", "Algas wakame", "Caldo de pescado"),
            "https://assets.unileversolutions.com/recipes-v2/233093.jpg"
        )
        recetas.add(receta2)

        val receta3 = Receta(
            "Sushi",
            "Media",
            "Japón",
            listOf("Arroz", "Pescado fresco", "Alga nori", "Vinagre de arroz"),
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6h8zd6aoIFeisGR8zHtK0D4bfHf-a7YUxBg&usqp=CAU"
        )
        recetas.add(receta3)

        val receta4 = Receta(
            "Curry de Pollo",
            "Fácil",
            "India",
            listOf("Pollo", "Curry en polvo", "Leche de coco", "Cebolla", "Tomate"),
            "https://assets.unileversolutions.com/recipes-v2/34403.jpg"
        )
        recetas.add(receta4)

        val receta5 = Receta(
            "Rollitos de Primavera",
            "Fácil",
            "China",
            listOf("Pasta de rollito", "Repollo", "Zanahoria", "Salsa de soja"),
            "https://i.blogs.es/143a66/rollitos-de-primavera/1366_2000.jpg"
        )
        recetas.add(receta5)

        val receta6 = Receta("Satay de Pollo",
            "Fácil",
            "Indonesia",
            listOf("Pollo marinado", "Salsa de cacahuetes", "Arroz"),
            "https://www.lavanguardia.com/files/og_thumbnail/uploads/2022/11/22/637ce8402cb00.jpeg"

        )
        recetas.add(receta6)

        val receta7 = Receta(
            "Dim Sum",
            "Media",
            "China",
            listOf("Empanadillas al vapor", "Rollitos de primavera", "Siu mai", "Arroz pegajoso"),
            "https://www.lavanguardia.com/files/article_main_microformat/files/fp/uploads/2023/06/28/649c14cb2c979.r_d.1045-787-5658.jpeg"
        )
        recetas.add(receta7)

        val receta8 = Receta("Okonomiyaki",
            "Fácil",
            "Japón",
            listOf("Repollo", "Huevo", "Panceta", "Salsa okonomiyaki"),
            "https://i.blogs.es/f66e88/okonomiyaki/1366_2000.jpg"

        )
        recetas.add(receta8)

        val receta9 = Receta("Yakitori",
            "Fácil",
            "Japón",
            listOf("Brochetas de pollo", "Salsa tare", "Cebolla verde", "Sake"),
            "https://www.pequerecetas.com/wp-content/uploads/2019/06/yakitori-pollo.jpg"
        )
        recetas.add(receta9)

        val receta10 = Receta( "Pho",
            "Medio",
            "Vietnam",
            listOf("Fideos de arroz", "Caldo de carne", "Brotes de soja", "Hierbas frescas"),
            "https://imagenes.elpais.com/resizer/YmIhMXu1syVg82d8n5YWb8SAvbg=/1960x1103/ep01.epimg.net/elcomidista/imagenes/2021/03/16/receta/1615884439_361599_1616751600_noticia_fotograma.jpg"

        )
        recetas.add(receta10)

        val receta11 = Receta(
            "Tandoori Chicken",
            "Media",
            "India",
            listOf("Pollo", "Yogur", "Especias", "Limón"),
            "https://img.bestrecipes.com.au/660Wsm_q/br/2021/04/slow-cooker_tandoori_chicken-962501-2.jpg"
        )
        recetas.add(receta11)

        return recetas
    }
}
