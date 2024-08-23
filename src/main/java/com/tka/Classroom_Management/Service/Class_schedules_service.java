package com.tka.Classroom_Management.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.Classroom_Management.Dao.Class_schedules_dao;
import com.tka.Classroom_Management.Entity.Class_schedules;
import com.tka.Classroom_Management.Entity.Classrooms;

@Service
public class Class_schedules_service {
	@Autowired
	Class_schedules_dao dao;

	public List<Class_schedules> get_all_class_schddules() {

		return dao.get_all_class_schddules();

	}

	public  ArrayList<Class_schedules> get_schddules_by_id(long id) {
	
	return dao.get_schddules_by_id(id);
	
	}

	public Class_schedules create_class_schedule(Class_schedules data) {
		
		
		
		
		return dao.create_class_schedule(data);
	}

	public Class_schedules update_schedule(long id, Class_schedules data) {
		return dao.update_schedule(id,data);
	}
	
	public Class_schedules deleteclasroom(long id) {
		
		
		
		return dao.deleteschedule(id);
	}

}
