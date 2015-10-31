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
	
	
	public SpreadSheet findById(int id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		SpreadSheet ss = (SpreadSheet) session.get(SpreadSheet.class, id);

		
		
		session.getTransaction().commit();
		
		session.close();

		return ss;
	}

}
