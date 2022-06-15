package com.zensar.springbootdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springbootdemo.dto.StudentDto;
import com.zensar.springbootdemo.entity.Student;
import com.zensar.springbootdemo.service.StudentService;

@RestController
@RequestMapping(value = "/student-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class StudentController {
	private List<Student> students = new ArrayList<Student>();

	public StudentController() {
		students.add(new Student(1001, "Teja", 23));
		students.add(new Student(1002, "Karthik", 28));
		students.add(new Student(1003, "Laxman", 26));
	}

	@Autowired
	private StudentService studentService;

	// http://localhost:6060/student
	// @RequestMapping("/students/{studentId}")
	@GetMapping(value = "/students/{studentId}")
	public ResponseEntity<StudentDto> getStudent(@PathVariable("studentId") int studentId) {
		return new ResponseEntity<StudentDto>(studentService.getStudent(studentId), HttpStatus.OK);

		// return studentService.getStudent(studentId);

	}

	// http://localhost:6060/students
	// @RequestMapping(value = { "/students", "/listOfStudents" },method =
	// RequestMethod.GET)
	@GetMapping(value = { "/students", "/listOfStudents" })
	public List<StudentDto> getAllStudents() {
		return studentService.getAllStudents();

	}

	// @RequestMapping(value ="/students",method=RequestMethod.POST)
	@PostMapping(value = "/students")
	public ResponseEntity<StudentDto> insertStudent(@RequestBody StudentDto studentDto) {

		return new ResponseEntity<StudentDto>(studentService.insertStudent(studentDto), HttpStatus.CREATED);
		// return studentService.insertStudent(studentDto);

		// System.out.println("Hi");

	}

	// @RequestMapping(value ="/students/{studentId}",method =RequestMethod.PUT)
	@PutMapping(value = "/students/{studentId}")
	public ResponseEntity<String> updateStudent(@PathVariable("studentId") int studentId,
			@RequestBody StudentDto studentDto) {

		return new ResponseEntity<String>("Student updated Succesfully ", HttpStatus.OK);

		// studentService.updateStudent(studentId, studentDto);

	}

	// http://localhost:6060/students -> Delete
	// @RequestMapping(value = "/students/{studentId}",method =
	// RequestMethod.DELETE)
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable("studentId") int studentId) {

		studentService.deleteStudent(studentId);
		return new ResponseEntity<String>("Student deleted successfully ", HttpStatus.OK);

	}
}
