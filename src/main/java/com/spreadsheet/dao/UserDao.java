package com.spreadsheet.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spreadsheet.model.SpreadSheet;
import com.spreadsheet.model.User;

public class UserDao {
	
	
	// this method will be used when user click login button.
	public User checkExistUser(User user) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		String hql = "FROM User u WHERE u.name = :username " +
	             "and u.password = :password ";
		Query query = session.createQuery(hql);
		query.setParameter("username", user.getName());
		query.setParameter("password", user.getPassword());
		List<User> users = query.list();
		
		if(!users.isEmpty()) {
			return users.get(0);
		}
		/*for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User u = (User) iterator.next();
			return u;
		}*/		
		
		
		
		
		session.getTransaction().commit();
		
		session.close();

		return null;
	}
	
	public User save(User u) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		session.save(u);
		
		
		session.getTransaction().commit();
		
		session.close();

		return u;
	}
	
	public User findById(int id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		User u = (User) session.get(User.class, id);

		
		
		session.getTransaction().commit();
		
		session.close();

		return u;
	}

}
