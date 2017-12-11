package com.example.demo.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

    public List<Course> findByRestaurantId(String restaurantId);
    public List<Course> findByName(String name);
    public List<Course> findByDescription(String foo);

}
