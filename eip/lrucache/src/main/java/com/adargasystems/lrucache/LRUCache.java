/**
 * 
 */
package com.adargasystems.lrucache;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author William
 * @param <T>
 *
 */
public class LRUCache<T> {

	private ConcurrentSkipListSet<CacheEntry<T>> entrySet = new ConcurrentSkipListSet<CacheEntry<T>>(
			new LRUCacheEntryComparator<T>());

	private long maxSize = 0L;
	private AtomicLong currentSize = new AtomicLong(0L);

	/**
	 * @return the currentSize
	 */
	public AtomicLong getCurrentSize() {
		return currentSize;
	}

	public LRUCache(final long maxSize) {
		this.maxSize = maxSize;
	}

	public void add(T value) {
		if (null != value) {

			if (currentSize.get() >= maxSize) {
				evictLRUEntry();
			}

			CacheEntry<T> ce = new CacheEntry<T>(value);

			entrySet.add(ce);

			currentSize.incrementAndGet();

			System.out.println("Added entry [" + ce + "]");
		}
	}

	private void evictLRUEntry() {
		CacheEntry<T> evictedEntry = entrySet.pollFirst();

		currentSize.decrementAndGet();

		System.out.println("Evicted entry [" + evictedEntry.getValue() + "]");
	}

	public void showCache() {

		System.out.println("Size of cache = [" + entrySet.size() + "]");

		Iterator<CacheEntry<T>> iter = entrySet.iterator();

		while (iter.hasNext()) {
			CacheEntry<T> entry = iter.next();

			System.out.println("Entry = [" + entry + "] - value = [" + entry
					+ "]");
		}
	}

}
