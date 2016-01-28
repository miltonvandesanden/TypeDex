package typedex;

import java.util.List;

public interface IType
{
    String getName();

    /**
     * 
     * @param name
     */
    void setName(String name);

    /**
     * 
     * @param resist
     * @return 
     */
    IType getResist(String resist);

    List<IType> getResists();

    /**
     * 
     * @param resists
     */
    void setResists(List<IType> resists);

    /**
     * 
     * @param resist
     */
    void addResist(IType resist);

    /**
     * 
     * @param resist
     */
    void removeResist(String resist);

    List<IType> getWeaknesses();

    /**
     * 
     * @param weaknesses
     */
    void setWeaknesses(List<IType> weaknesses);

    /**
     * 
     * @param weakness
     * @return 
     */
    IType getWeakness(String weakness);

    /**
     * 
     * @param weakness
     */
    void addWeakness(IType weakness);

    /**
     * 
     * @param weakness
     */
    void removeWeakness(String weakness);

    List<IType> getImmunities();

    /**
     * 
     * @param immunities
     */
    void setImmunities(List<IType> immunities);

    /**
     * 
     * @param immunity
     * @return 
     */
    IType getImmunity(String immunity);

    /**
     * 
     * @param immunity
     */
    void addImmunity(IType immunity);

    /**
     * 
     * @param immunity
     */
    void removeImmunity(String immunity);
}