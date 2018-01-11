package com.example.codeclan.mytodolist.List;

import com.example.codeclan.mytodolist.Task.Categories;
import com.example.codeclan.mytodolist.Task.Task;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by annalanigan on 10/01/2018.
 */

public class List implements Serializable {

    ArrayList<Task> list;
    Task dummyTask;
    Task dummyTask2;

    public List(){
        list = new ArrayList<Task>();
        dummyTask = new Task("Test", "Test details", Categories.KIDS);
        dummyTask.completeTask();
        list.add(dummyTask);
        dummyTask2 = new Task("Test2", "Test2 details", Categories.GARDEN);
        list.add(dummyTask2);
        list.add(new Task("food shop", "Sainsburys", Categories.SHOPPING));
        list.add(new Task("buy lighbulb", "halogen and 40 watt", Categories.SHOPPING));
        list.add(new Task("build drawer unit", "kids bedroom", Categories.HOME));
    }

    public void addItem(Task task){
        list.add(task);
    }

    public int getItemRank(Task thisTask){
        int rank = list.indexOf(thisTask);
        return rank += 1;
    }

    public ArrayList<Task> getList(){
        return new ArrayList<Task>(list);
    }



}
