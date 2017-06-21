package com.boa.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path="/courses/")
public class RestCourseMain {
	
	@Autowired
	private CourseService theService;
	
	
	@RequestMapping(value="/getThem" , method=RequestMethod.GET)
	public List<Course> getAllCourses() {
		return  theService.findAll();
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void saveOne(@RequestBody Course aCourse){
		theService.add(aCourse);
		
	}

}
