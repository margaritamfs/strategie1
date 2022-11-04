package com.example.strategie1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class eventos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventos)
        setSupportActionBar(findViewById(R.id.miMenu))
        val botonflotante: View = findViewById(R.id.botonflotante)

        botonflotante.setOnClickListener{ view ->
            Snackbar.make(view, R.string.txt_botonflotante, Snackbar.LENGTH_LONG).show()

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view, ToDoFragment::class.java, null, "todo")
                .commit()
        }

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