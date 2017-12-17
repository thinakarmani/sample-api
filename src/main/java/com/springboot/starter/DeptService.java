package com.springboot.starter;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.starter.DeptRepository;

@Service
@Transactional

public class DeptService {
	
	@Autowired
	private DeptRepository deptRepository;
	
/*	public DeptService(DeptRepository deptRepository) {
		this.deptRepository = deptRepository;
	}
*/	
	public List<Dept> findAll() {
		List<Dept> depts = new ArrayList<>();
		for(Dept dept : deptRepository.findAll()) {
			depts.add(dept);
		}
		return depts;
	}
	
	public Dept findById(int deptno) {
		Dept dept = deptRepository.findOne(deptno);
		return dept;
	}
	
	public String addDept(Dept dept) {
		deptRepository.save(dept);
		return "Dept " + dept.getDeptno() + " Created";
	}
	
	public String updateDept(Dept dept, int deptno) {
		
		Dept d = deptRepository.findOne(deptno);
		d.setDeptname(dept.getDeptname());
		d.setDeptloc(dept.getDeptloc());
		deptRepository.save(d);
		return "Dept " + deptno + " Updated";
	}
	
	public String deleteDept(int deptno) {
		deptRepository.delete(deptno);
		return "Dept " + deptno + " Deleted!";
	}
	

}
