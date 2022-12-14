package com.testapp.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class MainActivity extends AppCompatActivity {

    TextView text ;
    Button stud_table,profile,orders;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stud_table = findViewById(R.id.students_table);
        profile = findViewById(R.id.profile);
        orders = findViewById(R.id.orders);

        stud_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,studentstable.class));
            }
        });
        profile.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                profile.setBackgroundColor(Color.YELLOW);
                profile.setText("clicked");

            }
        });
        orders.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                orders.setBackgroundColor(Color.YELLOW);
                orders.setText("clicked");

            }
        });


    }
}