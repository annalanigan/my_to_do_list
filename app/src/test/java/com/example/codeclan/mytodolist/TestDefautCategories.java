package com.example.codeclan.mytodolist;

import com.example.codeclan.mytodolist.Category.DefaultCategories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by annalanigan on 11/01/2018.
 */

public class TestDefautCategories {

    DefaultCategories categories;

    @Before
    public void before(){
        categories = new DefaultCategories();
    }

    @Test
    public void canGetCategoryWithString(){
        assertNotNull(categories.getCategory("Kids"));
    }
}
