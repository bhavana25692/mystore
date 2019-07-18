package com.mystore.model;

public class Product {
    private int id;
    private String barCode;
    private String name;
    private char category;
    private double rate;

    public Product() {
        super();
    }

    public Product(int id, String barCode, String name, char category, double rate) {
        this.id = id;
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public char getCategory() {
        return category;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", rate=" + rate +
                '}';
    }
}
