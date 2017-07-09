package model;

/**
 * Class representing the costs of something.
 * 
 * @author Bastian Lang
 *
 */
public class Cost {

	private int cristal;
	private int gas;

	public Cost(int crystal, int gas) {
		this.cristal = crystal;
		this.gas = gas;
	}

	public int getCristal() {
		return cristal;
	}

	public void setCristal(int cristal) {
		this.cristal = cristal;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

}
