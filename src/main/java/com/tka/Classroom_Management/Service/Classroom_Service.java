package com.tka.Classroom_Management.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.Classroom_Management.Dao.Classroom_dao;
import com.tka.Classroom_Management.Entity.Classrooms;

@Service
public class Classroom_Service {

	@Autowired
	Classroom_dao dao;

	public List<Classrooms> allclassrooms() {

		return dao.allclassrooms();

	}

	public ArrayList<Classrooms> get_classroom_by_id(@PathVariable long id) {

		List<Classrooms> allrooms = dao.allclassrooms();
		ArrayList<Classrooms> room = new ArrayList<>();
		for (Classrooms roomsid : allrooms) {
			if (id == roomsid.getId()) {
				room.add(roomsid);

			}
		}

		return room;

	}

	public Classrooms create_Classroom(Classrooms clasroom) {

		return dao.create_Classroom(clasroom);
	}

	public Classrooms update_classroom(@PathVariable long id, @RequestBody Classrooms classroom) {

		return dao.update_classroom(id, classroom);

	}

	public Classrooms deleteclasroom(long id) {
		return dao.deleteclasroom(id);
	}

}
