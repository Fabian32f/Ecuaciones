package com.cbtis.ecuaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EFormulaG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eformula_g)




        val Calcular = findViewById<Button>(R.id.Re)



        Calcular.setOnClickListener {

            val a = findViewById<EditText>(R.id.Va )
            val b = findViewById<EditText>(R.id.Vb )
            val c = findViewById<EditText>(R.id.Vc )

            val re = findViewById<TextView>(R.id.Tx1 )
            val re2 = findViewById<TextView>(R.id.Tx2 )
                var discriminante:Double
                var x1:Double
                var x2:Double


                    /*
                if((a.text.toString().toInt()) == 0){
                    Toast.makeText(this,"No puede existir algun valor con cero para el valor a", Toast.LENGTH_SHORT).show()
                }else if ((b.text.toString().toInt()) == 0){
                    Toast.makeText(this,"No puede existir algun valor con cero para el valor b", Toast.LENGTH_SHORT).show()
                }else if ((c.text.toString().toInt()) == 0){
                    Toast.makeText(this,"No puede existir algun valor con cero para el valor c", Toast.LENGTH_SHORT).show()
                }*/


                //se calcula el discriminante del polinomio

                discriminante = (b.text.toString().toDouble()*b.text.toString().toDouble())-(4*a.text.toString().toDouble()*c.text.toString().toDouble())
                println("> Discriminante = $discriminante")

                if (discriminante < 0) {

                    Toast.makeText(this,"> Solución: Sin soluciones reales", Toast.LENGTH_SHORT).show()
                    re.setText(
                        "> Solución: Sin soluciones reales"

                    )
                    re2.setText(
                        "> Solución: Sin soluciones reales"

                    )


                }else if (discriminante == 0.0) {


                    x1 = (-b.text.toString().toDouble())/(2*a.text.toString().toDouble())

                    Toast.makeText(this,"> Solucion: La ecuación tiene solamente una solución real: $x1", Toast.LENGTH_SHORT).show()
                    re.setText(
                        "X = "+x1.toString()

                    )
                    re2.setText(
                        " "

                    )


                }else if (discriminante > 0) {

                    Toast.makeText(this,"> Solución: ", Toast.LENGTH_SHORT).show()
                    x1 = (-b.text.toString().toDouble()+Math.sqrt(discriminante))/(2*a.text.toString().toDouble())
                    x2 = (-b.text.toString().toDouble()-Math.sqrt(discriminante))/(2*a.text.toString().toDouble())
                    println("    X1 = $x1")
                    println("    X2 = $x2")


                    Toast.makeText(this,x1.toString(), Toast.LENGTH_SHORT).show()
                    Toast.makeText(this,x2.toString(), Toast.LENGTH_SHORT).show()


                    re.setText(
                        "X1: "+x1.toString()

                    )
                    re2.setText(
                        "X2: "+x2.toString()

                    )


                }



            }


        }












    }
