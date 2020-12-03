package com.deepti.postads.model;

import java.time.LocalDate;

public class Ad {
    private int id;
    private String name;
    private LocalDate dateUploaded;
    private int user_id;
    private int categoryId;
    private double price;
    private String description;

    public Ad(int id, String name, LocalDate dateUploaded, int user_id, int categoryId, double price, String description) {
        this.id = id;
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.user_id = user_id;
        this.categoryId = categoryId;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
