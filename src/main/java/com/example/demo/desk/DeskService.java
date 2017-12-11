package com.example.demo.desk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeskService {

    @Autowired
    private DeskRepository deskRepository;
    public List<Desk> getAllDesks() {
        List<Desk> desks = new ArrayList<>();
        deskRepository.findAll().forEach(desks::add);
        return desks;
    }

    public Desk getDesk(String id) {
        return deskRepository.findOne(id);
    }

    public void addDesk(Desk desk) {
        deskRepository.save(desk);
    }

    public void updateDesk(String id, Desk desk) {
        deskRepository.save(desk);
    }

    public void deleteDesk(String id) {
        deskRepository.delete(id);
    }

    public List<Desk> getAllDesksByRestaurant(String restaurantId) {
        return deskRepository.findByRestaurantId(restaurantId);
    }
}
