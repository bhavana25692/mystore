package com.mystore.rest;

import com.mystore.managers.BillManager;
import com.mystore.model.Bill;
import com.mystore.model.BillingProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/billing")
public class BillService {

    @Autowired
    private BillManager billManager;

    public BillManager getBillManager() {
        return billManager;
    }

    public void setBillManager(BillManager billManager) {
        this.billManager = billManager;
    }

    @POST
    @Path("/getBill")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Bill getBill(List<BillingProducts> billingProductsList) {
        return billManager.getBill(billingProductsList);
    }
}
