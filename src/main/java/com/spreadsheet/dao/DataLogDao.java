package com.spreadsheet.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spreadsheet.model.DataLog;

public class DataLogDao {
	
	public DataLog save(DataLog dataLog) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		session.save(dataLog);
		
		
		session.getTransaction().commit();
		
		session.close();

		return dataLog;
	}

}
