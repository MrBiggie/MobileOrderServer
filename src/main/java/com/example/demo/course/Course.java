package com.example.demo.course;

import com.example.demo.order.Bill;
import com.example.demo.restaurant.Restaurant;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Restaurant restaurant;

    @ManyToMany(mappedBy = "courseList")
    private List<Bill> billList;

    public Course() {

    }

    public Course(String id, String name, String description, String restaurantId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.restaurant = new Restaurant(restaurantId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

}
