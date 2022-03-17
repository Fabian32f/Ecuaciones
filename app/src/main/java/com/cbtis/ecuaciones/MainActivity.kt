package com.cbtis.ecuaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Formula general
        val bEC = findViewById<Button>(R.id.bECuadraticas)
        bEC.setOnClickListener {
                var intent = Intent(this,EFormulaG::class.java)

                startActivity(intent)
                Toast.makeText(this,"ECUACIONES CUADRATICAS!", Toast.LENGTH_SHORT).show()
            }//fin formula general


        //lineales
        val bEL = findViewById<Button>(R.id.bELineales)
        bEL.setOnClickListener {
            var intent = Intent(this,ELineales::class.java)

            startActivity(intent)
            Toast.makeText(this,"ECUACIONES LINEALES!", Toast.LENGTH_SHORT).show()
        }


        }

    }
