package typedex;

import java.util.List;

public class Type implements IType{

	private String name;
	private List<IType> resists;
	private List<IType> weaknesses;
	private List<IType> immunities;

	/**
	 * 
	 * @param name
	 */
	public Type(String name) {
		// TODO - implement Type.Type
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param resists
	 * @param weaknesses
	 * @param immunities
	 */
	public Type(String name, List<IType> resists, List<IType> weaknesses, List<IType> immunities) {
		// TODO - implement Type.Type
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param name
	 */
	public IType getResist(String name) {
		// TODO - implement Type.getResist
		throw new UnsupportedOperationException();
	}

	public List<IType> getResists() {
		return this.resists;
	}

	/**
	 * 
	 * @param resists
	 */
	public void setResists(List<IType> resists) {
		this.resists = resists;
	}

	/**
	 * 
	 * @param resist
	 */
	public void addResist(IType resist) {
		// TODO - implement Type.addResist
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void removeResist(String name) {
		// TODO - implement Type.removeResist
		throw new UnsupportedOperationException();
	}

	public List<IType> getWeaknesses() {
		return this.weaknesses;
	}

	/**
	 * 
	 * @param weaknesses
	 */
	public void setWeaknesses(List<IType> weaknesses) {
		this.weaknesses = weaknesses;
	}

	/**
	 * 
	 * @param weakness
	 */
	public IType getWeakness(String weakness) {
		// TODO - implement Type.getWeakness
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param weakness
	 */
	public void addWeakness(IType weakness) {
		// TODO - implement Type.addWeakness
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void removeWeakness(String name) {
		// TODO - implement Type.removeWeakness
		throw new UnsupportedOperationException();
	}

	public List<IType> getImmunities() {
		return this.immunities;
	}

	/**
	 * 
	 * @param immunities
	 */
	public void setImmunities(List<IType> immunities) {
		this.immunities = immunities;
	}

	/**
	 * 
	 * @param immunity
	 */
	public IType getImmunity(String immunity) {
		// TODO - implement Type.getImmunity
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param immunity
	 */
	public void addImmunity(IType immunity) {
		// TODO - implement Type.addImmunity
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param immunity
	 */
	public void removeImmunity(String immunity) {
		// TODO - implement Type.removeImmunity
		throw new UnsupportedOperationException();
	}
}