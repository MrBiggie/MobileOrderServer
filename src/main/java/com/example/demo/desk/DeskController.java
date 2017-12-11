package com.example.demo.desk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeskController {

    @Autowired
    private DeskService deskService;

    @RequestMapping(method = RequestMethod.GET, value = "/desks")
    public List<Desk> getAllDesk() {
        return deskService.getAllDesks();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/desks/{id}")
    public Desk getDesk(@PathVariable String id) {
        return deskService.getDesk(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/desks")
    public void addDesk(@RequestBody Desk desk) {
        deskService.addDesk(desk);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/desks/{id}")
    public void updateDesk(@RequestBody Desk desk, @PathVariable String id) {
        deskService.updateDesk(id, desk);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/desks/{id}")
    public void deleteDesk(@PathVariable String id) {
        deskService.deleteDesk(id);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/restaurants/{restaurantId}/desks")
    public List<Desk> getAllBillByRestaurant(@PathVariable String restaurantId) {
        return deskService.getAllDesksByRestaurant(restaurantId);
    }

}
