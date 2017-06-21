package com.boa.courses;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.boa.courses.repos.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public CourseService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public List<Course> findAll() {
	  ArrayList theCourses = new ArrayList<>(); 

	 courseRepository.findAll().forEach(theCourses::add);
	 
	 return theCourses;	 
	}
	
	public void add(Course aCourse){
		courseRepository.save(aCourse);
	}
	
	

}
