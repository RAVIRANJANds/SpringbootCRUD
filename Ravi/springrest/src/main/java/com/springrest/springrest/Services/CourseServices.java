package com.springrest.springrest.Services;

import com.springrest.springrest.Entity.Course;

import java.util.List;

public interface CourseServices {
    public List<Course> getCourses();

    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(long parseLong);
}
