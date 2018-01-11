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

        public void addCategory(Category newCategory){
            defaultCategories.add(newCategory);
        }

        public ArrayList<Category> getDefaultList() {
            return new ArrayList<Category>(defaultCategories);
        }

        public int getSize() {
            return defaultCategories.size();
        }

        public Category getCategory(String name){
            Category result = null;
            for (Category item : defaultCategories){
                if (item.getName() == name){
                    result = item;
                }
            }
            return result;
        }


        public ArrayList<String> getCategoryNames(){
            ArrayList<String> names = new ArrayList<>();
            for (Category each : defaultCategories){
                names.add(each.getName());
            }
            return names;
        }
}
