package com.design.cache.usage;

import com.design.cache.LRUCache;

public class LRUCacheDemo {
	public static void main(String[] args) {
		LRUCache<Integer, String> cache = new LRUCache<>(3);

		cache.putCache(1, "Sunil");
		cache.putCache(2, "Shivam");
		cache.putCache(3, "Joshi");
		System.out.println("Cache: " + cache);

		cache.getCache(1); // Access key 1 (makes it most recently used)
		System.out.println("Cache after accessing key 1: " + cache);

		cache.putCache(4, "Rishi"); // Adding new entry will evict LRU
		System.out.println("Cache after adding key 4 (evicts least recently used): " + cache);
	}
}
