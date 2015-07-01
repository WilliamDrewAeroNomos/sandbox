package com.aeronomos.dcache.internal;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.Instance;
import com.hazelcast.core.InstanceEvent;
import com.hazelcast.core.InstanceListener;

public class CacheInstanceListener implements InstanceListener {

	private static final Logger LOG = LoggerFactory
			.getLogger(CacheInstanceListener.class.getName());

	/**
	 * 
	 */
	public CacheInstanceListener() {

	}

	/**
	 * @param event
	 */
	public void instanceCreated(InstanceEvent event) {
		Instance instance = event.getInstance();
		LOG.debug("Created " + instance.getInstanceType() + "," + instance.getId());
	}

	/**
	 * @param event
	 */
	public void instanceDestroyed(InstanceEvent event) {
		Instance instance = event.getInstance();
		LOG.debug("Destroyed " + instance.getInstanceType() + ","
				+ instance.getId());
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		CacheInstanceListener sample = new CacheInstanceListener();

		Hazelcast.addInstanceListener(sample);

		Collection<Instance> instances = Hazelcast.getInstances();
		for (Instance instance : instances) {
			LOG.debug(instance.getInstanceType() + "," + instance.getId());
		}
	}

}