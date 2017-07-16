package model.building;

import java.util.List;

import model.Resources;

/**
 * Interface for a building.
 * 
 * @author Bastian Lang
 *
 */
public interface Building {

	public Resources getCosts();

	public int getBuildTime();

	public String getName();

	public List<String> getAvailableUnits();

}
