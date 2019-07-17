package com.mystore.rest;

import com.mystore.managers.ProductManager;
import com.mystore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/products")
public class ProductService {

    @Autowired
    private ProductManager productManager;

    public ProductManager getProductManager() {
        return productManager;
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    @GET
    @Path("/productList")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getProductList() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
        return productManager.getProductList();
    }
}
