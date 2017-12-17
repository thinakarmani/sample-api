package com.springboot.starter;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface DeptRepository extends CrudRepository<Dept, Integer> {

		public List<Dept> findAll();
		Dept findByDeptno(Integer deptno);
		/*String addDept(Dept dept);
		String updateDept(int deptno, Dept dept);
		String deleteDept(int deptno);
		String deleteAllDept();*/
		
}
