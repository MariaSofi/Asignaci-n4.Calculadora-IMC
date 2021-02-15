package landavazo.maria.asignacion4_calculadoraimc_landavazo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso : EditText = findViewById(R.id.weight) as EditText
        val altura : EditText = findViewById(R.id.height) as EditText
        val calcular : Button = findViewById(R.id.calculate) as Button
        val imc : TextView = findViewById(R.id.imc) as TextView
        val rango : TextView = findViewById(R.id.range) as TextView

        calcular.setOnClickListener{
            var p: Float = peso.text.toString().toFloat()
            var a: Float = altura.text.toString().toFloat()
            var imc2: Float = p/(a.pow(2))

            imc.setText(""+imc2)

            if (imc2<18.5){
                rango.setBackgroundResource(R.color.colorGreenish)
                rango.setText("Bajo peso")
            } else if (imc2>=18.5 && imc2<=24.9){
                rango.setBackgroundResource(R.color.colorGreen)
                rango.setText("Normal")
            } else if (imc2>=25 && imc2<=29.9){
                rango.setBackgroundResource(R.color.colorOrange)
                rango.setText("Sobrepeso")
            }else if (imc2>=30 && imc2<=34.9){
                rango.setBackgroundResource(R.color.colorYellow)
                rango.setText("Obesidad grado 1")
            }else if (imc2>=35 && imc2<=39.9){
                rango.setBackgroundResource(R.color.colorRed)
                rango.setText("Obesidad grado 2")
            }else if (imc2>=40){
                rango.setBackgroundResource(R.color.colorBrown)
                rango.setText("Obesidad grado 3")
            }

        }

    }
}