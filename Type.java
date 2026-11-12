import java.util.HashMap;

/**
 * A single Pokemon type, such as fire or water, along with its row of the type
 * chart. Getters are already completed for you.
 */
public class Type
{
	// Do not add new instance variables.
	private String name;

	// Key is a defending type's name. Value is how effective this type is
	// against it. For fire, "grass" maps to 2.0 and "water" maps to 0.5.
	private HashMap<String, Double> effectivenessMap;

	/**
	 * Creates a Type with the given name and row of the type chart.
	 *
	 * @param name the name of the type, such as "fire"
	 * @param effectiveness this type's row of the type chart
	 * @throws java.lang.IllegalArgumentException if name or effectiveness is null
	 */
	public Type(String name, HashMap<String, Double> effectivenessMap) throws IllegalArgumentException
	{
		// TODO: Implement this method
		this.name = name;
		this.effectivenessMap = effectivenessMap;
	}

	/**
	 * Returns the name of this type.
	 *
	 * @return the name of this type, such as "fire"
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns how effective an attack of this type is against one defending type.
	 *
	 * @param defendingType the type being attacked
	 * @return 2.0, 1.0, 0.5, or 0.0
	 * @throws java.lang.IllegalArgumentException if defendingType is null
	 */
	public double getEffectiveness(Type defendingType)
	{
		return 0.0; // TODO: Implement this method
	}

	/**
	 * Returns this type's name, followed by the types it's super effective
	 * against, the types it's not very effective against, and the types that
	 * are immune to it.
	 *
	 * @return a description of this type's matchups
	 */
	@Override
	public String toString()
	{
		return name + " is super effective against " + name + " and is not effective against " + name + " and these jawns are immune to it: " + name; // TODO: Implement this method
	}
}
