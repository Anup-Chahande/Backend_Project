package com.tka.Classroom_Management.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Classroom_Management.Dao.Department_dao;
import com.tka.Classroom_Management.Entity.Course;
import com.tka.Classroom_Management.Entity.Department;
@Service
public class Department_service {
	@Autowired
	Department_dao dd;

	public List<Department> getalldepartment() {
		return dd.getalldepartment();
	}

	public ArrayList<Department> get_Department_by_id(long id) {
		return dd.get_Department_by_id(id);
	}

	public Department create_Department(Department department) {
		return dd.create_Department(department);
	}

	public Department update_Course(long id, Department department) {
		return dd.update_Course(id,department);
	}

	public Department deletedepartment(long id) {
return dd.deletedepartment(id);
	
	}
}
