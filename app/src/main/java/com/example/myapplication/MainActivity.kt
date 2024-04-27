package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity: AppCompatActivity() {
    val peso = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TxNome = findViewById<EditText>(R.id.TxNome)
        val TxAltura = findViewById<EditText>(R.id.TxAltura)
        val TxPeso = findViewById<EditText>(R.id.TxPeso)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)



        btnEnviar.setOnClickListener {
            val nome = TxNome.text.toString()
            val altura = TxAltura.text.toString().toFloatOrNull()
            val peso = TxPeso.text.toString().toFloatOrNull()

            val message = "Nome: $nome\nAltura: $altura\nPeso: $peso"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            val intent = Intent(this, Contagem::class.java)
            startActivity(intent)
        }

    }


}