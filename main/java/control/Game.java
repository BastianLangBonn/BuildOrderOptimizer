package control;

import java.util.LinkedList;

import model.Resources;
import model.State;
import model.building.Building;
import model.unit.Scv;
import model.unit.Unit;

/**
 * Contains the main loop.
 * 
 * @author Bastian Lang
 *
 */
public class Game {

	public static void main(String[] args) {
		runMilestone1();
	}

	private static void runMilestone1() {
		int time = 0;

		Scv scv = new Scv();
		LinkedList<Unit> units = new LinkedList<Unit>();
		units.add(scv);

		Resources resources = new Resources(0, 0);

		State state = new State(new LinkedList<Building>(), units, resources);

		while (time < 600) {
			for (Unit unit : state.getUnits()) {
				unit.update();
			}
			System.out.println(String.format("State at time %d: %s", time, state.toString()));
			time += 1;
		}
	}

}
