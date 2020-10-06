package com.example.goodfoodsmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;

public class Food extends ListActivity {

    private String _category;
    private String _unit;
    private String _name;
    private String _countryOfOrigin;
    private float _price;
    private int _imageResourceId;

    public static final Food[] fruits = {
            new Food("Fruit", "Oranges", "USA", "Pound", 1.69f, R.drawable.oranges),
            new Food("Fruit", "Grapes", "Chile", "Pound", 2.07f, R.drawable.grapes),
            new Food("Fruit", "Raspberries", "Canada", "Pound", 3.10f, R.drawable.raspberries),
    };

    public static final Food[] vegetables = {
            new Food("Vegetables", "Tomatoes", "Canada", "Pound", 1.39f, R.drawable.tomatoes),
            new Food("Vegetables", "Carrots", "Mexico", "Pound", 1.23f, R.drawable.carrots),
            new Food("Vegetables", "Potatoes", "Canada", "Pound", 0.89f, R.drawable.potatoes),
    };

    public static final Food[] bakery = {
            new Food("Bakery", "Bagels", "Canada", "Dozen", 9.50f, R.drawable.bagels),
            new Food("Bakery", "Donuts", "Canada", "Dozen", 6.30f, R.drawable.donuts),
            new Food("Bakery", "Croissants", "Canada", "Piece", 1.09f, R.drawable.croissants),
    };

    // Each country has a name, description and an image resource
    private Food(String category, String name, String countryofOrigin, String unit, float price, int imageResourceId) {
        _category = category;
        _name = name;
        _countryOfOrigin = countryofOrigin;
        _unit = unit;
        _price = price;
        _imageResourceId = imageResourceId;
    }

    public String getName() { return _name; }
    public String getCategory() { return _category; }
    public String getUnit() { return _unit; }
    public float getPrice() { return _price; }
    public String getCountryOfOrigin() { return _countryOfOrigin; }
    public int getImageResourceId() { return _imageResourceId; }
    public String toString() { return _name; }
}