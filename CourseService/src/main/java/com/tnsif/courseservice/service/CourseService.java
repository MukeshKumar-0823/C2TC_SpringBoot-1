package com.tnsif.courseservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.courseservice.entity.Course;
import com.tnsif.courseservice.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    // Automatically injects the CourseRepository dependency
    @Autowired
    private CourseRepository courseRepository;

    // Retrieves all courses from the database
    public List<Course> getAllCourses() 
    {
        return courseRepository.findAll();
    }

    // Retrieves a specific course by its ID, returns null if not found
    public Course getCourseById(Long id) 
    {
    	return courseRepository.findById(id).orElse(null);
    }

    // Saves a new course or updates an existing one in the database
    public Course saveCourse(Course course) 
    {
        return courseRepository.save(course);
    }

  
    
}