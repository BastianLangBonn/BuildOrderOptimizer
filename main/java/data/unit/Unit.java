package data.unit;

import data.Costs;

/**
 * Interface for a unit.
 * 
 * @author Bastian Lang
 *
 */
public interface Unit {

	public Costs getCosts();

	public int getBuildTime();

	public int getAttack();

	public int getDefense();

}
