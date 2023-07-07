package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val username = binding.idNome.text.toString().trim()
            val password = binding.idSenha.text.toString().trim()

            if(username.equals("user") && password.equals("123")) {
                Toast.makeText(applicationContext, "Login OK", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Login INválido", Toast.LENGTH_SHORT).show()

            }

            binding.idNome.setText("")
            binding.idSenha.setText("")

        }
    }
}