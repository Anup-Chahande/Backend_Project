package com.tka.Classroom_Management.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Classroom_Management.Entity.Faculties;
import com.tka.Classroom_Management.Entity.Subjects;

@Repository
public class Subjects_dao {
	
	@Autowired
	SessionFactory sf;

	public List<Subjects> getallSubjects() {

		Session ss = sf.openSession();
		Criteria c = ss.createCriteria(Subjects.class);
		List<Subjects> allsubjects = c.list();
		System.out.println(allsubjects);
		return allsubjects;
		
	
		}

	public ArrayList<Subjects> get_Subjects_by_id(long id) {
		Session s = sf.openSession();
		Criteria c = s.createCriteria(Subjects.class);
		ArrayList<Subjects> al = new ArrayList<>();
		List<Subjects> subejects = c.list();
		for (Subjects data : subejects) {

			if (data.getId() == id) {

				al.add(data);
			}

		}

		return al;
	
	}

	public Subjects create_Subjects(Subjects subjects) {

		Session ss = sf.openSession();
		ss.save(subjects);
		Transaction t = ss.beginTransaction();
		t.commit();

		return null;
	
	}

	public Subjects update_Subjects(long id, Subjects subjects) {
		Session ss = sf.openSession();
		Subjects cs = new Subjects(id,subjects.getCourse_id(),subjects.getName());
		Transaction t = ss.beginTransaction();

		ss.update(cs);
		t.commit();

		return null;
	
	}

	public Subjects deletesubjects(long id) {
		
		Session s = sf.openSession();

		Criteria c = s.createCriteria(Subjects.class);

		List<Subjects> subjects = c.list();
		for (Subjects alldata : subjects) {
			if (id == alldata.getId()) {
				Transaction ts = s.beginTransaction();

				Subjects st = new Subjects(id,alldata.getCourse_id(),alldata.getName());
				st = (Subjects) s.merge(st);

				s.delete(st);
				ts.commit();
				s.close();
	
	}
	
		}
		return null;
		
		
	}
	
	

}
