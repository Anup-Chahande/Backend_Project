package com.tka.Classroom_Management.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Classroom_Management.Dao.Course_dao;
import com.tka.Classroom_Management.Entity.Classrooms;
import com.tka.Classroom_Management.Entity.Course;

@Service
public class Course_Service {
	@Autowired
	Course_dao cd;

	public List<Course> getallcourse() {

		return cd.getallcourse();

	}

	public ArrayList<Course> get_Course_by_id(long id) {

		return cd.get_Course_by_id(id);
	}

	public Course create_Course(Course course) {

	return cd.create_Course(course);
	}

	public Course update_Course(long id, Course course) {
		return cd.update_Course(id,course);
	}

	public Course deletecourse(long id) {
		return cd.deletecourse(id);
	}

}
