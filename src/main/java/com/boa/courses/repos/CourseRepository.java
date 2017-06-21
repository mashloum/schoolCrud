package com.boa.courses.repos;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//import org.springframework.data.rest.core.annotation.*;


import com.boa.courses.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

}
