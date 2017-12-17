package com.springboot.starter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="dept")

public class Dept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="deptno")
	private int deptno;
	
	@Column(name="deptname")
	private String deptname;
	
	@Column(name="deptloc")
	private String deptloc;
		
	public Dept() {
		
	}

	public Dept(String deptname, String deptloc) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.deptloc = deptloc;
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptloc() {
		return deptloc;
	}
	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", deptname=" + deptname
				+ ", deptloc=" + deptloc + "]";
	}
	
	

}
