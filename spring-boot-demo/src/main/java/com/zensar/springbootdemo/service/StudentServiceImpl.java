package com.zensar.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.zensar.springbootdemo.dto.StudentDto;
import com.zensar.springbootdemo.entity.Student;
import com.zensar.springbootdemo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ModelMapper modelMapper;

	public StudentServiceImpl() {
	}

	@Override
	public StudentDto getStudent(int studentId) {
		Student getStudent = studentRepository.findById(studentId).get();
		return modelMapper.map(getStudent, StudentDto.class);
		// return mapToDto(getCoupon);
	}

	@Override
	public List<StudentDto> getAllStudent() {
		List<Student> listOfStudents = studentRepository.findAll();
		List<StudentDto> listOfStudentDto = new ArrayList<StudentDto>();

		for (Student student : listOfStudents) {
			// listOfCouponDto.add(mapToDto(coupon));
			listOfStudentDto.add(modelMapper.map(student, StudentDto.class));
		}
		return listOfStudentDto;
	}

	@Override
	public StudentDto insertStudent(StudentDto studentDto) {

		Student student = modelMapper.map(studentDto, Student.class);
		Student insertedStudent = studentRepository.save(student);
		// return mapToDto(insertedCoupon);
		return modelMapper.map(insertedStudent, StudentDto.class);

		/*
		 * Student student = mapToEntity(studentDto); Student insertedStudent =
		 * studentRepository.save(student);
		 * 
		 * StudentDto mapToDto = mapToDto(insertedStudent);
		 * 
		 * return mapToDto;
		 */
	}

	@Override
	public void updateStudent(int studentId, StudentDto studentDto) {

		Student student = modelMapper.map(studentDto, Student.class);
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);

	}

	@Override
	public List<StudentDto> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public StudentDto mapToDto(Student student) { StudentDto dto = new
	 * StudentDto(); dto.setStudentId(student.getStudentId());
	 * dto.setStudentName(student.getStudentName());
	 * dto.setStudentAge(student.getStudentAge());
	 * 
	 * return dto;
	 * 
	 * }
	 * 
	 * public Student mapToEntity(StudentDto studentDto) { Student student = new
	 * Student(); student.setStudentId(studentDto.getStudentId());
	 * student.setStudentName(studentDto.getStudentName());
	 * student.setStudentAge(studentDto.getStudentAge()); return student; }
	 */
	/*
	 * @Override public List<Student> test(String studentName) { // TODO
	 * Auto-generated method stub return studentRepository.test(studentName); }
	 * 
	 * @Override public List<Student> test1(String studentName, int studentAge) { //
	 * TODO Auto-generated method stub return studentRepository.test1(studentName,
	 * studentAge); }
	 */
}
