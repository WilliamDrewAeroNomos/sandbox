/**
 * 
 */
package com.aeronomos.commons.internal;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.CommonsService;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */

public class CommonsServiceImpl implements CommonsService {

	private static final Logger LOG = LoggerFactory
			.getLogger(CommonsServiceImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.csc.muthur.commons.internal.CommonsService#start()
	 */
	public void start() {

		LOG.debug("Starting commons service...");

		LOG.info("Started commons service.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.csc.muthur.commons.internal.CommonsService#stop()
	 */
	public void stop() {

		LOG.debug("Stopping commons service...");

		LOG.debug("Stopped commons service...");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.csc.muthur.commons.CommonsService#findAvailablePort(int, int)
	 */
	public int findAvailablePort(final int minPort, final int maxPort) {

		if (maxPort < minPort) {
			throw new IllegalArgumentException(
					"Invalid port range provided. Minimum port was greater than the maximum port.");
		}

		int availablePort = -1;

		for (int x = minPort; x <= maxPort; x++) {
			if (portAvailable(x)) {
				availablePort = x;
				LOG.debug("Found port [" + availablePort + "] available.");
				break;
			}
		}

		return availablePort;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.csc.muthur.commons.CommonsService#portAvailable(int)
	 */
	public boolean portAvailable(int port) {

		ServerSocket ss = null;
		DatagramSocket ds = null;
		try {
			ss = new ServerSocket(port);
			ss.setReuseAddress(true);
			ds = new DatagramSocket(port);
			ds.setReuseAddress(true);
			return true;
		} catch (IOException e) {
		} finally {
			if (ds != null) {
				ds.close();
			}

			if (ss != null) {
				try {
					ss.close();
				} catch (IOException e) {
					/* should not be thrown */
				}
			}
		}

		return false;
	}

}
