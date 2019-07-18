package com.mystore.model;

public class BillingProducts {
    private int quantity;
    private Product product;
    private double tax;
    private double costAmount;

    public BillingProducts() {
        super();
    }

    public BillingProducts(int quantity, Product product, double tax, double costAmount) {
        this.quantity = quantity;
        this.product = product;
        this.tax = tax;
        this.costAmount = costAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(double costAmount) {
        this.costAmount = costAmount;
    }

    @Override
    public String toString() {
        return "BillingProducts{" +
                "quantity=" + quantity +
                ", product=" + product +
                ", tax=" + tax +
                ", costAmount=" + costAmount +
                '}';
    }
}
