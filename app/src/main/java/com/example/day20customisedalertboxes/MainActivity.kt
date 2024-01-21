package com.example.day20customisedalertboxes

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.day20customisedalertboxes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //create a variable of type Dialog
    lateinit var dialog: Dialog

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialog= Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        //Creating variables for the custom_dialogue.xml design
        var buttonGood= dialog.findViewById<Button>(R.id.btnGood)
        var buttonFeedback= dialog.findViewById<Button>(R.id.btnFeedback)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }

        buttonFeedback.setOnClickListener {
            //Intents or Toast
        }

        binding.btnClick.setOnClickListener {
            dialog.show()
        }
    }
}