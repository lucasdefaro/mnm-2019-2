package com.example.mnm_2019_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.QuickContactBadge
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // ESSE È O COMEÇO DE TUDO
//        var texto:TextView = findViewById(R.id.textView)
//        var texto2:TextView = findViewById(R.id.textView2)
//        texto.text = "Certo ou Errado?"
//        var botao:Button = findViewById(R.id.button)
//        var input:EditText = findViewById(R.id.editText)
//
//
//
//
//        var a = 2
//        texto2.text = "Digite o Número " + a
//        botao.setOnClickListener {
//            var usuario = input.text
//            if (usuario.toString() == a.toString()) {
//                texto.text = "Você Acertou"
//
//            }
//            else {
//                texto.text = "Você Errou"
//
//
//        }
//        }
        // AQUI COMEÇA OUTRO CÓDIGO

        var segredo:TextView = findViewById(R.id.textView)
        var QuantidadeDeErros:TextView = findViewById(R.id.textView2)
        var letra:EditText = findViewById(R.id.editText)
        var botao:Button = findViewById(R.id.button)
        var reiniciar:Button = findViewById(R.id.button2)

        var palavras = listOf<String>("Segunda","Terca","Castigo")
        var erros = 0
        var acertos = mutableListOf<String>()
        var palavra = ""
        reiniciar.setOnClickListener{
            palavra = palavras.random()
            segredo.text = "_ ".repeat(palavra.count())
        }

        botao.setOnClickListener{
            var digito = letra.text.toString()
            var contemLetra = palavra.indexOf(digito)
            if(contemLetra) {

                acertos.add(digito)

            }
            else {
                erros = erros + 1
                QuantidadeDeErros.text = "erros $erros"
            }


        }


    }
}
