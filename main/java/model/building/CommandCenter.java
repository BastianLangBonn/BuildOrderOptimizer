package model.building;

import java.util.ArrayList;
import java.util.List;

import model.Resources;

public class CommandCenter implements Building {

	private static final Resources COSTS = new Resources(400, 0);
	private static final int BUILD_TIME = 71;
	private static final String NAME = "Command Center";
	private List<String> availableUnits;

	public CommandCenter() {
		availableUnits = new ArrayList<String>();
		availableUnits.add("SCV");
	}

	public Resources getCosts() {
		return COSTS;
	}

	public int getBuildTime() {
		return BUILD_TIME;
	}

	public String getName() {
		return NAME;
	}

	public List<String> getAvailableUnits() {
		return availableUnits;
	}

}
