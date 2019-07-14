package com.mystore.model;

public class Product {
    private long id;
    private String barCode;
    private String name;
    private Category category;
    private double rate;

    public Product() {
        super();
    }

    public Product(long id, String barCode, String name, Category category, double rate) {
        this.id = id;
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.rate = rate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
