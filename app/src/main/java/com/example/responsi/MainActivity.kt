package com.example.responsi

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var et_username = findViewById<EditText>(R.id.et_username)
        var et_password = findViewById<EditText>(R.id.et_password)
        var btn_login = findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener{
            val username = et_username
            val password = et_password

            AlertDialog.Builder(this)
                .setTitle("Login")
                .setMessage("Anda Berhasil Login")
                .setPositiveButton("Ya", DialogInterface.OnClickListener{ DialogInterface, i ->
                    val intent = Intent(this, halaman::class.java)
                    startActivity(intent)
                })
                .setNegativeButton("No", DialogInterface.OnClickListener{
                        dialogInterface, i ->
                    Toast.makeText(this,"Jalankan Perintah ketika user memilih No", Toast.LENGTH_LONG).show()
                })
                .show()
            }

        }
    }
