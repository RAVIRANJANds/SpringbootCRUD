package com.springrest.springrest.Services;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceimpl implements CourseServices{
    @Autowired
    private CourseDao courseDao;





//    List<Course> list;
    public CourseServiceimpl(){

//        list=new ArrayList<>();
//        list.add(new Course(145,"Java core course","This course contains basic of java"));
//        list.add(new Course(4343,"Spring boot","This course contains basic of crud "));
    }


    public List<Course> getCourses(){
//        return list;

        return courseDao.findAll();
    }
    public Course getCourse(long courseId ){
//        Course c=null;
//        for(Course course:list){
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
//        return c;
        return courseDao.getOne(courseId);
    }

    public Course addCourse(Course course){
//        list.add(course);
//        return course;

        courseDao.save(course);
        return course;

    }
    public Course updateCourse(Course course){
//        list.forEach(e-> {
//            if(e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDesc(course.getDesc());
//            }});
        courseDao.save(course);
        return course;

        }
    public void deleteCourse(long parseLong){
//            list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        Course entity =courseDao.getOne(parseLong);
        courseDao.delete(entity);

        }

    }





