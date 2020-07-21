package com.example.toastpage

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.Toast
import com.example.toastpage.R.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_home)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.more_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            id.settings -> run {
                startActivity(Intent(this@HomeActivity, SettingsActivity::class.java))
                finish()
                //Toast.makeText(baseContext, "you clicked settings", Toast.LENGTH_SHORT).show()
            }
        }

        return true
    }
}

