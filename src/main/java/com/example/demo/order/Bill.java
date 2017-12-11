package com.example.demo.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

    @Id
    private String id;

    private int amount;

//    @ManyToOne
//    private User user;
//
//    @ManyToOne
//    private Restaurant restaurant;
//
//    @ManyToOne
//    private Desk desk;
//
//    @ManyToMany(mappedBy = "billList")
//    private List<Course> courseList;

    public Bill() {

    }

    public Bill(String id, int amount, String userId, String restaurantId) {
        this.id = id;
        this.amount = amount;
//        this.courseList = new ArrayList<Course>();
//        this.restaurant = new Restaurant(restaurantId, "", "");
//        this.user = new User(userId,"","","","","");
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

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Restaurant getRestaurant() {
//        return restaurant;
//    }
//
//    public void setRestaurant(Restaurant restaurant) {
//        this.restaurant = restaurant;
//    }
//
//    public Desk getDesk() {
//        return desk;
//    }
//
//    public void setDesk(Desk desk) {
//        this.desk = desk;
//    }

//    public List<Course> getCourseList() {
//        return courseList;
//    }
//
//    public void setCourseList(List<Course> courseList) {
//        this.courseList = courseList;
//    }
    //    @Override
//    public String toString() {
//        return "Bill{" +
//                "courseList=" + courseList +
//                '}';
//    }
}
