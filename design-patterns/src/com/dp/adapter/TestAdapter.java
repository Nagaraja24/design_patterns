package com.dp.adapter;

/**
 * 
 * In software engineering, the adapter pattern is a software design pattern
 * that allows the interface of an existing class to be used as another
 * interface. It is often used to make existing classes work with others without
 * modifying their source code.
 * 
 * Use the Adapter pattern when:
 * 
 * you want to use an existing class, and its interface does not match the one
 * you need you want to create a reusable class that cooperates with unrelated
 * or unforeseen classes, that is, classes that don't necessarily have
 * compatible interfaces you need to use several existing subclasses, but it's
 * impractical to adapt their interface by subclassing every one. An object
 * adapter can adapt the interface of its parent class. most of the applications
 * using third party libraries use adapters as a middle layer between the
 * application and the 3rd party library to decouple the application from the
 * library. If another library has to be used only an adapter for the new
 * library is required without having to change the application code.
 * 
 * 
 * Java Examples: java.util.Arrays#asList() java.util.Collections#list()
 * java.util.Collections#enumeration()
 * javax.xml.bind.annotation.adapters.XMLAdapter
 * 
 * @author Nagaraj
 *
 */
public class TestAdapter {

	public static void main(String[] args) {
		Captain captain = new Captain(new FishingBoatAdapter());
		captain.row();
	}

}
