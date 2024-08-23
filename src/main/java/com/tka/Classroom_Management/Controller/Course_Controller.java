package com.tka.Classroom_Management.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Classroom_Management.Entity.Class_schedules;
import com.tka.Classroom_Management.Entity.Classrooms;
import com.tka.Classroom_Management.Entity.Course;
import com.tka.Classroom_Management.Service.Course_Service;

@RestController
public class Course_Controller {
	@Autowired
	Course_Service cs;

	@GetMapping("allcourse")
	public List<Course> getallcourse() {
           return cs.getallcourse();
	}
	
	@GetMapping("course/{id}")
	public ArrayList<Course> get_Course_by_id(@PathVariable long id) {
		return cs.get_Course_by_id(id);
	}
	
	@PostMapping("createcourse")
	public Course create_Course(@RequestBody Course Course) {

		return cs.create_Course(Course);

	}
	
	@PutMapping("updatecourse/{id}")
	public Course update_Course(@PathVariable long id, @RequestBody Course course) {

		return cs.update_Course(id, course);
	}
	
	@DeleteMapping("deletecourse/{id}")
	public Course deletecourse(@PathVariable long id) {
		
		
		return cs.deletecourse(id);
		
	}
	
	

}
