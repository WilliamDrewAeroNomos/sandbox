/**
 * 
 */
package com.aeronomos.user.internal;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.aeronomos.model.message.CreateUserRequestDocument;
import org.aeronomos.model.message.CreateUserRequestDocument.CreateUserRequest;
import org.aeronomos.model.user.NameType;
import org.aeronomos.model.user.RoleType;
import org.aeronomos.model.user.UserType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aeronomos.commons.exception.AeroNomosException;
import com.aeronomos.user.UserService;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * 
 *         $Id: UserServiceImplTest.java 265 2012-08-06 01:18:12Z  $
 * 
 */

public class UserServiceImplTest {

	private static UserService userService = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		userService = new UserServiceImpl();
		userService.start();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		if (userService != null) {
			userService.stop();
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		userService.clear();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * 
	 */
	@Test
	public void testAddUser() {

		UserType u = null;

		try {

			Calendar c = Calendar.getInstance();

			CreateUserRequestDocument addUserRequestDoc = CreateUserRequestDocument.Factory
					.newInstance();

			CreateUserRequest createUserRequest = addUserRequestDoc
					.addNewCreateUserRequest();

			UserType user = createUserRequest.addNewUser();

			user.setUuid(UUID.randomUUID().toString());

			user.setActive(true);
			user.setDateActivated(c);
			user.setDateCreated(c);

			NameType name = user.addNewName();

			name.setFirst("William");
			name.setMiddle("John");
			name.setLast("Drew");

			RoleType role = user.addNewRole();

			role.setName("administrator");

			role.setDate(c);
			role.setDescription("This is a test role");

			userService.addUser(user);

		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

		assertTrue(userService.getUsers().size() == 1);

	}

	/**
	 * 
	 */
	@Test
	public void testGetUser() {

		Calendar c = Calendar.getInstance();

		UserType user = UserType.Factory.newInstance();

		user.setUuid(UUID.randomUUID().toString());

		user.setActive(true);
		user.setDateActivated(c);
		user.setDateCreated(c);

		NameType name = user.addNewName();

		name.setFirst("William");
		name.setMiddle("John");
		name.setLast("Drew");

		RoleType role = user.addNewRole();

		role.setName("administrator");

		role.setDate(c);
		role.setDescription("This is a test role");

		try {

			userService.addUser(user);

		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

		assertTrue(userService.getUsers().size() == 1);

		UserType userRetrieved = null;
		try {
			userRetrieved = userService.getUser(user);
		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

		assertTrue(userService.getUsers().size() == 1);

		assertNotNull(userRetrieved);

		assertTrue(userRetrieved.getUuid()
				.equalsIgnoreCase(userRetrieved.getUuid()));
		RoleType[] roles = userRetrieved.getRoleArray();
		assertNotNull(roles);

		assertTrue(roles[0].getName().equalsIgnoreCase(role.getName()));

	}

	/**
	 * 
	 */
	@Test
	public void testRemoveUser() {

		String firstName = "John";
		String lastName = "Doe";

		Calendar c = Calendar.getInstance();

		UserType user = UserType.Factory.newInstance();

		user.setUuid(UUID.randomUUID().toString());

		user.setActive(true);
		user.setDateActivated(c);
		user.setDateDeactivated(c);
		user.setDateCreated(c);

		NameType name = user.addNewName();

		name.setFirst(firstName);
		name.setLast(lastName);

		RoleType role = user.addNewRole();

		role.setName("administrator");

		c = Calendar.getInstance();
		Date startTime = c.getTime();
		startTime.setTime(System.currentTimeMillis());

		role.setDate(c);

		try {
			userService.addUser(user);
		} catch (AeroNomosException e1) {
			fail(e1.getLocalizedMessage());
		}

		assertTrue(userService.getUsers().size() == 1);

		UserType uRemoved = null;

		try {
			uRemoved = userService.removeUser(user);
		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

		// should NOT be null since we just added
		assertNotNull(uRemoved);

		// ensure that it's the one we just added
		assertTrue(uRemoved.getName().getLast().equalsIgnoreCase(name.getLast()));

		assertTrue(userService.getUsers().size() == 0);

		try {
			uRemoved = userService.removeUser(uRemoved);
			assertNull(uRemoved);
		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

	}

}
