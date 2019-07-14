package com.mystore.managers;

import com.mystore.dao.ProductDao;
import com.mystore.model.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;

    public List<Product> getProductList() {
        return productDao.getProductList();
    }
}
