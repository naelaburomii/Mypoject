package com.testapp.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class studentstable extends AppCompatActivity {

    ListView listView;
    String students[];
    ArrayAdapter<String> adapter;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.students_table);

        listView = findViewById(R.id.studentslist);
        students=getResources().getStringArray(R.array.students);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,students);
        listView.setAdapter(adapter);
    }
}