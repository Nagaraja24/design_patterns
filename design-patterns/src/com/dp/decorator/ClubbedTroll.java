package com.dp.decorator;

// decorated classs
public class ClubbedTroll implements Troll {

	private Troll decorated;

	public ClubbedTroll(Troll theTroll) {
		this.decorated = theTroll;
	}

	@Override
	public void attack() {
		decorated.attack();
		System.out.println("The troll swings at you with club");
	}

	@Override
	public int getPowerAttack() {
		return decorated.getPowerAttack() + 10;
	}

	@Override
	public void fleeBattle() {
		decorated.fleeBattle();
	}

}
