package com.tka.Classroom_Management.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.tka.Classroom_Management.Entity.Class_schedules;
import com.tka.Classroom_Management.Entity.Classrooms;

@Repository
public class Class_schedules_dao {
	@Autowired
	SessionFactory sf;

	public List<Class_schedules> get_all_class_schddules() {

		Session s = sf.openSession();
		Criteria c = s.createCriteria(Class_schedules.class);
		List<Class_schedules> allclassshedules = c.list();

		return allclassshedules;

	}

	public ArrayList<Class_schedules> get_schddules_by_id(long id) {
		Session s = sf.openSession();
		Criteria c = s.createCriteria(Class_schedules.class);
		ArrayList<Class_schedules> al = new ArrayList<>();
		List<Class_schedules> alldata = c.list();
		for (Class_schedules schedules : alldata) {

			if (schedules.getId() == id) {

				al.add(schedules);
			}

		}

		return al;

	}

	public Class_schedules create_class_schedule(Class_schedules data) {

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.save(data);
		t.commit();

		return null;
	}

	public Class_schedules update_schedule(long id, Class_schedules data) {

		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		System.err.println(id);
		Class_schedules cs = new Class_schedules(id, data.getClassroom_id(), data.getDay_of_week(), data.getEnd_time(),
				data.getStart_time(), data.getSubject_id());
		s.update(cs);
		t.commit();

		return null;
	}

	public Class_schedules deleteschedule(long id) {
System.err.println(id);
		Session s = sf.openSession();

		Criteria c = s.createCriteria(Class_schedules.class);

		List<Class_schedules> allrooms = c.list();
		for (Class_schedules alldata : allrooms) {
			if (id == alldata.getId()) {
				Transaction ts = s.beginTransaction();

				Class_schedules st = new Class_schedules(id,alldata.getClassroom_id(),alldata.getDay_of_week(),alldata.getEnd_time(),alldata.getStart_time(),alldata.getSubject_id());
				st = (Class_schedules) s.merge(st);

				s.delete(st);
				ts.commit();
				s.close();

			}

		}
		return null;
		
		
		
	}
}
