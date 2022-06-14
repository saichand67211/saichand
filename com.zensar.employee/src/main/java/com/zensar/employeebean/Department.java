package com.zensar.employeebean;

public class Department {
	private int departmentId;
	private String departmentname;
	private Department() {
		super();
	}
	private Department(int departmentId, String departmentname) {
		super();
		this.departmentId = departmentId;
		this.departmentname = departmentname;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentname=" + departmentname + "]";
	}
	
	

}
