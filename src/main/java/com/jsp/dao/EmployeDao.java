package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.springframework.stereotype.Repository;

import com.jsp.bean.Employe;

@Repository
public class EmployeDao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("mvc");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public boolean addData(Employe emp)
	{
		
		try {
			transaction.begin();
			manager.persist(emp);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		
		}
		
	}
	
}
