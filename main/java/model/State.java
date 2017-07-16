package model;

import java.util.LinkedList;
import java.util.List;

import model.building.Building;
import model.building.CommandCenter;
import model.unit.Scv;
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
	private Resources resources;

	/**
	 * @return A standard initial game state containing a CC and 12 SCVs
	 */
	public static State createInitialState() {
		List<Building> buildings = new LinkedList<Building>();
		buildings.add(new CommandCenter());
		List<Unit> units = new LinkedList<Unit>();
		for (int i = 0; i < 12; i++) {
			units.add(new Scv());
		}
		Resources resources = new Resources(50, 0);
		return new State(buildings, units, resources);
	}

	public State(List<Building> buildings, List<Unit> units, Resources resources) {
		this.buildings = buildings;
		this.units = units;
		this.resources = resources;
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

	public Resources getResources() {
		return resources;
	}

	public void setResources(Resources resources) {
		this.resources = resources;
	}

	@Override
	public String toString() {
		return "State [buildings=" + buildings + ", units=" + units + ", resources=" + resources + "]";
	}

	public void addResources(Resources resourcesToAdd) {
		int crystal = resources.getCrystal() + resourcesToAdd.getCrystal();
		int gas = resources.getGas() + resourcesToAdd.getGas();
		resources.setCrystal(crystal);
		resources.setGas(gas);
	}

}
