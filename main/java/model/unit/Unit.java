package model.unit;

import model.Resources;

/**
 * Interface for a unit.
 * 
 * @author Bastian Lang
 *
 */
public interface Unit {

	public Resources getCosts();

	public int getBuildTime();

	public double getAttack();

	public int getHealth();

	public int getArmor();

	public int getSupply();

	/**
	 * Updates the state of the unit for the next timestep.
	 */
	public void update();
}
