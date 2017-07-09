package model.unit;

import model.Cost;

/**
 * Interface for a unit.
 * 
 * @author Bastian Lang
 *
 */
public interface Unit {

	public Cost getCosts();

	public int getBuildTime();

	public double getAttack();

	public int getHealth();

	public int getArmor();

	public int getSupply();
}
