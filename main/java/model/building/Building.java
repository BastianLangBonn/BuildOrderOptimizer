package model.building;

import java.util.List;

import model.Cost;

/**
 * Interface for a building.
 * 
 * @author Bastian Lang
 *
 */
public interface Building {

	public Cost getCosts();

	public int getBuildTime();

	public String getName();

	public List<String> getAvailableUnits();

}
