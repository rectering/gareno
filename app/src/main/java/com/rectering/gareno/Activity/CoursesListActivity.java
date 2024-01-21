package com.rectering.gareno.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rectering.gareno.Adapter.CoursesAdapter;
import com.rectering.gareno.Domain.CoursesDomain;
import com.rectering.gareno.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CoursesListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourseList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);

        initRecyclerView();

    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("Advanced certification Program in AI",169,"ic_1"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture",65,"ic_2"));
        items.add(new CoursesDomain("Fundamental of java Programming",150,"ic_3"));
        items.add(new CoursesDomain("Introduction to UI design history",79,"ic_4"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering",49,"ic_5"));

        recyclerViewCourse = findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adapterCourseList = new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourseList);
    }
}