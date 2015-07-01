package com.aeronomos.persistence.event;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * 
 */

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public class EventManager {

	private HibernateTemplate hibernateTemplate;

	public EventManager() {

	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	public Collection loadProductsByCategory(String title)
			throws DataAccessException {
		return this.hibernateTemplate.find(
				"from test.Event product where product.title=?", title);
	}

}
