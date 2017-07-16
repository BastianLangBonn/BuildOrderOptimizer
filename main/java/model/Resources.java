package model;

/**
 * Class representing the costs of something.
 * 
 * @author Bastian Lang
 *
 */
public class Resources {

	private int crystal;
	private int gas;

	public Resources(int crystal, int gas) {
		this.crystal = crystal;
		this.gas = gas;
	}

	public int getCristal() {
		return crystal;
	}

	public void setCristal(int cristal) {
		this.crystal = cristal;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	@Override
	public String toString() {
		return "Resources [crystal=" + crystal + ", gas=" + gas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + crystal;
		result = prime * result + gas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resources other = (Resources) obj;
		if (crystal != other.crystal)
			return false;
		if (gas != other.gas)
			return false;
		return true;
	}

}
