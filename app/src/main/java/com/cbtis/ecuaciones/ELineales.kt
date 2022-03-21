package com.cbtis.ecuaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ELineales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elineales)





        val Calcular = findViewById<Button>(R.id.bCalcular)

        Calcular.setOnClickListener {
            val a1 = findViewById<EditText>(R.id.A1)
            val b1 = findViewById<EditText>(R.id.B1)
            val c1 = findViewById<EditText>(R.id.C1)
            val a2 = findViewById<EditText>(R.id.A2)
            val b2 = findViewById<EditText>(R.id.B2)
            val c2 = findViewById<EditText>(R.id.C2)

            val Rx = findViewById<TextView>(R.id.Tx )
            val Ry = findViewById<TextView>(R.id.Ty )


            val DS : Double  //Determinante del sistema
            val Dx : Double //Determinante de X
            val Dy : Double //Determinate de y
            val X : Double  // valor de x
            val Y : Double  //valor de y

            DS = (a1.text.toString().toDouble()*b2.text.toString().toDouble())-(b1.text.toString().toDouble()*a2.text.toString().toDouble())
            Toast.makeText(this,"Determinante del sistema: "+DS, Toast.LENGTH_SHORT).show()


            Dx = (c1.text.toString().toDouble()*b2.text.toString().toDouble())-(b1.text.toString().toDouble()*c2.text.toString().toDouble())
            Toast.makeText(this,"Determinante de X: "+Dx, Toast.LENGTH_SHORT).show()

            Dy = (a1.text.toString().toDouble()*c2.text.toString().toDouble())-(c1.text.toString().toDouble()*a2.text.toString().toDouble())
            Toast.makeText(this,"Determinante de Y: "+Dy, Toast.LENGTH_SHORT).show()

            X = Dx/DS
            Toast.makeText(this,"X = "+X, Toast.LENGTH_SHORT).show()
            Y = Dy/DS
            Toast.makeText(this,"Y = "+Y, Toast.LENGTH_SHORT).show()
            Rx.setText(
                "El valor de X es: "+X
            )
            Ry.setText(
                "El valor de Y es: "+Y
            )

        }



            /*
        val n1 = findViewById<EditText>(R.id.n1 )
        val n2 = findViewById<EditText>(R.id.n2 )
        val r = findViewById<TextView>(R.id.res )

        val bSumar = findViewById<Button>(R.id.boton)


        bSumar.setOnClickListener {
            r.setText(
                "LA SUMA ES: "+(n1.text.toString().toInt()+n2.text.toString().toInt())
            )

        }*/

    }
}