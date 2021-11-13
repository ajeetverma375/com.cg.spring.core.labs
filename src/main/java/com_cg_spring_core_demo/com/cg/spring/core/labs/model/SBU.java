package com_cg_spring_core_demo.com.cg.spring.core.labs.model;

public class SBU {
	private int sbcode;
	private String sbuName;
	private String sbuHead;

	public SBU() {}
	
	public SBU(int sbcode, String sbuName, String sbuHead) {
		super();
		this.sbcode = sbcode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
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

	
}
