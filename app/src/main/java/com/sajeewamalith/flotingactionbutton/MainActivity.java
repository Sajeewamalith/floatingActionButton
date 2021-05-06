package com.sajeewamalith.flotingactionbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab=(FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        Intent i1 = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i1);
               // Toast.makeText(MainActivity.this,"FAB Click!",Toast.LENGTH_SHORT).show();

            }
        });
       // public  void malith(View view)
         //{


           // Intent i1 = new Intent(this, MainActivity2.class);
            //startActivity(i1);
        //}
    }
}