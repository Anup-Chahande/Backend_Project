package com.tka.Classroom_Management.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Classroom_Management.Dao.Faculties_dao;
import com.tka.Classroom_Management.Entity.Faculties;

@Service
public class Faculties_service {
	@Autowired
	Faculties_dao fd;

	public List<Faculties> getallfaculties() {
		return fd.getallfaculties();
	}

	public ArrayList<Faculties> get_Faculties_by_id(long id) {
		return fd.get_Faculties_by_id(id);
	}

	public Faculties create_Faculties(Faculties faculties) {

	return fd.create_Faculties(faculties);
	
	}

	public Faculties update_Faculties(long id, Faculties faculties) {
		return fd.update_Faculties(id, faculties);
	}

	public Faculties deletefaculties(long id) {
		return fd.deletefaculties(id);
	}

}
