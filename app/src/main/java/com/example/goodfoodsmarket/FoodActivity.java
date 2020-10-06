package com.example.goodfoodsmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodActivity extends ListActivity {

//    private int foodType = (Integer) getIntent().getExtras().get("foodType");
    private int foodType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodType = (Integer) getIntent().getExtras().get("foodType");
        if(foodType == 0) {
            ArrayAdapter<Food> arrayAdapter = new ArrayAdapter<Food> (this,
                    android.R.layout.simple_list_item_1, Food.fruits);
            ListView listFoods = getListView();
            listFoods.setAdapter(arrayAdapter);
        } else if(foodType == 1) {
            ArrayAdapter<Food> arrayAdapter = new ArrayAdapter<Food> (this,
                    android.R.layout.simple_list_item_1, Food.vegetables);
            ListView listFoods = getListView();
            listFoods.setAdapter(arrayAdapter);
        } else if(foodType == 2) {
            ArrayAdapter<Food> arrayAdapter = new ArrayAdapter<Food> (this,
                    android.R.layout.simple_list_item_1, Food.bakery);
            ListView listFoods = getListView();
            listFoods.setAdapter(arrayAdapter);
        }
    }

    @Override
    protected void onListItemClick(ListView l, View w, int position, long id) {
        Intent i = new Intent(this, FoodDetailsActivity.class);
        i.putExtra("index", (int) id);
        i.putExtra("foodType", foodType);
        startActivity(i);
    }
}