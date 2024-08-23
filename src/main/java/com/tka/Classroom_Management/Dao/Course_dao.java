package com.tka.Classroom_Management.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Classroom_Management.Entity.Classrooms;
import com.tka.Classroom_Management.Entity.Course;
@Repository
public class Course_dao {
	@Autowired
	SessionFactory sf;
	
	public List<Course> getallcourse() {
		Session ss = sf.openSession();
		Criteria c = ss.createCriteria(Course.class);
		List<Course> allcourse = c.list();
		System.out.println(allcourse);
		return allcourse;
		
		
		
		 
	}

	public ArrayList<Course> get_Course_by_id(long id) {

		
		Session s = sf.openSession();
		Criteria c = s.createCriteria(Course.class);
		ArrayList<Course> al = new ArrayList<>();
		List<Course> alldata = c.list();
		for (Course Courses : alldata) {

			if (Courses.getId() == id) {

				al.add(Courses);
			}

		}

		return al;
		
	}

	public Course create_Course(Course course) {
		Session ss = sf.openSession();
		ss.save(course);
		Transaction t = ss.beginTransaction();
		t.commit();

		return null;
	
	}

	public Course update_Course(long id, Course course) {

		Session ss = sf.openSession();
		Course cs = new Course(id, course.getName());
		Transaction t = ss.beginTransaction();

		ss.update(cs);
		t.commit();

		return null;

	}

	public Course deletecourse(long id) {
		Session s = sf.openSession();

		Criteria c = s.createCriteria(Course.class);

		List<Course> allcourse = c.list();
		for (Course alldata : allcourse) {
			if (id == alldata.getId()) {
				Transaction ts = s.beginTransaction();

				Course st = new Course(id,alldata.getName());
				st = (Course) s.merge(st);

				s.delete(st);
				ts.commit();
				s.close();

			}

		}
		return null;
	
	
	}
		
	
	
}
