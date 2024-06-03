package com.example.component

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.component.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navigationView: NavigationView
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpDrawer()
        setSupportActionBar(findViewById(R.id.toolbar))
        navController = findNavController(R.id.nav_host_fragment)
        appBarConfigurationSetup()
        setupActionBarWithNavController(navController, drawerLayout)
        navigationView.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun appBarConfigurationSetup() {
        appBarConfiguration = AppBarConfiguration.Builder(
            R.id.homeFragment,
            R.id.profileFragment
        ).setOpenableLayout(drawerLayout).build()
    }

    private fun setUpDrawer() {
        navigationView = findViewById(R.id.nav_view)
        drawerLayout = findViewById(R.id.drawer_layout)

    }
}