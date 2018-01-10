package com.example.codeclan.mytodolist.List;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import com.example.codeclan.mytodolist.R;
import com.example.codeclan.mytodolist.Task.AddTaskActivity;
import com.example.codeclan.mytodolist.Task.Task;
import com.example.codeclan.mytodolist.Task.TaskActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    Button addButton;
    Button refreshButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        String allTasks = sharedPref.getString(getString(R.string.task_preference_key), new ArrayList<Task>().toString());

        Gson gson = new Gson();
        TypeToken<ArrayList<Task>> existingArrayList = new TypeToken<ArrayList<Task>>() {};
        ArrayList<Task> myToDoList = gson.fromJson(allTasks, existingArrayList.getType());

        // filtering for not completed
        ArrayList<Task> listToPassToAdapter = new ArrayList<Task>();

        for (Task eachTask : myToDoList){
            if (eachTask.getCompleted() == false) {
                listToPassToAdapter.add(eachTask);
            }
        }

        ListAdapter adapter = new ListAdapter(this, listToPassToAdapter);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        addButton = findViewById(R.id.button);
        refreshButton = findViewById(R.id.refresh);
    }

    // when clicking on the list item - takes you through to the further details
    public void getDetails(View listItem){

        Task task = (Task) listItem.getTag();

        Intent intent = new Intent(this, TaskActivity.class);
        intent.putExtra("task", task);

        startActivity(intent);

    }

    // button clicked to add new task
    public void onAddTaskButtonClicked(View button){

        Log.d(getClass().toString(), "clicked add task btn" );

        Intent intent = new Intent(this, AddTaskActivity.class);

        startActivity(intent);
    }


    public void onCheckBoxChecked(View view){

        boolean checked = ((CheckBox) view).isChecked();
        Task task = (Task) view.getTag();

        if (checked){

            SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
            String allTasks = sharedPref.getString(getString(R.string.task_preference_key), new ArrayList<Task>().toString());

            Gson gson = new Gson();
            TypeToken<ArrayList<Task>> existingArrayList = new TypeToken<ArrayList<Task>>() {};
            ArrayList<Task> myToDoList = gson.fromJson(allTasks, existingArrayList.getType());

            int index = myToDoList.indexOf(task);
            task.completeTask();
//            myToDoList.set(index, task);

            SharedPreferences.Editor editor = sharedPref.edit();

            editor.putString(getString(R.string.task_preference_key), gson.toJson(myToDoList));
            editor.apply();

        }
    }

    public void onRefreshButtonClicked(View view){

        Toast.makeText(this, "Refreshed", Toast.LENGTH_LONG).show();

        Intent intent = new Intent (this, ListActivity.class);
        startActivity(intent);

    }


}
