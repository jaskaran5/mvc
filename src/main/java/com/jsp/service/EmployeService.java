package com.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.bean.Employe;
import com.jsp.dao.EmployeDao;

@Service
public class EmployeService {
	@Autowired
	EmployeDao dao;
	public boolean addData(Employe emp)
	{
		
		return dao.addData(emp);
	}
	
}
