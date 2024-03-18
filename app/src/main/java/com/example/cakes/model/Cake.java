package com.example.cakes.model;

import android.widget.ImageView;

public class Cake {
    int id;
    String imageView;
    double averageRating;

    public Cake(int id, String imageView, double averageRating) {
        this.id = id;
        this.imageView = imageView;
        this.averageRating = averageRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageView() {
        return imageView;
    }

    public void setImageView(String imageView) {
        this.imageView = imageView;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }
}
