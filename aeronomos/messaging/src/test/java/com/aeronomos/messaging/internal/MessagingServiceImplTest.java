/**
 * 
 */
package com.aeronomos.messaging.internal;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aeronomos.commons.exception.AeroNomosException;
import com.aeronomos.messaging.MessagingService;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public class MessagingServiceImplTest {

	private static MessagingService messagingService;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

	}

	/**
	 * Test method for
	 * {@link com.aeronomos.messaging.internal.MessagingServiceImpl#MessagingServiceImpl()}
	 * .
	 */
	@Test
	public void testMessagingServiceImpl() {

		try {
			messagingService = new MessagingServiceImpl();
		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

		assertNotNull(messagingService);

		try {
			messagingService.start();
		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

		try {
			messagingService.stop();
		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

	}

}
