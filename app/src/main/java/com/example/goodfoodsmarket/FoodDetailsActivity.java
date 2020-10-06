package com.example.goodfoodsmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class FoodDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        int foodIndex = (Integer) getIntent().getExtras().get("index");
        int foodType = (Integer) getIntent().getExtras().get("foodType");

        Food food = Food.fruits[foodIndex];;
        if(foodType == 0) {
            System.out.println("fruit");
            food = Food.fruits[foodIndex];
        } else if(foodType == 1) {
            System.out.println("vegetable");
            food = Food.vegetables[foodIndex];
        } else if(foodType == 2) {
            food = Food.bakery[foodIndex];
        }


        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());

        TextView name = findViewById(R.id.name);
        name.setText(food.getName());
        TextView category = findViewById(R.id.category);
        category.setText(food.getCategory());
        TextView originCountry = findViewById(R.id.originCountry);
        originCountry.setText(food.getCountryOfOrigin());
        TextView unit = findViewById(R.id.unit);
        unit.setText(food.getUnit());
        TextView price = findViewById(R.id.price);
        DecimalFormat df = new DecimalFormat("0.00");
        price.setText("$" + df.format(food.getPrice()));
    }
}