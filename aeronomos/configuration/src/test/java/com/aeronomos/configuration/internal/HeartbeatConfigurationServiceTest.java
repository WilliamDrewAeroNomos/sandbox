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
public class HeartbeatConfigurationServiceTest {

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

	/*
	 * 
	 */
	@Test
	public void testHeartbeatConfigurationService() {

		HeartbeatConfigurationService hbcs = null;

		try {

			hbcs = new HeartbeatConfigurationService();

		} catch (AeroNomosException e) {
			fail(e.getLocalizedMessage());
		}

		Hashtable<String, String> properties = new Hashtable<String, String>();
		properties.put("generateHeartbeat", "true");
		properties.put("intervalBetweenBeatsMSecs", "10000");

		try {
			hbcs.updated(properties);
		} catch (ConfigurationException e) {
			fail(e.getLocalizedMessage());
		}
	}

}
