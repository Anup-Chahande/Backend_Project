package com.tka.Classroom_Management.Entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Class_schedules {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column(nullable = false)
	long classroom_id;

	@Column(nullable = false)
	String day_of_week;

	@Column(nullable = false)
	Time end_time;

	@Column(nullable = false)
	Time start_time;

	@Column(nullable = false)
	long subject_id;

	public Class_schedules() {
		super();
	}

	public Class_schedules(long id, long classroom_id, String day_of_week, Time end_time, Time start_time,
			long subject_id) {
		super();
		this.id = id;
		this.classroom_id = classroom_id;
		this.day_of_week = day_of_week;
		this.end_time = end_time;
		this.start_time = start_time;
		this.subject_id = subject_id;
	}

	public Class_schedules(long classroom_id, String day_of_week, Time end_time, Time start_time, long subject_id) {
		super();
		this.classroom_id = classroom_id;
		this.day_of_week = day_of_week;
		this.end_time = end_time;
		this.start_time = start_time;
		this.subject_id = subject_id;
	}

	@Override
	public String toString() {
		return "Class_schedules [id=" + id + ", classroom_id=" + classroom_id + ", day_of_week=" + day_of_week
				+ ", end_time=" + end_time + ", start_time=" + start_time + ", subject_id=" + subject_id + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getClassroom_id() {
		return classroom_id;
	}

	public void setClassroom_id(long classroom_id) {
		this.classroom_id = classroom_id;
	}

	public String getDay_of_week() {
		return day_of_week;
	}

	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}

	public Time getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}

	public Time getStart_time() {
		return start_time;
	}

	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}

	public long getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(long subject_id) {
		this.subject_id = subject_id;
	}

}
