package com.example.first_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloTextView: TextView = findViewById(R.id.hello_text_view)
        helloTextView.text = getString(R.string.app_name)
        val randomizeButton: Button = findViewById(R.id.randomize_button)
        randomize()
        randomizeButton.setOnClickListener {
            collection()
        }
    }
    fun randomize(){
        val helloTextView: TextView = findViewById(R.id.hello_text_view)
        val randomValue = kotlin.random.Random.nextInt(100)
        helloTextView.text = randomValue.toString()
    }
    fun collection(){
        val helloTextView: TextView = findViewById(R.id.hello_text_view)
        val alphabet = mutableListOf("а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я")
        val letters = mutableListOf<String>()
            alphabet.forEachIndexed { index, value
            ->
                if (index % 2 != 0)
                    letters.add(value)
            }
        helloTextView.text = letters.toString().replace("[", "").replace("]", "")

    }
}