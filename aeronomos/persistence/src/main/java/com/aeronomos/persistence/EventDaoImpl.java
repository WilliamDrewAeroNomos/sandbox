package com.aeronomos.persistence;

import java.util.Collection;

import org.hibernate.SessionFactory;

public class EventDaoImpl implements EventDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Collection loadProductsByTitle(String title) {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from test.Event event where event.title=?")
				.setParameter(0, title).list();
	}
}