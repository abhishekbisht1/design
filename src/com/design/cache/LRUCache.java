package com.design.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private final int capacity;

	public LRUCache(int capacity) {

		super(capacity, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > capacity;
	}

	// Fetch from cache
	public V getCache(K key) {
		return super.getOrDefault(key, null);
	}

	public void putCache(K key, V value) {
		super.put(key, value);
	}

}
