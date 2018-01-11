package com.example.codeclan.mytodolist.Task;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.codeclan.mytodolist.List.ListActivity;
import com.example.codeclan.mytodolist.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class AddTaskActivity extends AppCompatActivity {

    EditText titleText;
    EditText detailsText;
    EditText categoryChoice;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        titleText = findViewById(R.id.title);
        detailsText = findViewById(R.id.details);
        categoryChoice = findViewById(R.id.add_category);

    }

    public void addListenerOnSpinnerItemSelection() {
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    public void addListenerOnButton() {
        spinner = (Spinner) findViewById(R.id.spinner);
    }

//    public void onAddButtonClicked(View button){
//        String newTitle = titleText.getText().toString();
//        String newDetails = detailsText.getText().toString();
//        spinner = (Spinner) findViewById(R.id.spinner);
//        String newCategoryName = categoryChoice.getText().toString();
//
//        Categories newCategory = new Categories().getEnum(spinner.getTransitionName())
//
//        Task newTask = new Task(newTitle, newDetails, newCategory);
//
//        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
//        String allTasks = sharedPref.getString(getString(R.string.task_preference_key), new ArrayList<Task>().toString());
//
//        Gson gson = new Gson();
//        TypeToken<ArrayList<Task>> existingArrayList = new TypeToken<ArrayList<Task>>() {};
//        ArrayList<Task> myToDoList = gson.fromJson(allTasks, existingArrayList.getType());
//
//        myToDoList.add(newTask);
//
//        SharedPreferences.Editor editor = sharedPref.edit();
//
//        editor.putString(getString(R.string.task_preference_key), gson.toJson(myToDoList));
//        editor.apply();
//
//        Toast.makeText(this, "Task Added", Toast.LENGTH_LONG).show();
//
//        Intent intent = new Intent(this, ListActivity.class);
//        startActivity(intent);
//
//    }

}

