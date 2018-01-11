package com.example.codeclan.mytodolist.Util;

/**
 * Created by annalanigan on 11/01/2018.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceActivity;
import com.example.codeclan.mytodolist.Task.Task;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import com.example.codeclan.mytodolist.R;

/**
 * Created by annalanigan on 09/01/2018.
 */

public class SharedPreferencesHelper extends PreferenceActivity {

    public SharedPreferences getPreferences() {

        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        return sharedPref;
    }

    public String getPreferenceString(){

        SharedPreferences sharedPref = getPreferences();

        String allTasks = sharedPref.getString(getString(R.string.task_preference_key), new ArrayList<Task>().toString());
        return allTasks;
    }

    public ArrayList<Task> callData() {

        String allTasks = getPreferenceString();

        Gson gson = new Gson();
        TypeToken<ArrayList<Task>> existingArrayList = new TypeToken<ArrayList<Task>>() {};
        ArrayList<Task> myToDoList = gson.fromJson(allTasks, existingArrayList.getType());
        return myToDoList;
    }

    public void saveData(ArrayList<Task> list){

        Gson gson = new Gson();
        SharedPreferences sharedPref = getPreferences();

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString(getString(R.string.task_preference_key), gson.toJson(list));
        editor.apply();

    }

}
