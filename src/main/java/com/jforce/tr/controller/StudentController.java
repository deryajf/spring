package com.jforce.tr.controller;

import java.util.List;

import javax.naming.StringRefAddr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.dao.StudentDaoImpl;
import com.jforce.tr.modal.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentDaoImpl studentDao;

	// ****************TÜM ÖĞRENCİ LİSTESİ *********************
	
	@RequestMapping(path = "/students", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> students = studentDao.getStudentList();
		return ResponseEntity.ok(students);

	}
//ID YE GÖRE ÖĞRENCİ GETİRME= input olarak verdiğimiz id numarası hangisiyse o id ile kayıtlı olan kişiyi getirdi
	@RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
	public Student getStudentId(@PathVariable Integer id) {

		Student student = studentDao.getStudentById(id);

		return student;
	}
// ÖĞRENCİ SİL = input olarak verdiğimiz id numarasında kayıtlı olan kişiyi listeden sildi
	@RequestMapping(path = "/student/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer id) {
		studentDao.delete(id);
		return "Öğrenci silinmiştir...";
	}
	
	//Öğrenci ekle= Burada yeni id, isim ve soyisimle öğrenci ekledik
	@RequestMapping(path = "/student/add",method = RequestMethod.POST)
	public String add(@RequestBody Student student) {
	studentDao.add(student);
		return "Öğrenci eklenmiştir...";
	}
	
	//Güncelle=  Burada id yi verdik. Input olarak verdiğimiz id numarasına sahip kişinin adını ve soyadını bizim girdiğimiz yeni isim ve soyisimle güncelledi
	@RequestMapping(path = "/student/update",method = RequestMethod.PUT)
	public String update(@RequestBody Student student) {
		studentDao.update(student);
		return "Güncellenmiştir";
	}

}
