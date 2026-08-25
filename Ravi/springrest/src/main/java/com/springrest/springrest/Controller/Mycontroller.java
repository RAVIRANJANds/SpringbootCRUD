package com.springrest.springrest.Controller;

import com.springrest.springrest.Entity.Course;
import com.springrest.springrest.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {

    @Autowired
    private CourseServices ICS;

    @GetMapping("/home")
    public String home(){
        return "Welcome to courses application";
    }
    @GetMapping("/courses")
    public List<Course> getCourses(){
    return this.ICS.getCourses();
    }
    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable  String courseId){
        return this.ICS.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.ICS.addCourse( course);

    }
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.ICS.updateCourse(course);
    }
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCurse(@PathVariable String courseId){
        try{
            this.ICS.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
