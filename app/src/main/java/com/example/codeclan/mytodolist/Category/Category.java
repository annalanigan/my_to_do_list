package com.example.codeclan.mytodolist.Category;

import com.example.codeclan.mytodolist.Task.Categories;

import java.io.Serializable;

/**
 * Created by annalanigan on 11/01/2018.
 */

public class Category implements Serializable{

    private String name;
    private int logo;

    public Category (String name, int logo){
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

}
