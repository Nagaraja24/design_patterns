package com.dp.decorator;


// Normal Class
public class SimpleTroll implements Troll {

	@Override
	public void attack() {
		System.out.println("The troll tries to grab you");
	}

	@Override
	public int getPowerAttack() {
		return 10;
	}

	@Override
	public void fleeBattle() {
		System.out.println("The troller shrieks in horror and runs away");
	}

}
