package com.example.demo.desk;

import com.example.demo.order.Bill;
import com.example.demo.restaurant.Restaurant;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Desk {

    @Id
    private String id;

    @ManyToOne
    private Restaurant restaurant;

    @OneToMany
    @JoinColumn(name = "desk_id")
    @JsonManagedReference
    private List<Bill> bills;

    public Desk() {

    }

    public Desk(String id, String restaurantId) {
        super();
        this.id = id;
        this.restaurant = new Restaurant(restaurantId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}
