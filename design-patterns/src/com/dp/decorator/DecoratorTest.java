package com.dp.decorator;

/**
 * 
 * 
 * Wikipedia - In object-oriented programming, the decorator pattern is a design
 * pattern that allows behavior to be added to an individual object, either
 * statically or dynamically, without affecting the behavior of other objects
 * from the same class. The decorator pattern is often useful for adhering to
 * the Single Responsibility Principle, as it allows functionality to be divided
 * between classes with unique areas of concern.
 * 
 * 
 * 
 * @author Admin
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {

		Troll troll = new SimpleTroll();
		troll.attack();
		troll.fleeBattle();

		Troll clubbedTroll = new ClubbedTroll(troll);
		clubbedTroll.attack();
		clubbedTroll.fleeBattle();

	}

}
