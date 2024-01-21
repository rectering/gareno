package com.rectering.gareno.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rectering.gareno.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));
    }
}