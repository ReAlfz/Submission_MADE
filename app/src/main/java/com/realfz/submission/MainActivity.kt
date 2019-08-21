package com.realfz.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){

    private lateinit var rvKS : RecyclerView
    private var list: ArrayList<Gem> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKS = findViewById(R.id.rv_AC)
        rvKS.setHasFixedSize(true)

        list.addAll(GameData().listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKS.layoutManager = LinearLayoutManager(this)
        val AdapterGame = AdapterGame(list)
        rvKS.adapter = AdapterGame
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tool_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.about) {
            val vc = Intent(this, Diri::class.java)
            this.startActivity(vc)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
