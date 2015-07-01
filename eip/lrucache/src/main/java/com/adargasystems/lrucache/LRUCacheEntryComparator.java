/**
 * 
 */
package com.adargasystems.lrucache;

import java.util.Comparator;

/**
 * @author William
 *
 */
public class LRUCacheEntryComparator<T> implements Comparator<CacheEntry<T>>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(CacheEntry<T> o1, CacheEntry<T> o2) {
		return o1.compareTo(o2);
	}

}
