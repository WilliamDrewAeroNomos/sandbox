/**
 * 
 */
package com.aeronomos.user;

import java.util.Collection;

import org.aeronomos.model.user.UserType;

import com.aeronomos.commons.exception.AeroNomosException;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 265 $
 * 
 */

public interface UserService {

	/**
	 * @throws AeroNomosException
	 * 
	 */
	void start() throws AeroNomosException;

	/**
	 * 
	 */
	void stop();

	/**
	 * Adds a {@link UserType}
	 * 
	 * @param userType
	 * @throws AeroNomosException
	 */
	void addUser(final UserType user) throws AeroNomosException;

	/**
	 * Removes the {@link UserType} from the system.
	 * 
	 * @param name
	 *          Name of the user to remove.
	 * @return User removed from the system as a {@link UserType} or null if the
	 *         user name is not found.
	 * @throws AeroNomosException
	 *           If the internal map is null then an exception is raised. An
	 *           exception can also be thrown by the ConcurrentMap itself.
	 */
	UserType removeUser(final UserType name) throws AeroNomosException;

	/**
	 * Retrieves an active user from the system in the form of a {@link UserType}.
	 * 
	 * @param user
	 *          User to match.
	 * @return
	 * @throws AeroNomosException
	 *           If the user is null or is empty or the internal map is null then
	 *           an exception is raised. An exception can also be thrown by the
	 *           ConcurrentMap itself.
	 */
	UserType getUser(final UserType user) throws AeroNomosException;

	/**
	 * Clears the list of users from the system. Used primarily for testing.
	 */
	void clear();

	/**
	 * Returns the list of users in the system as a {@link Collection} of
	 * {@link User}s.
	 * 
	 * @return List of {@link User}s in the system.
	 * 
	 */
	Collection<UserType> getUsers();

}