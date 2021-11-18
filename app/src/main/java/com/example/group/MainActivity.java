package com.example.group;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.google.android.material.navigation.NavigationView;

import Fragments.HomeFragment;
import Fragments.ProfileFragment;
import Fragments.ReviewFragment;

public class MainActivity extends AppCompatActivity {

    final FragmentManager fragmentManager = getSupportFragmentManager();
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                switch (menuItem.getItemId()) {
                    case R.id.action_profile:
                        //Toast.makeText(MainActivity.this, "Profile!",Toast.LENGTH_SHORT).show();
                        fragment = new ProfileFragment();
                        break;
                    case R.id.action_home:
                        //Toast.makeText(MainActivity.this, "Home!",Toast.LENGTH_SHORT).show();

                        fragment = new HomeFragment();
                        break;
                    case R.id.action_review:
                    default:
                        //Toast.makeText(MainActivity.this, "Review!",Toast.LENGTH_SHORT).show();

                        fragment = new ReviewFragment();
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.flContainer,fragment).commit();
                return true;
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.action_home);


    }


}