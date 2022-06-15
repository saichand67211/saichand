package com.zensar.springbootdemo.dto;

public class StudentDto {
	private int studentIdDto;
	private String studentNameDto;
	private int studentAgeDto;
	public StudentDto() {
		super();
	}
	private StudentDto(int studentIdDto, String studentNameDto, int studentAgeDto) {
		super();
		this.studentIdDto = studentIdDto;
		this.studentNameDto = studentNameDto;
		this.studentAgeDto = studentAgeDto;
	}
	public int getStudentIdDto() {
		return studentIdDto;
	}
	public void setStudentIdDto(int studentIdDto) {
		this.studentIdDto = studentIdDto;
	}
	public String getStudentNameDto() {
		return studentNameDto;
	}
	public void setStudentNameDto(String studentNameDto) {
		this.studentNameDto = studentNameDto;
	}
	public int getStudentAgeDto() {
		return studentAgeDto;
	}
	public void setStudentAgeDto(int studentAgeDto) {
		this.studentAgeDto = studentAgeDto;
	}
	@Override
	public String toString() {
		return "StudentDto [studentIdDto=" + studentIdDto + ", studentNameDto=" + studentNameDto + ", studentAgeDto="
				+ studentAgeDto + "]";
	}

}
