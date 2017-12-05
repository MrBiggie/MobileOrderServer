package com.example.demo.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;


    public List<Restaurant> getAllRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurantRepository.findAll().forEach(restaurants::add);
        return restaurants;
    }

    public Restaurant getRestaurant(String id) {
        return restaurantRepository.findOne(id);
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    public void updateRestaurant(String id, Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(String id) {
        restaurantRepository.delete(id);
    }
}
