package com_cg_spring_core_demo.com.cg.spring.core.labs.model;

import java.util.List;

public class SBU {
	private int sbcode;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public SBU() {
	}

	public SBU(int sbcode, String sbuName, String sbuHead) {
		super();
		this.sbcode = sbcode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}

	public SBU(int sbcode, String sbuName, String sbuHead, List<Employee> empList) {
		super();
		this.sbcode = sbcode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}

	public int getSbcode() {
		return sbcode;
	}

	public void setSbcode(int sbcode) {
		this.sbcode = sbcode;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	@Override
	public String toString() {
		return "SBU [sbcode=" + sbcode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}

	public void display() {
		System.out.println("SBU details");
		System.out.println("-----------------------");
		System.out.println("SBU [sbcode=" + sbcode + ", sbuHead=" + sbuHead+ ", sbuName=" + sbuName  );
		System.out.println("Employee details");
		System.out.println("----------------------------");
		System.out.println("[ Employee ["	+ empList + "]");
	}

}
