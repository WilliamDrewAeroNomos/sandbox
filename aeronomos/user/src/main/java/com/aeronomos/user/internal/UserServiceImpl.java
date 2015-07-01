/**
 * 
 */
package com.aeronomos.user.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

import org.aeronomos.model.user.UserType;
import org.apache.xmlbeans.XmlOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.AbstractServiceImpl;
import com.aeronomos.commons.exception.AeroNomosException;
import com.aeronomos.user.UserService;
import com.hazelcast.core.Hazelcast;

/**
 * 
 * Last modified by : $Author: $
 * 
 * $Id: UserServiceImpl.java 265 2012-08-06 01:18:12Z  $
 * 
 */

public class UserServiceImpl extends AbstractServiceImpl implements UserService {

	/**
	 * @throws AeroNomosException
	 */
	public UserServiceImpl() throws AeroNomosException {
		super();
	}

	private static final Logger LOG = LoggerFactory
			.getLogger(UserServiceImpl.class.getName());

	private ConcurrentMap<UUID, UserType> map = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.user.UserService#start()
	 */
	public void start() throws AeroNomosException {

		LOG.debug("Starting user service...");

		map = Hazelcast.getMap("com.aeronomos.model.users");

		if (map == null) {
			throw new AeroNomosException(
					"Unable to create internal user map in UserService");
		}

		LOG.info("Started user service.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.user.UserService#stop()
	 */
	public void stop() {

		LOG.debug("Stopping user service...");

		LOG.info("Stopped user service.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.user.UserService#addUser(com.aeronomos.model.UserType)
	 */
	@Override
	public void addUser(final UserType user) throws AeroNomosException {

		if (user == null) {
			throw new AeroNomosException(
					"Error attempting to add user. User parameter was null.");
		}

		if (map == null) {
			throw new AeroNomosException(
					"Error attempting to add user. User map is null");
		}

		// TODO: Needs to go into either Commons or more likely Model service as a
		// common validation routine

		ArrayList validationErrors = new ArrayList();
		XmlOptions validationOptions = new XmlOptions();
		validationOptions.setErrorListener(validationErrors);

		if (!user.validate(validationOptions)) {
			Iterator<?> iter = validationErrors.iterator();
			while (iter.hasNext()) {
				System.out.println(">> " + iter.next() + "\n");
			}
			throw new AeroNomosException("Encountered invalid user");
		}

		map.put(UUID.fromString(user.getUuid()), user);

		LOG.debug("Added user [" + user.toString() + "]");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.user.UserService#getUser(java.lang.String)
	 */
	@Override
	public UserType getUser(final UserType user) throws AeroNomosException {

		if (map == null) {
			throw new AeroNomosException(
					"Error attempting to get user. User map is null");
		}

		if (user == null) {
			throw new AeroNomosException(
					"Error attempting to retrieve user. User parameter was null.");
		}

		UserType u = map.get(UUID.fromString(user.getUuid()));

		return u;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.user.UserService#removeUser(java.lang.String)
	 */
	@Override
	public UserType removeUser(final UserType user) throws AeroNomosException {

		if (map == null) {
			throw new AeroNomosException(
					"Error attempting to remove user. User map is null");
		}

		UserType userRemoved = null;

		if (user == null) {
			LOG.warn("User parameter was null when attempting to remove a user.");

		} else {

			userRemoved = map.remove(UUID.fromString(user.getUuid()));

			if (userRemoved != null) {
				LOG.debug("Removed user [" + userRemoved + "]");
			} else {
				LOG.debug("User [" + user + "] was not found in current list of users");
			}

		}

		return userRemoved;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.user.UserService#clear()
	 */
	@Override
	public void clear() {
		if (map != null) {
			LOG.debug("Cleared all users from the cache.");
			map.clear();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.user.UserService#getUsers()
	 */
	@Override
	public Collection<UserType> getUsers() {

		Collection<UserType> userCollection = null;

		if (map != null) {
			userCollection = map.values();
		}
		return userCollection;
	}
}
