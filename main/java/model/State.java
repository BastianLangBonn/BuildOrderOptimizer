package model;

import java.util.List;

import model.building.Building;
import model.unit.Unit;

/**
 * Class representing the state.
 * 
 * @author Bastian Lang
 *
 */
public class State {

	private List<Building> buildings;
	private List<Unit> units;

	/**
	 * @return The overall income per second.
	 */
	public Cost computeIncome() {
		return null;
	}

	public int computeOverallAttack() {
		return 0;
	}

	/* Getter & Setter */

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

}
