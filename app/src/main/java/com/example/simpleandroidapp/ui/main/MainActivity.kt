package com.example.simpleandroidapp.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.simpleandroidapp.R
import com.example.simpleandroidapp.ui.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    // ViewModel initialisation
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fetchBtn = findViewById<Button>(R.id.fetchBtn)
        val textVal = findViewById<TextView>(R.id.textViewContent)
        val userBtn = findViewById<Button>(R.id.gotoUser)

        // Setting observation on viewModel
        viewModel.posts.observe(this) { posts ->
            val textBuilder = StringBuilder()
            posts.forEach{
                post -> textBuilder.append(" - ${post.title}\n\n")
            }
            textVal.text = textBuilder.toString()
        }

        // Adding event listener to buttons
        fetchBtn.setOnClickListener {
            viewModel.fetchPosts()
        }

        userBtn.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
    }
}