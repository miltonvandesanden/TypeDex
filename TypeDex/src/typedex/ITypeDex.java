package typedex;

import java.util.List;

public interface ITypeDex {

	void ITypeDex();

	List<IType> getTypes();

	/**
	 * 
	 * @param types
	 */
	void setTypes(List<IType> types);

	/**
	 * 
	 * @param type
	 */
	void getType(String type);

	/**
	 * 
	 * @param type
	 */
	void addType(IType type);

	/**
	 * 
	 * @param type
	 */
	void removeType(String type);

}