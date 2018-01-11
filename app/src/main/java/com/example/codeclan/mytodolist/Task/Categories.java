package com.example.codeclan.mytodolist.Task;

import com.example.codeclan.mytodolist.R;

import java.io.Serializable;

/**
 * Created by annalanigan on 11/01/2018.
 */

public enum Categories implements Serializable{
    HOME("Home", R.drawable.home),
    WORK("Work", R.drawable.work),
    KIDS("Kids", R.drawable.kids),
    GARDEN("Garden", R.drawable.garden),
    PACKING("Packing", R.drawable.packing),
    SHOPPING("Shopping", R.drawable.shopping);

    private final String name;
    private final int logo;

    Categories(String name, int logo){
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public int getLogo() {
        return logo;
    }

    public Categories getEnum(String name){
        return this;
    }

}
