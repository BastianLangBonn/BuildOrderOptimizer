package model.unit;

import model.Resources;

public class Scv implements Unit, ResourceCollector {

	private static final Resources COSTS = new Resources(50, 0);
	private static final int BUILD_TIME = 12;
	private static final double ATTACK = 0;
	private static final int HEALTH = 45;
	private static final int SUPPLY = 1;
	private static final int ARMOR = 0;
	public static final int TIME_TO_MINE = 5;
	public static final int CRYSTAL_CAPACITY = 5;

	private static int idCount = 0;

	private int secondsToReturnCrystal;

	public int getSecondsToReturnCrystal() {
		return secondsToReturnCrystal;
	}

	private int id;
	private Resources collectedResourcesThisTurn;

	public Scv() {
		secondsToReturnCrystal = TIME_TO_MINE;
		id = idCount;
		idCount++;
	}

	public Resources getCosts() {
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

	public void update() {
		secondsToReturnCrystal--;
		if (secondsToReturnCrystal == 0) {
			collectedResourcesThisTurn = new Resources(5, 0);
			secondsToReturnCrystal = TIME_TO_MINE;
		} else {
			collectedResourcesThisTurn = new Resources(0, 0);
		}
	}

	public Resources getCollectedResourcesThisTurn() {
		return collectedResourcesThisTurn;
	}

	@Override
	public String toString() {
		return "Scv [secondsToReturnCrystal=" + secondsToReturnCrystal + ", id=" + id + "]";
	}
}
