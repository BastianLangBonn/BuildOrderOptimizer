package data.building;

import java.util.List;

import data.Costs;
import data.unit.Unit;

/**
 * Interface for a building.
 * 
 * @author Bastian Lang
 *
 */
public interface Building {

	public Costs getCosts();

	public int getBuildTime();

	public String getName();

	public List<Unit> getAvailableUnits();

}
