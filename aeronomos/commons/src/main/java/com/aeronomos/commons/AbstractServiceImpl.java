/**
 * 
 */
package com.aeronomos.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.exception.AeroNomosException;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IMap;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public abstract class AbstractServiceImpl {

	private static final Logger LOG = LoggerFactory
			.getLogger(AbstractServiceImpl.class.getName());

	private DestinationNameMapEntryListener destinationNameMapListener;
	private IMap<String, String> destinationNameMap = null;

	/**
	 * @throws AeroNomosException
	 * 
	 */
	public AbstractServiceImpl() throws AeroNomosException {

		LOG.debug("Creating distributed map of destination names...");

		destinationNameMap = Hazelcast.getMap("com.aeronomos.destination.names");

		destinationNameMapListener = new DestinationNameMapEntryListener();

		destinationNameMap.addEntryListener(destinationNameMapListener, true);

	}

	/**
	 * 
	 * @param key
	 * @param destinationName
	 */
	protected void addDestinationNameEntry(final String key,
			final String destinationName) {

		if ((key != null) && (destinationName != null)) {
			destinationNameMap.put(key, destinationName);
		}

	}

	/**
	 * 
	 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
	 * @version $Revision: 220 $
	 * 
	 */
	private class DestinationNameMapEntryListener implements
			EntryListener<String, String> {

		/**
		 * 
		 * @param listenerName
		 * @throws AeroNomosException
		 */
		public DestinationNameMapEntryListener() throws AeroNomosException {
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * com.hazelcast.core.EntryListener#entryAdded(com.hazelcast.core.EntryEvent
		 * )
		 */
		@Override
		public void entryAdded(EntryEvent<String, String> entry) {
			LOG.debug("Entry [" + entry.getValue() + "] added to DestinationNameMap");
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * com.hazelcast.core.EntryListener#entryEvicted(com.hazelcast.core.EntryEvent
		 * )
		 */
		@Override
		public void entryEvicted(EntryEvent<String, String> entry) {
			LOG.debug("Entry [" + entry.getName()
					+ "] evicted from DestinationNameMap");
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * com.hazelcast.core.EntryListener#entryRemoved(com.hazelcast.core.EntryEvent
		 * )
		 */
		@Override
		public void entryRemoved(EntryEvent<String, String> entry) {
			LOG.debug("Entry [" + entry.getName()
					+ "] removed from DestinationNameMap");
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * com.hazelcast.core.EntryListener#entryUpdated(com.hazelcast.core.EntryEvent
		 * )
		 */
		@Override
		public void entryUpdated(EntryEvent<String, String> entry) {
			LOG.debug("Entry [" + entry.getName() + "] updated in DestinationNameMap");
		}

	}
}
