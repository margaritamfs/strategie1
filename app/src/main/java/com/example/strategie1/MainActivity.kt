package com.example.strategie1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var stra_usuario: EditText? = null
    private var stra_password: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.miMenu))

        stra_usuario = findViewById(R.id.stra_usuario)
        stra_password = findViewById(R.id.stra_password)
    }


    fun ingresar(btnlogin: View) {
        var stra_usuario: String = stra_usuario!!.text.toString()
        var stra_password: String = stra_password!!.text.toString()

        if(stra_usuario == "margaritamfs.forero@gmail.com" && stra_password == "12345"){
            val intento = Intent(this, eventos::class.java)
            startActivity(intento)
            Toast.makeText(applicationContext, "WELCOME", Toast.LENGTH_LONG).show()}
        else{
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
        }
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.action_search -> {
            Toast.makeText(this, R.string.txt_titulobusqueda, Toast.LENGTH_LONG).show()
            true
        }

        R.id.action_logout -> {
            Toast.makeText(this, R.string.txt_salir, Toast.LENGTH_LONG).show()
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    }







