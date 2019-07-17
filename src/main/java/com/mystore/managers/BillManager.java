package com.mystore.managers;

import com.mystore.dao.BillDao;
import com.mystore.model.Bill;
import com.mystore.model.BillingProducts;
import com.mystore.model.Category;

import java.util.List;

public class BillManager {
    private BillDao billDao;

    public BillDao getBillDao() {
        return billDao;
    }

    public void setBillDao(BillDao billDao) {
        this.billDao = billDao;
    }

    //Constructs a Bill object
    public Bill getBill(List<BillingProducts> billingProductsList) {
        Bill bill = new Bill();
        bill.setId(1);
        int noOfItems = 0;
        double totalTax = 0;
        double totalCost = 0;
        //Iterate over a productlist to bill
        for(BillingProducts billingProduct : billingProductsList){
            int qty = billingProduct.getQuantity();
            double rate = billingProduct.getProduct().getRate();
            Category category = billingProduct.getProduct().getCategory();
            double tax = calculateTax(qty, rate, category); //gives tax amount for current product
            double cost = calculateCost(qty, rate, tax); //gives cost for the current product
            billingProduct.setTax(tax);
            billingProduct.setCostAmount(cost);
            bill.setBillingProductsList(billingProductsList);
            bill.setBillingProductsList(billingProductsList);
            noOfItems++;
            totalTax = totalTax + tax;
            totalCost = totalCost + cost;
        }
            bill.setNumberOfItems(noOfItems);
            bill.setTaxAmount(totalTax);
            bill.setCostAmount(totalCost);
            bill.setTotalAmount(totalCost+ totalTax);
        return bill;
    }

    //Calculates tax for one item based on category
    public double calculateTax(int qty, double rate, Category category) {
        double taxRate = 0;
        switch (category) {
            case A :
                taxRate = 0.1;
                break;
            case B:
                taxRate = 0.2;
                break;
            case C:
                taxRate = 0;
                break;
        }
        return qty*rate*taxRate;
    }

    //Calculates cost for one item
    public double calculateCost(int qty, double rate, double tax) {
        return (qty*rate)+tax;
    }
}
