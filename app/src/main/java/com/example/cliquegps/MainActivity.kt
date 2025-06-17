  package com.example.cliquegps

  import android.location.Location
  import androidx.appcompat.app.AppCompatActivity
  import android.os.Bundle
  import android.widget.Button
  import android.widget.TextView
  import java.text.SimpleDateFormat
  import java.util.*

  class MainActivity : AppCompatActivity() {
      private var clickCount = 0
      private val dateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())

      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)

          val button = findViewById<Button>(R.id.button)
          val counterText = findViewById<TextView>(R.id.counterText)

          button.setOnClickListener {
              clickCount++
              val currentTime = dateFormat.format(Date())
              val location = "Lat: -23.5505, Lng: -46.6333" // Simulado (substitua pelo GPS real depois)
              counterText.text = "Cliques hoje: $clickCount\nÚltimo registro: $currentTime\n$location"
          }
      }
  }
  
