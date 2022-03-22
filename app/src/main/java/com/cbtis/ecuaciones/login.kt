package com.cbtis.ecuaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Login

        val tNombre = findViewById<EditText>(R.id.User)
        val tContraseña = findViewById<EditText>(R.id.Pasword)
        val bIniciar = findViewById<Button>(R.id.bIngresar)

        bIniciar.setOnClickListener {
            val Usuario = tNombre.getText().toString()
            val pass: String = tContraseña.getText().toString()
            if (Usuario.equals("Fabian")&& pass.equals("123")){

                var intent = Intent(this,MainActivity::class.java)

                startActivity(intent)
                Toast.makeText(this,"Bienvenido!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Usuario o Contraseña incorrectos!", Toast.LENGTH_SHORT).show()
            }

        }


    }
}