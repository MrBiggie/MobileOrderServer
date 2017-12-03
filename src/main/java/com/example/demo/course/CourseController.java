package com.example.demo.course;

import com.example.demo.restaurant.restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(method = RequestMethod.GET, value = "/restaurants/{restaurantsId}/courses")
    public List<Course> getAllCourses(@PathVariable String restaurantsId) {
        return courseService.getAllCourses(restaurantsId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/restaurants/{restaurantsId}/course/{id}")
    public Course getCourse(@PathVariable String restaurantsId) {
        return courseService.getCourse(restaurantsId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/restaurants/{restaurantsId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable int restaurantsId) {
        course.setRestaurant(new restaurant(restaurantsId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/restaurants/{restaurantsId}/courses/{courseId}")
    public void updateTopic(@RequestBody Course course, @PathVariable String courseId, @PathVariable int restaurantsId) {
        course.setRestaurant(new restaurant(restaurantsId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/restaurants/{restaurantsId}/courses/{courseId}")
    public void deleteTopic(@PathVariable String courseId) {
        courseService.deleteCourse(courseId);
    }
}
