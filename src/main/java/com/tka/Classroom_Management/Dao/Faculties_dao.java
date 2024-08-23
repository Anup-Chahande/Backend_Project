package com.tka.Classroom_Management.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Classroom_Management.Entity.Department;
import com.tka.Classroom_Management.Entity.Faculties;


@Repository
public class Faculties_dao {
	@Autowired
	SessionFactory sf;

	public List<Faculties> getallfaculties() {

		Session ss = sf.openSession();
		Criteria c = ss.createCriteria(Faculties.class);
		List<Faculties> allfaculties = c.list();
		System.out.println(allfaculties);
		return allfaculties;
		
	
	
	
	}

	public ArrayList<Faculties> get_Faculties_by_id(long id) {
		Session s = sf.openSession();
		Criteria c = s.createCriteria(Faculties.class);
		ArrayList<Faculties> al = new ArrayList<>();
		List<Faculties> faculties = c.list();
		for (Faculties data : faculties) {

			if (data.getId() == id) {

				al.add(data);
			}

		}

		return al;
	
	}

	public Faculties create_Faculties(Faculties faculties) {

		Session ss = sf.openSession();
		ss.save(faculties);
		Transaction t = ss.beginTransaction();
		t.commit();

		return null;
	
	}

	public Faculties update_Faculties(long id, Faculties faculties) {
		Session ss = sf.openSession();
		Faculties cs = new Faculties(id,faculties.getDepartment_id(),faculties.getEmail(),faculties.getName());
		Transaction t = ss.beginTransaction();

		ss.update(cs);
		t.commit();

		return null;
	
	}

	public Faculties deletefaculties(long id) {
		Session s = sf.openSession();

		Criteria c = s.createCriteria(Faculties.class);

		List<Faculties> faculties = c.list();
		for (Faculties alldata : faculties) {
			if (id == alldata.getId()) {
				Transaction ts = s.beginTransaction();

				Faculties st = new Faculties(id,alldata.getDepartment_id(),alldata.getEmail(),alldata.getName());
				st = (Faculties) s.merge(st);

				s.delete(st);
				ts.commit();
				s.close();
	
	}
	
		}
		return null;}
	

}
