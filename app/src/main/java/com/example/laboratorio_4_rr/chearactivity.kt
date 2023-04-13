package com.example.laboratorio_4_rr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class chearactivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var correoTextView: TextView
    private lateinit var numeroTextView: TextView
    private fun share(){
        val intent = Intent().apply{
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "comparte la informacion")
            type = "text"
        }
        val shareIntent = Intent.createChooser(intent, null)
        startActivity(shareIntent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chearactivity)

        val button = findViewById<Button>(R.id.btnShare)
        button.setOnClickListener{ share() }

        nameTextView = findViewById(R.id.name_text_view)
        correoTextView = findViewById(R.id.correo_text_view)
        numeroTextView = findViewById(R.id.numero_text_view)

        
        val nameShare = intent.getStringExtra("name").toString()
        nameTextView.text = "nombre: ${nameShare}"

        val correoShare = intent.getStringExtra("correo").toString()
        correoTextView.text = "Correo electronico: ${correoShare}"

        val numeroShare = intent.getStringExtra("numero").toString()
        numeroTextView.text = "numero telefonico: ${numeroShare}"



    }
}