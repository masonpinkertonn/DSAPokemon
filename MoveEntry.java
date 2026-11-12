/**
 * The data from one row of moves.csv. A MoveEntry never changes after it's
 * created, so every Move with the same name shares one MoveEntry. This file is
 * already completed for you.
 */
public class MoveEntry
{
	private String name;
	private Type type;
	private Category category;
	private int power;

	private int accuracy;
	private int maxPP;
	private int priority;
	private int critStage;

	private int userHPChange;

	// These match the effect, target, stages, and chance columns of moves.csv.
	private String effect;
	private String effectTarget;
	private int stages;
	private int chance;

	/**
	 * Creates a MoveEntry from the values in one row of moves.csv.
	 *
	 * @param name the move's name
	 * @param type the move's type
	 * @param category the move's category
	 * @param power the move's power
	 * @param accuracy the percent chance the move hits, or -1 if it always hits
	 * @param maxPP the PP the move starts each battle with
	 * @param priority the move's priority
	 * @param critStage 1 for a higher critical hit chance, otherwise 0
	 * @param userHPChange the percent of damage dealt the user gains or loses
	 * @param effect the move's effect, such as "burn", "attack", or "none"
	 * @param effectTarget "self", "opponent", or "none"
	 * @param stages how many stages the effect changes a stat by
	 * @param chance the percent chance the effect happens
	 * @throws java.lang.IllegalArgumentException if name, type, category, effect,
	 *     or effectTarget is null
	 */
	public MoveEntry(String name, Type type, Category category, int power, int accuracy,
		int maxPP, int priority, int critStage, int userHPChange, String effect,
		String effectTarget, int stages, int chance)
	{
		if (name == null)
		{
			throw new IllegalArgumentException("name can't be null");
		}
		if (type == null)
		{
			throw new IllegalArgumentException("type can't be null");
		}
		if (category == null)
		{
			throw new IllegalArgumentException("category can't be null");
		}
		if (effect == null)
		{
			throw new IllegalArgumentException("effect can't be null");
		}
		if (effectTarget == null)
		{
			throw new IllegalArgumentException("effectTarget can't be null");
		}

		this.name = name;
		this.type = type;
		this.category = category;
		this.power = power;

		this.accuracy = accuracy;
		this.maxPP = maxPP;
		this.priority = priority;
		this.critStage = critStage;

		this.userHPChange = userHPChange;

		this.effect = effect;
		this.effectTarget = effectTarget;
		this.stages = stages;
		this.chance = chance;
	}

	/**
	 * Returns the move's name.
	 *
	 * @return the move's name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns the move's type.
	 *
	 * @return the move's type
	 */
	public Type getType()
	{
		return type;
	}

	/**
	 * Returns the move's category.
	 *
	 * @return PHYSICAL, SPECIAL, or STATUS
	 */
	public Category getCategory()
	{
		return category;
	}

	/**
	 * Returns the move's power.
	 *
	 * @return the move's power, 0 for status moves
	 */
	public int getPower()
	{
		return power;
	}

	/**
	 * Returns the move's accuracy.
	 *
	 * @return the percent chance the move hits, or -1 if it always hits
	 */
	public int getAccuracy()
	{
		return accuracy;
	}

	/**
	 * Returns the PP the move starts each battle with.
	 *
	 * @return the move's maximum PP
	 */
	public int getMaxPP()
	{
		return maxPP;
	}

	/**
	 * Returns the move's priority.
	 *
	 * @return the move's priority
	 */
	public int getPriority()
	{
		return priority;
	}

	/**
	 * Returns the move's critStage.
	 *
	 * @return 1 for a higher critical hit chance, otherwise 0
	 */
	public int getCritStage()
	{
		return critStage;
	}

	/**
	 * Returns the move's userHPChange.
	 *
	 * @return the percent of damage dealt the user gains (positive) or loses
	 *     (negative)
	 */
	public int getUserHPChange()
	{
		return userHPChange;
	}

	/**
	 * Returns the move's effect.
	 *
	 * @return a status, a stat name, or "none"
	 */
	public String getEffect()
	{
		return effect;
	}

	/**
	 * Returns who the move's effect happens to.
	 *
	 * @return "self", "opponent", or "none"
	 */
	public String getEffectTarget()
	{
		return effectTarget;
	}

	/**
	 * Returns how many stages the move's effect changes a stat by.
	 *
	 * @return the number of stages, positive to raise and negative to lower
	 */
	public int getStages()
	{
		return stages;
	}

	/**
	 * Returns the percent chance that the move's effect happens.
	 *
	 * @return the move's effect chance
	 */
	public int getChance()
	{
		return chance;
	}

	/**
	 * Returns this entry in the same format as its row in moves.csv.
	 *
	 * @return this entry as one line of moves.csv
	 */
	@Override
	public String toString()
	{
		return name + "," + type.getName() + "," + category.toString().toLowerCase() + ","
			+ power + "," + accuracy + "," + maxPP + "," + priority + "," + critStage + ","
			+ userHPChange + "," + effect + "," + effectTarget + "," + stages + "," + chance;
	}
}
