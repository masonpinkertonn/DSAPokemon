import java.util.ArrayList;
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
	 * @param effectivenessMap this type's row of the type chart
	 * @throws java.lang.IllegalArgumentException if name or effectivenessMap is null
	 */
	public Type(String name, HashMap<String, Double> effectivenessMap)
	{
		if (name == null)
		{
			throw new IllegalArgumentException("name can't be null");
		}
		if (effectivenessMap == null)
		{
			throw new IllegalArgumentException("effectivenessMap can't be null");
		}

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
		if (defendingType == null)
		{
			throw new IllegalArgumentException("defendingType can't be null");
		}

		// This type's row is keyed by the defending type's name
		return effectivenessMap.get(defendingType.getName());
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
		ArrayList<String> effective = new ArrayList<String>();
		ArrayList<String> notEffective = new ArrayList<String>();
		ArrayList<String> immune = new ArrayList<String>();

		effectivenessMap.forEach((key, value) -> {
			if (value == 0) {
				immune.add(key);
			}
			if (value > 1.0) {
				effective.add(key);
			}
			else if (value < 1.0) {
				notEffective.add(key);
			}
		});

		String output = name + " type";

		output += "\n-----";

		output += "\nSuper effective against: " + (effective.size() > 0 ? effective : "(none)");

		output += "\nNot very effective against: " + (notEffective.size() > 0 ? notEffective : "(none)");

		output += "\nImmune to fire: " + (immune.size() > 0 ? immune : "(none)");

		return output;
	}

	/**
	 * Returns the type names in the list, separated by commas, or "(none)" if
	 * the list is empty.
	 *
	 * @param typeList the type names to list
	 * @return the type names as one String
	 */
	private String typeListMaker(ArrayList<String> typeList)
	{
		String result = "";
		if (typeList.size() == 0)
		{
			result += "(none)";
		}
		else
		{
			for (int i = 0; i < typeList.size(); i++)
			{
				String currType = typeList.get(i);
				result += currType;
				if (i < typeList.size() - 1)
					result += ", ";
			}
		}

		return result;
	}
}
