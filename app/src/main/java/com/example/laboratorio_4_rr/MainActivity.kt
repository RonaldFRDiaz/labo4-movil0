package com.example.laboratorio_4_rr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText



class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputEditText
    private lateinit var correoEditText: TextInputEditText
    private lateinit var numeroEditText: TextInputEditText
    private lateinit var actionNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        correoEditText = findViewById(R.id.correo_value)

        numeroEditText = findViewById(R.id.numero_value)
        nameEditText = findViewById(R.id.name_value)
        actionNext = findViewById(R.id.action_share)

        actionNext.setOnClickListener{
        val intent = Intent(this, chearactivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("correo", correoEditText.text.toString())
            intent.putExtra("numero", numeroEditText.text.toString())
        startActivity(intent)

         }


    }
}