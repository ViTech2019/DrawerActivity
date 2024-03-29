package com.vlgames.draweractivity

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.MenuItem
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import androidx.core.view.get
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val transaction = supportFragmentManager.beginTransaction()

        when (item.itemId) {

            R.id.a1 -> {
                // Handle the camera action
                transaction.replace(R.id.container, BlankFragment.newInstance("1")).commit()
            }
            R.id.a2 -> {
                transaction.replace(R.id.container, BlankFragment.newInstance("2")).commit()
            }
            R.id.a3 -> {
                transaction.replace(R.id.container, BlankFragment.newInstance("3")).commit()
            }
            R.id.a4 -> {
                transaction.replace(R.id.container, BlankFragment.newInstance("4")).commit()
            }
            R.id.a5 -> {
                transaction.replace(R.id.container, BlankFragment.newInstance("5")).commit()
            }
            R.id.a6 -> {
                transaction.replace(R.id.container, BlankFragment.newInstance("6")).commit()
            }
            R.id.a7 -> {
                transaction.replace(R.id.container, BlankFragment.newInstance("7")).commit()
            }
            R.id.a8 -> {
                transaction.replace(R.id.container, BlankFragment.newInstance("8")).commit()
            }
            else -> {
                transaction.replace(R.id.container, BlankFragment.newInstance("9")).commit()
            }
        }

//        val fragment = BlankFragment.newInstance(paramInt.toString())
//       val transaction =  supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container, fragment)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}

