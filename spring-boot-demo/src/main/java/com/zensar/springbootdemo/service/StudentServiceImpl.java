package com.zensar.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.springbootdemo.dto.StudentDto;
import com.zensar.springbootdemo.entity.Student;
import com.zensar.springbootdemo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentDto getStudent(int studentId) {

		Student student = studentRepository.findById(studentId).get();

		StudentDto dto = mapToDto(student);
		return dto;
	}

	@Override
	public List<StudentDto> getAllStudents() {
		List<Student> listofStudents = studentRepository.findAll();
		List<StudentDto> listofStudentDto = new ArrayList<StudentDto>();

		for (Student student : listofStudents) {
			listofStudentDto.add(mapToDto(student));
		}
		return listofStudentDto;
	}

	@Override
	public StudentDto insertStudent(StudentDto studentDto) {

		Student student = mapToEntity(studentDto);
		Student insertedStudent = studentRepository.save(student);

		StudentDto mapToDto = mapToDto(insertedStudent);

		return mapToDto;

	}

	@Override
	public void updateStudent(int studentId, StudentDto studentDto) {

		Student student = mapToEntity(studentDto);
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);

	}

	public StudentDto mapToDto(Student student) {
		StudentDto dto = new StudentDto();
		dto.setStudentIdDto(student.getStudentId());
		dto.setStudentNameDto(student.getStudentName());
		dto.setStudentAgeDto(student.getStudentAge());

		return dto;

	}

	public Student mapToEntity(StudentDto studentDto) {
		Student student = new Student();
		student.setStudentId(studentDto.getStudentIdDto());
		student.setStudentName(studentDto.getStudentNameDto());
		student.setStudentAge(studentDto.getStudentAgeDto());
		return student;
	}

}
