package com.tka.Classroom_Management.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Classroom_Management.Dao.Subjects_dao;
import com.tka.Classroom_Management.Entity.Subjects;

@Service

public class Subjects_service {
 @Autowired
 Subjects_dao sd;

public List<Subjects> getallSubjects() {
	return sd.getallSubjects();
}

public ArrayList<Subjects> get_Subjects_by_id(long id) {
	return sd.get_Subjects_by_id(id);
}

public Subjects create_Subjects(Subjects subjects) {
	return sd.create_Subjects(subjects);
}

public Subjects update_Subjects(long id, Subjects subjects) {
	return sd.update_Subjects(id, subjects);
}

public Subjects deletesubjects(long id) {
	return sd.deletesubjects(id);
}
 
 

	
}
