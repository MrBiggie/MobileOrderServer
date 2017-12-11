package com.example.demo.desk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeskRepository extends JpaRepository<Desk, String> {
    List<Desk> findByRestaurantId(String restaurantId);
}
