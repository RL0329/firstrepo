package com.example.ayabeltran.furnitureapp;

/**
 * Created by ayabeltran on 28/01/2018.
 */

public class Items {

    private String name;
    private String cost;
    private String details;
    private int image;

    public Items(String name, String cost, String details, int image) {
        this.name = name;
        this.cost = cost;
        this.details = details;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
