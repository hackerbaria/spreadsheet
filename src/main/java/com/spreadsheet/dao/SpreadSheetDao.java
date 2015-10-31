package com.spreadsheet.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spreadsheet.model.SpreadSheet;

public class SpreadSheetDao {
	
	public boolean save(SpreadSheet ss) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		session.save(ss);
		
		
		session.getTransaction().commit();
		
		session.close();

		return true;
	}

}
