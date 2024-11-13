package com.example.lab5_and102_fa24;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Toolbar toolbar;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.home_Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout,
                toolbar, R.string.open, R.string.close);

        drawerToggle.setDrawerIndicatorEnabled(true);
        drawerToggle.syncState();
        drawerLayout.addDrawerListener(drawerToggle);

        NavigationView navView = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item_home) {
            Toast.makeText(getApplicationContext(), "Home", Toast.LENGTH_SHORT).show();
            toolbar.setTitle("Trang chu");
        } else if (item.getItemId() == R.id.item_bookmark) {
            Toast.makeText(getApplicationContext(), "Bookmark", Toast.LENGTH_SHORT).show();
            toolbar.setTitle("Bookmark");
        } else if (item.getItemId() == R.id.item_settings) {
            Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
            toolbar.setTitle("Settings");
        } else if (item.getItemId() == R.id.item_logout) {
            Toast.makeText(getApplicationContext(), "Logout", Toast.LENGTH_SHORT).show();
            toolbar.setTitle("Logout");
        }

        drawerLayout.closeDrawers();
        return true;
    }



    }

