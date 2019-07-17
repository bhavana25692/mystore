package com.mystore.model;

import java.util.List;

public class Bill {
    private long id;
    private int numberOfItems;
    private double taxAmount;
    private double costAmount;
    private double totalAmount;
    List<BillingProducts> billingProductsList;

    public Bill() {
        super();
    }
    public Bill(long id, int numberOfItems, double taxAmount, double costAmount, double totalAmount, List<BillingProducts> billingProductsList) {
        this.id = id;
        this.numberOfItems = numberOfItems;
        this.taxAmount = taxAmount;
        this.costAmount = costAmount;
        this.totalAmount = totalAmount;
        this.billingProductsList = billingProductsList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(double costAmount) {
        this.costAmount = costAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<BillingProducts> getBillingProductsList() {
        return billingProductsList;
    }

    public void setBillingProductsList(List<BillingProducts> billingProductsList) {
        this.billingProductsList = billingProductsList;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", numberOfItems=" + numberOfItems +
                ", taxAmount=" + taxAmount +
                ", costAmount=" + costAmount +
                ", totalAmount=" + totalAmount +
                ", billingProductsList=" + billingProductsList +
                '}';
    }
}
