package com.example.laboratorio_4_rr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class chearactivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var correoTextView: TextView
    private lateinit var numeroTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chearactivity)
        
        nameTextView = findViewById(R.id.name_text_view)
        correoTextView = findViewById(R.id.correo_text_view)
        numeroTextView = findViewById(R.id.numero_text_view)

        
        val nameShare = intent.getStringExtra("name").toString()
        nameTextView.text = "hello ${nameShare}"

        val correoShare = intent.getStringExtra("correo").toString()
        correoTextView.text = "Correo electronico ${correoShare}"

        val numeroShare = intent.getStringExtra("numero").toString()
        numeroTextView.text = "Correo electronico ${numeroShare}"
    }
}