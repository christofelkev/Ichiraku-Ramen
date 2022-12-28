package org.chrivin.ichirakuramen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DesertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);

        ListView desertsCourseList = findViewById(R.id.list_view_deserts);

        Dish[] desertCourse = {
                new Dish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 40099),
                new Dish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 60099),
                new Dish("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", 56699),
                new Dish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 50099),
                new Dish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 50000),
        };
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,desertCourse);
        desertsCourseList.setAdapter(dishesAdapter);

    }


}