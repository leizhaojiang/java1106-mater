package com.lanou.service;

import java.util.List;

import com.lanou.bean.Emp;

public interface EmpService {
	public List<Emp> findAllEmp();
	public void deleteEmpById(int id);
	public void addEmp(Emp emp);
	public int update(Emp emp);
	public Emp findEmpById(int id);
}
