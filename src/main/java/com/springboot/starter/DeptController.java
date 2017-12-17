package com.springboot.starter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
	
	@Autowired
	
	private DeptService deptService;
	
	//Use URL http://localhost:8080/get-dept to get the result
	
	@RequestMapping("/get-dept")
	public List<Dept> getAllDepts(){
		return deptService.findAll();
	}
	
	//Use URL http://localhost:8080/get-dept/1 to get the result
	
	@RequestMapping("/get-dept/{deptno}")
	public Dept getDeptById(@PathVariable int deptno){
		return deptService.findById(deptno);
	}
	
	//Use URL http://localhost:8080/add-dept with Json Data as Message Body to add Dept
	
	@RequestMapping(method=RequestMethod.POST, value="/add-dept")
	public String addDept(@RequestBody Dept dept){
		return deptService.addDept(dept);
	}
	

	@RequestMapping(method=RequestMethod.PUT, value="/update-dept/{deptno}")
	public String updateDept(@RequestBody Dept dept, @PathVariable int deptno){
		System.out.println(deptno);
		System.out.println(dept.getDeptloc());
		return deptService.updateDept(dept, deptno);
	}
	

	@RequestMapping(method=RequestMethod.DELETE, value="/delete-dept/{deptno}")
	public String updateDept(@PathVariable int deptno){
		return deptService.deleteDept(deptno);
	}


	
	
}
