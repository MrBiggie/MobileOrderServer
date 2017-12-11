package com.example.demo.order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill, String>{
    public List<Bill> findByRestaurantId(String restaurantId);
}
