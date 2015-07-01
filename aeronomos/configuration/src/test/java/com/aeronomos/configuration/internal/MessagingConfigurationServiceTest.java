/**
 * 
 */
package com.aeronomos.configuration.internal;

import static org.junit.Assert.fail;

import java.util.Hashtable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.osgi.service.cm.ConfigurationException;

import com.aeronomos.commons.exception.AeroNomosException;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public class MessagingConfigurationServiceTest {

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
	 * {@link com.aeronomos.configuration.internal.MessagingConfigurationService#MessagingConfigurationService()}
	 * .
	 */
	@Test
	public void testMessagingConfigurationService() {
		MessagingConfigurationService mcs = null;
		try {
			mcs = new MessagingConfigurationService();
		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

		Hashtable<String, String> properties = new Hashtable<String, String>();
		properties.put("messagingPort", "61616");
		properties.put("messagingTransport", "tcp");
		properties.put("messagingHost", "localhost");
		try {
			mcs.updated(properties);
		} catch (ConfigurationException e) {
			fail(e.getLocalizedMessage());
		}
	}

}
