package com.abm.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList = (RecyclerView) findViewById(R.id.programmingList);

        // Set Layout Manager for RecyclerView
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        // Variable to store data
        String[] languages = {"Java", "JavaScript", "C#", "PHP",
                "C", "C++", "R", "Python", "Ruby", "Perl",
                "Swift", "Kotlin"};

        // Set the Adapter and pass data into it
        programmingList.setAdapter(new ProgrammingAdapter(languages));
    }
}