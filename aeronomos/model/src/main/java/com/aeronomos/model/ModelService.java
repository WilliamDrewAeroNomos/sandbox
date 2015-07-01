/**
 * 
 */
package com.aeronomos.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.osgi.framework.BundleContext;
import org.springframework.context.ApplicationContext;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 241 $
 * 
 */
public interface ModelService {

	/**
	 * 
	 */
	void start();

	/**
	 * 
	 */
	void stop();

	/**
	 * Returns all the {@link Field}s in the class hierarchy for a particular
	 * object starting at the class represented by object.
	 * 
	 * @param object
	 *          Outermost class in the hierarchy
	 * @return List of {@link Field}s for all classes in the hierarchy.
	 * @throws ClassNotFoundException
	 */
	List<Field> getAllFieldsInHierarchy(final Object object)
			throws ClassNotFoundException;

	/**
	 * 
	 * @return
	 */
	ApplicationContext getApplicationContext();

	/**
	 * 
	 * @return
	 */
	BundleContext getBundleContext();

	/**
	 * Returns an {@link ArrayList} containing all the validation errors for an
	 * {@link XmlObject}.
	 * 
	 * @param xmlObject
	 * @return
	 */
	ArrayList<Object> getValidationErrors(
			final org.apache.xmlbeans.XmlObject xmlObject);

}