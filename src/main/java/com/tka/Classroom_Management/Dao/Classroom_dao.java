package com.tka.Classroom_Management.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.tka.Classroom_Management.Entity.Class_schedules;
import com.tka.Classroom_Management.Entity.Classrooms;

@Repository

public class Classroom_dao {
	@Autowired
	SessionFactory sf;

	public List<Classrooms> allclassrooms() {

		Session ss = sf.openSession();
		Criteria c = ss.createCriteria(Classrooms.class);
		List<Classrooms> allrooms = c.list();
		System.out.println(allrooms);
		return allrooms;
	}

	public Classrooms create_Classroom(Classrooms clasroom) {
		Session ss = sf.openSession();
		ss.save(clasroom);
		Transaction t = ss.beginTransaction();
		t.commit();

		return null;
	}

	public Classrooms update_classroom(@PathVariable long id, @RequestBody Classrooms classrooms) {

		Session ss = sf.openSession();
		Classrooms cs = new Classrooms(id, classrooms.getName());
		Transaction t = ss.beginTransaction();

		ss.update(cs);
		t.commit();

		return null;

	}

	public Classrooms deleteclasroom(long id) {
		Session s = sf.openSession();

		Criteria c = s.createCriteria(Classrooms.class);

		List<Classrooms> allrooms = c.list();
		for (Classrooms alldata : allrooms) {
			if (id == alldata.getId()) {
				Transaction ts = s.beginTransaction();

				Classrooms st = new Classrooms(id,alldata.getName());
				st = (Classrooms) s.merge(st);

				s.delete(st);
				ts.commit();
				s.close();

			}

		}
		return null;

	}
}