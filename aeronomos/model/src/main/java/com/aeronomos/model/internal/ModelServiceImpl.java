/**
 * 
 */
package com.aeronomos.model.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.xmlbeans.XmlOptions;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.osgi.context.BundleContextAware;

import com.aeronomos.model.ModelService;
import com.aeronomos.model.configuration.MessagingConfigurationDocument;
import com.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * 
 *         $Id: ModelServiceImpl.java 242 2012-08-02 21:48:29Z  $
 * 
 */
public class ModelServiceImpl implements ModelService, ApplicationContextAware,
		BundleContextAware {

	private static final Logger LOG = LoggerFactory
			.getLogger(ModelServiceImpl.class.getName());
	private BundleContext bundleContext;
	private ApplicationContext applicationContext;

	/**
	 * 
	 */
	public ModelServiceImpl() {
		super();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.csc.muthur.model.internal.ModelService#start()
	 */
	public void start() {

		LOG.info("Starting Model service...");

		MessagingConfigurationDocument messagingConfigurationDocument = MessagingConfigurationDocument.Factory
				.newInstance();
		MessagingConfiguration messagingConfiguration = messagingConfigurationDocument
				.addNewMessagingConfiguration();
		messagingConfiguration.setMessagingHost("localhost");
		messagingConfiguration.setMessagingPort(61616);
		messagingConfiguration.setMessagingTransport("tcp");

		LOG.info("Messaging configuration [" + messagingConfiguration + "]");

		LOG.info("Model service started.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.csc.muthur.model.internal.ModelService#stop()
	 */
	public void stop() {
		LOG.info("Stopping Model service...");

		LOG.info("Model service stopped.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.csc.muthur.commons.CommonsService#getAllFieldsInHierarchy(java.lang
	 * .Object)
	 */
	public List<Field> getAllFieldsInHierarchy(final Object object)
			throws ClassNotFoundException {

		List<Field> ll = new LinkedList<Field>();

		if (object != null) {

			// get the class
			Class<?> runtimeClazz = object.getClass();
			if (runtimeClazz != null) {
				String className = runtimeClazz.getName();
				if (className != null) {
					Class<?> clazz = Class.forName(className);

					if (clazz != null) {

						ll = getAllFields(ll, clazz);
					}
				}
			}
		}

		return ll;
	}

	/**
	 * Recursive method that traverses the object graph to retrieve all Fields.
	 * 
	 * @param fields
	 *          Will contain all the Fields in the class hierarchy upon return
	 * @param type
	 *          Outermost sub-class
	 * @return
	 */
	private static List<Field> getAllFields(List<Field> fields, Class<?> type) {

		for (Field field : type.getDeclaredFields()) {
			fields.add(field);
		}

		if (type.getSuperclass() != null) {
			fields = getAllFields(fields, type.getSuperclass());
		}

		return fields;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.model.ModelService#getValidationErrors(org.apache.xmlbeans
	 * .XmlObject)
	 */
	public ArrayList<Object> getValidationErrors(
			final org.apache.xmlbeans.XmlObject xmlObject) {

		ArrayList<Object> validationErrors = new ArrayList<Object>();
		XmlOptions validationOptions = new XmlOptions();
		validationOptions.setErrorListener(validationErrors);

		return validationErrors;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.osgi.context.BundleContextAware#setBundleContext(org
	 * .osgi.framework.BundleContext)
	 */
	@Override
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.model.ModelService#getBundleContext()
	 */
	@Override
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.context.ApplicationContextAware#setApplicationContext
	 * (org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	/**
	 * @return the applicationContext
	 */
	@Override
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
