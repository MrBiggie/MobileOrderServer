package com.example.demo.order;

import com.example.demo.restaurant.Restaurant;
import com.example.demo.user.User;

import javax.persistence.*;

@Entity
public class Bill {

    @Id
    private String id;

    private int amount;

//    private List<Course> courseList;

    @ManyToOne
    private User user;

    @ManyToOne
    private Restaurant restaurant;

    public Bill() {

    }

    public Bill(String id, int amount, String userId, String restaurantId) {
        this.id = id;
        this.amount = amount;
//        this.courseList = new ArrayList<Course>();
        this.restaurant = new Restaurant(restaurantId, "", "");
        this.user = new User(userId,"","","","","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

//    @Override
//    public String toString() {
//        return "Bill{" +
//                "courseList=" + courseList +
//                '}';
//    }
}
