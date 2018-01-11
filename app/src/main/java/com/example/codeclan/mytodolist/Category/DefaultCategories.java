package com.example.codeclan.mytodolist.Category;

import com.example.codeclan.mytodolist.R;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by annalanigan on 11/01/2018.
 */

public class DefaultCategories implements Serializable{

        private ArrayList<Category> defaultCategories;

        public DefaultCategories(){
            defaultCategories = new ArrayList<Category>();
            defaultCategories.add(new Category("Please Select Category", R.drawable.other));
            defaultCategories.add(new Category("Shopping", R.drawable.shopping));
            defaultCategories.add(new Category("Home", R.drawable.home));
            defaultCategories.add(new Category("Work", R.drawable.work));
            defaultCategories.add(new Category("Kids", R.drawable.kids));
            defaultCategories.add(new Category("Packing", R.drawable.packing));
            defaultCategories.add(new Category("Garden", R.drawable.garden));
        }

        public Category getCategory(String name){
            Category result = null;
            for (Category singleCategory : defaultCategories){
                if (singleCategory.getName().equals(name)){
                    result = singleCategory;
                }
            }
            return result;
    }

}
