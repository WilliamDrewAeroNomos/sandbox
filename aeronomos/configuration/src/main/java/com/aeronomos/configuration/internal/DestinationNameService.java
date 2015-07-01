/**
 * 
 */
package com.aeronomos.configuration.internal;

import java.util.Dictionary;
import java.util.Enumeration;

import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.exception.AeroNomosException;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IMap;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public class DestinationNameService implements ManagedService {

	private static final Logger LOG = LoggerFactory
			.getLogger(DestinationNameService.class.getName());

	private IMap<String, String> destinationNameMap = null;

	private final static String destinationsMapName = "com.aeronomos.destination.names";

	/**
	 * @throws AeroNomosException
	 */
	public DestinationNameService() throws AeroNomosException {

		LOG.debug("Creating distributed map of destination names...");

		destinationNameMap = Hazelcast.getMap(destinationsMapName);

		if (destinationNameMap == null) {
			throw new AeroNomosException("Unable to create destination name map");
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.service.cm.ManagedService#updated(java.util.Dictionary)
	 */
	@Override
	public void updated(@SuppressWarnings("rawtypes") Dictionary properties)
			throws ConfigurationException {

		if (properties == null) {

			LOG.debug("No configuration from configuration admin or "
					+ "old configuration has been deleted");

		} else {

			if (destinationNameMap != null) {

				LOG.debug("Previous destination name map values : ");
				LOG.debug(destinationNameMap.toString());

				LOG.debug("Destination name map being updated with [" + properties
						+ "] from [" + properties.get("felix.fileinstall.filename") + "]");

				LOG.debug("Clearing " + destinationsMapName + " map...");

				destinationNameMap.clear();

				@SuppressWarnings("unchecked")
				Enumeration<String> keys = properties.keys();

				while (keys.hasMoreElements()) {
					String key = keys.nextElement();

					if (key != null) {
						String value = (String) properties.get(key);
						if (value != null) {
							LOG.debug("Adding [" + key + "] [" + value
									+ "] to destination name map");
							destinationNameMap.put(key, value);
						}
					}
				}
				LOG.debug("Destination name map updated.");

			} else {
				LOG.warn("Destination name map was null");
			}

		}

	}

}
