package com.dp.singleton;

//Double Checked Locking based Java implementation of 
//singleton design pattern 
public class Singleton {

	private volatile static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (instance == null) {
			// To make thread safe
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}

		}

		return instance;
	}

	// for serialization and deserialization
	protected Object readResolve() {
		return getInstance();
	}
}
