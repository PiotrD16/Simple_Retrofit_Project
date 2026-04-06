package com.example.simpleandroidapp.ui.main

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.simpleandroidapp.R
import com.example.simpleandroidapp.ui.viewmodel.UserViewModel

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val viewModel: UserViewModel by viewModels()
        val fetchBtn = findViewById<Button>(R.id.button)
        val textData = findViewById<TextView>(R.id.userData)

        viewModel.users.observe(this) {users ->
            val textBuilder = StringBuilder()
            users.forEach{
                user -> textBuilder.append(" - ${user.name}\n\n")
            }
            textData.text = textBuilder.toString();
        }

        fetchBtn.setOnClickListener {
            viewModel.fetchUsers()
        }

    }
}