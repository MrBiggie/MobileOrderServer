package com.example.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;
    public List<Bill> getAllBills() {
        List<Bill> bills = new ArrayList<>();
        billRepository.findAll().forEach(bills::add);
        return bills;
    }

    public Bill getBill(String id) {
        return billRepository.findOne(id);
    }

    public void addBill(Bill bill) {
        billRepository.save(bill);
    }

    public void updateBill(String id, Bill bill) {
        billRepository.save(bill);
    }

    public void deleteBill(String id) {
        billRepository.delete(id);
    }
}
