package com.mystore.rest;

import com.mystore.managers.ProductManager;
import com.mystore.model.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class ProductService {
    private ProductManager productManager;

    @GET
    @Path("/productList")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getProductList() {
        return productManager.getProductList();
    }
}
