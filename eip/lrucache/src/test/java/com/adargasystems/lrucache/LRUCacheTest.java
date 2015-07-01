/**
 * 
 */
package com.adargasystems.lrucache;

import com.adargasystems.lrucache.LRUCache;

import junit.framework.TestCase;

/**
 * @author William
 *
 */
public class LRUCacheTest extends TestCase {

	/**
	 * Test method for
	 * {@link com.adargasystems.lrucache.LRUCache#add(java.lang.Object)}.
	 */
	public void testAdd() {
		LRUCache<String> sCache = new LRUCache<String>(6);

		sCache.add("First one");

		wait(1);

		sCache.add("Second one");

		wait(1);

		sCache.add("Third one");

		wait(1);

		sCache.add("Fourth one");

		wait(1);

		sCache.add("Fifth one");

		wait(1);

		sCache.add("Sixth one");

		sCache.showCache();

	}

	public void wait(int secs) {
//		try {
//			Thread.sleep(secs * 1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
