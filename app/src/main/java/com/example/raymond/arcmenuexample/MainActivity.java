package com.example.raymond.arcmenuexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.sa90.materialarcmenu.ArcMenu;
import com.sa90.materialarcmenu.StateChangeListener;

public class MainActivity extends AppCompatActivity {

    ArcMenu arcMenuAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arcMenuAndroid = (ArcMenu) findViewById(R.id.arcmenu_layout);
        arcMenuAndroid.setStateChangeListener(new StateChangeListener() {
            @Override
            public void onMenuOpened() {
//                Toast.makeText(MainActivity.this, "You opened the Arc Menu", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onMenuClosed() {
//                Toast.makeText(MainActivity.this, "You closed the Arc Menu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
