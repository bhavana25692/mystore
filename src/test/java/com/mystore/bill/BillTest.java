package com.mystore.bill;

import com.mystore.managers.BillManager;
import com.mystore.model.Bill;
import com.mystore.model.BillingProducts;
import com.mystore.model.Product;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BillTest {

    static ClassPathXmlApplicationContext ctx;

    @BeforeClass
    public static void setUpClass() {
        ctx = new ClassPathXmlApplicationContext("testContext.xml");
    }

    @Test
    public void getBill() {
        BillManager billManager = ctx.getBean(BillManager.class);
        Product product1 = new Product(1, "1000111101", "Eggs", 'C', 36.00);
        Product product2 = new Product(1, "1000111111", "Lamp", 'B', 1500.00);
        BillingProducts billingProduct1 = new BillingProducts(1, product1, 0, 0);
        BillingProducts billingProduct2 = new BillingProducts(2, product2, 0, 0);

        List<BillingProducts> billingProductsList = new ArrayList<>();
        billingProductsList.add(billingProduct1);
        billingProductsList.add(billingProduct2);
        Bill bill = billManager.getBill(billingProductsList);

        assert (bill != null);

    }

}