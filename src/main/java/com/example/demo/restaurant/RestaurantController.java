package com.example.demo.restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;
    @RequestMapping(method = RequestMethod.GET, value = "/restaurants")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurants();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/restaurants/{id}")
    public Restaurant getRestaurant(@PathVariable  String id){
        return restaurantService.getRestaurant(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/restaurants")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant(restaurant);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/restaurants/{id}")
    public void updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable String id){
        restaurantService.updateRestaurant(id, restaurant);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/restaurants/{id}")
    public void deleteRestaurant(@PathVariable  String id){
        restaurantService.deleteRestaurant(id);
    }
}
