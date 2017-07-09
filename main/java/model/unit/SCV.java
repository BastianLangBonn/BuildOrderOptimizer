package model.unit;

import model.Cost;

public class SCV implements Unit {

	private static final Cost COSTS = new Cost(50, 0);
	private static final int BUILD_TIME = 12;
	private static final double ATTACK = 0;
	private static final int HEALTH = 45;
	private static final int SUPPLY = 1;
	private static final int ARMOR = 0;

	public Cost getCosts() {
		return COSTS;
	}

	public int getBuildTime() {
		return BUILD_TIME;
	}

	public int getHealth() {
		return HEALTH;
	}

	public int getSupply() {
		return SUPPLY;
	}

	public double getAttack() {
		return ATTACK;
	}

	public int getArmor() {
		return ARMOR;
	}

}
