package com.jforce.tr.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.handler.AbstractDetectingUrlHandlerMapping;

import com.jforce.tr.modal.Student;

@Repository
public class StudentDaoImpl implements StudentDao {



	@Override
	public List<Student> getStudentList() {
		return null;
	}

	@Override
	public Student getStudentById(Integer id) {
		return null;
	}

	@Override
	public void add(Student student) {
		
	}

	@Override
	public void update(Student student) {
		
	}

	@Override
	public void delete(Integer id) {
		
	}

}
