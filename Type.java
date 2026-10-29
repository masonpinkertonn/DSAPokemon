import java.util.HashMap;

/**
 * A single Pokemon type, such as fire or water.
 *
 * Every Pokemon has one or two types and every move has exactly one type. Each
 * Type object knows how effective an attack of its type is against every
 * defending type. That information is its row of the type chart, stored as a
 * HashMap. The key is the defending type's name and the value is the
 * effectiveness.
 *
 *     For the fire Type, the map holds
 *         "grass"    ->  2.0    (fire is super effective against grass)
 *         "water"    ->  0.5    (fire is not very effective against water)
 *         "normal"   ->  1.0    (fire does normal damage to normal)
 *         ...and one entry for each of the other 15 types
 *
 * The 18 types, written exactly as they appear in typeChart.csv, are
 *
 *     normal, fighting, flying, poison, ground, rock, bug, ghost, steel,
 *     fire, water, grass, electric, psychic, ice, dragon, dark, fairy
 *
 * Type objects are created by the Pokedex class. Once created, a Type object
 * never changes.
 *
 * Getters are already completed for you.
 *
 * @author [your name here]
 */
public class Type
{
	// Do not add new instance variables.
	private String name;
	private HashMap<String, Double> effectiveness;

	/**
	 * Creates a Type with the given name and row of the type chart.
	 *
	 * Must be O(1).
	 *
	 * Example usage:
	 *
	 *     HashMap<String, Double> fireRow = new HashMap<>();
	 *     fireRow.put("grass", 2.0);
	 *     fireRow.put("water", 0.5);
	 *     ...one put for each of the 18 types
	 *
	 *     Type fire = new Type("fire", fireRow);
	 *
	 * @param name the name of the type, such as "fire"
	 * @param effectiveness this type's row of the type chart. The key is a
	 *     defending type's name and the value is how effective this type is
	 *     against it
	 * @throws java.lang.IllegalArgumentException if name or effectiveness is null
	 */
	public Type(String name, HashMap<String, Double> effectiveness)
	{
		// TODO: Implement this method
	}

	/**
	 * Returns how effective an attack of this type is against one defending type.
	 * The result is always 2.0, 1.0, 0.5, or 0.0.
	 *
	 * This method compares exactly one type against exactly one type.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     fire.getEffectiveness(grass)       returns 2.0
	 *     fire.getEffectiveness(water)       returns 0.5
	 *     fire.getEffectiveness(poison)      returns 1.0
	 *     ground.getEffectiveness(flying)    returns 0.0
	 *
	 * @param defendingType the type being attacked
	 * @return the effectiveness of this type against defendingType
	 * @throws java.lang.IllegalArgumentException if defendingType is null
	 */
	public double getEffectiveness(Type defendingType)
	{
		return 0.0; // TODO: Implement this method
	}

	/**
	 * Returns the name of this type.
	 *
	 * Must be O(1).
	 *
	 * @return the name of this type, such as "fire"
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns the name of this type.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     fire.toString()    returns "fire"
	 *
	 * @return the name of this type
	 */
	@Override
	public String toString()
	{
		return null; // TODO: Implement this method
	}
}
