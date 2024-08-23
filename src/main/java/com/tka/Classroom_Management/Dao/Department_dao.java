package com.tka.Classroom_Management.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Classroom_Management.Entity.Course;
import com.tka.Classroom_Management.Entity.Department;

@Repository
public class Department_dao {
	@Autowired
	SessionFactory sf;
	public List<Department> getalldepartment() {
		Session ss = sf.openSession();
		Criteria c = ss.createCriteria(Department.class);
		List<Department> alldepartment = c.list();
		System.out.println(alldepartment);
		return alldepartment;
		
		
		
	}
	public ArrayList<Department> get_Department_by_id(long id) {


		Session s = sf.openSession();
		Criteria c = s.createCriteria(Department.class);
		ArrayList<Department> al = new ArrayList<>();
		List<Department> alldata = c.list();
		for (Department department : alldata) {

			if (department.getId() == id) {

				al.add(department);
			}

		}

		return al;
		
	
	}
	public Department create_Department(Department department) {

		Session ss = sf.openSession();
		ss.save(department);
		Transaction t = ss.beginTransaction();
		t.commit();

		return null;
	
	}
	public Department update_Course(long id, Department department) {

		Session ss = sf.openSession();
		Department cs = new Department(id, department.getName());
		Transaction t = ss.beginTransaction();

		ss.update(cs);
		t.commit();

		return null;
	
	}
	public Department deletedepartment(long id) {
		Session s = sf.openSession();

		Criteria c = s.createCriteria(Department.class);

		List<Department> departments = c.list();
		for (Department alldata : departments) {
			if (id == alldata.getId()) {
				Transaction ts = s.beginTransaction();

				Department st = new Department(id,alldata.getName());
				st = (Department) s.merge(st);

				s.delete(st);
				ts.commit();
				s.close();
	
	}

	
	
	
		}
		return null;}}
