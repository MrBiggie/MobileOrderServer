package com.example.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping(method = RequestMethod.GET, value = "/orders")
    public List<Bill> getAllBill() {
        return billService.getAllBills();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/orders/{id}")
    public Bill getBill(@PathVariable String id) {
        return billService.getBill(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/orders")
    public void addBill(@RequestBody Bill bill) {
        billService.addBill(bill);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/orders/{id}")
    public void updateBill(@RequestBody Bill bill, @PathVariable String id) {
        billService.updateBill(id, bill);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/orders/{id}")
    public void deleteBill(@PathVariable String id) {
        billService.deleteBill(id);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/restaurants/{restaurantId}/orders")
    public List<Bill> getAllBillByRestaurant(@PathVariable String restaurantId) {
        return billService.getAllBillsByRestaurant(restaurantId);
    }

}
