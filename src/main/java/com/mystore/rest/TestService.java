package com.mystore.rest;

import com.mystore.model.Product;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/test")
public class TestService {

    @GET
    @Path("/testMethod")
    @Produces(MediaType.APPLICATION_JSON)
    public int getProductList() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
        return 1;
    }
}
