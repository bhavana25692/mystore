package com.mystore.product;


import com.mystore.managers.ProductManager;
import com.mystore.model.Product;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ProductsTest {

    static ClassPathXmlApplicationContext ctx;

    @BeforeClass
    public static void setUpClass() {
        ctx = new ClassPathXmlApplicationContext("testContext.xml");
    }

    @Test
    public void getProductListPositive() {
        ProductManager productManager = ctx.getBean(ProductManager.class);
        List<Product> productListResponse = productManager.getProductList();

        assert (!productListResponse.isEmpty());

    }
}