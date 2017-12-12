package com.example.demo.order;

import com.example.demo.course.Course;
import com.example.demo.desk.Desk;
import com.example.demo.restaurant.Restaurant;
import com.example.demo.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Bill {

    @Id
    private String id;

    private int amount;

    @ManyToOne
    @JsonBackReference
    private User user;

    @ManyToOne
    @JsonBackReference
    private Restaurant restaurant;

    @ManyToOne
    @JsonBackReference
    private Desk desk;

    @ManyToMany
    private List<Course> courseList;

    public Bill() {

    }

    public Bill(String id, int amount, String userId, String restaurantId) {
        this.id = id;
        this.amount = amount;
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

    public Desk getDesk() {
        return desk;
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
