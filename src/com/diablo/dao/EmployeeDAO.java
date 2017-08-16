package com.diablo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.diablo.entity.EmployeeEntity;



@Repository

public class EmployeeDAO {
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	public List<EmployeeEntity> viewEmployee(){
		session = sessionFactory.openSession();
		 session.beginTransaction();
		 List<EmployeeEntity> l = session.createQuery("from EmployeeEntity").list();
		 return l;
	}
}
