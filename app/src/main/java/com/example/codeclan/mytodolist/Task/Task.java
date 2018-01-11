package com.example.codeclan.mytodolist.Task;

import com.example.codeclan.mytodolist.R;

import java.io.Serializable;
import java.util.Date;



/**
 * Created by annalanigan on 10/01/2018.
 */

public class Task implements Serializable {

    private String name;
    private String details;
    private Boolean completed;
    private Categories category;
    private Date due;

    public Task(String name, String details, Categories catName){
        this.name = name;
        this.details = details;
        this.completed = false;
        this.category = catName;
        this.due = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public void completeTask(){
        this.completed = true;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public int getLogo() {
        return this.category.getLogo();
    }

}

