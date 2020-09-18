package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout resource file.

        // Using the id given in the layout file you can access the component.
        // Set an action when the user clicks on the confirm button.
        binding.btnSubmit.setOnClickListener {
            displayResult()
        }

    }

    private fun displayResult() {
        val userInput = listOf(binding.firstAnswer.text, binding.secondAnswer.text, binding.thirdAnswer.text, binding.fourthAnswer.text)
        val correctAnswers = listOf("T", "F", "F", "F")

        //Display correct results
        Toast.makeText(this, "Aantal correcte antwoorden: " + checkAnswers(userInput, correctAnswers).toString() + "/4",
            Toast.LENGTH_LONG).show()
    }

    private fun checkAnswers(userInput: List<Editable>, correctAnswers: List<String>): Int {
        var count = 0

        if (userInput[0].toString() == (correctAnswers[0]))
            count += 1
        if (userInput[1].toString() == (correctAnswers[1]))
            count += 1
        if (userInput[2].toString() == (correctAnswers[2]))
            count += 1
        if (userInput[3].toString() == (correctAnswers[3]))
            count += 1
        return count
        }

    }
