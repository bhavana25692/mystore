package com.mystore.rest;

import com.mystore.managers.BillManager;
import com.mystore.model.Bill;
import com.mystore.model.BillingProducts;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class BillService {
    private BillManager billManager;

    @POST
    @Path("/getBill")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Bill getBill(List<BillingProducts> billingProductsList) {
        return billManager.getBill(billingProductsList);
    }
}
