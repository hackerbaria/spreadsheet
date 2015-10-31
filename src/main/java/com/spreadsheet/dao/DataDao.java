package com.spreadsheet.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spreadsheet.model.Data;

public class DataDao {
	public boolean save(Data data) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		session.save(data);
		
		
		session.getTransaction().commit();
		
		session.close();

		return true;
	}

}
