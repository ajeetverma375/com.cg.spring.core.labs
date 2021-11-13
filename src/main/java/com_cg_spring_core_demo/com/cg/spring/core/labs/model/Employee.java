package com_cg_spring_core_demo.com.cg.spring.core.labs.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;

	private SBU sbu;

	public SBU getSbu() {
		return sbu;
	}

	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}

	public Employee() {
	}

	public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age, SBU sbu) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
		this.sbu = sbu;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		System.out.println("Employee details");
		System.out.println("----------------------------");
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + ", age=" + age + ", sbu=" + sbu + "]";
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee details");
		System.out.println("----------------------------");
		System.out.println("Employee employeeId " + employeeId);
		System.out.println("Employee employeeName " + employeeName);
		System.out.println("Employee salary " + salary);
		System.out.println("Employee businessUnit " + businessUnit);
		System.out.println("Employee age " + age);
	}

}
