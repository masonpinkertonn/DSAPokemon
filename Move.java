/**
 * A move that a Pokemon knows in battle. Each Move keeps track of its own PP,
 * and gets the rest of its data from a MoveEntry that every copy of the move
 * shares. Everything except rollHit, rollCritical, and rollEffect is already
 * completed for you.
 */
public class Move
{
	// Do not add new instance variables.
	private MoveEntry entry;
	private int currentPP;

	/**
	 * Creates a Move with full PP from the given entry.
	 *
	 * @param entry the move's entry
	 * @throws java.lang.IllegalArgumentException if entry is null
	 */
	public Move(MoveEntry entry)
	{
		if (entry == null)
		{
			throw new IllegalArgumentException("entry can't be null");
		}

		this.entry = entry;
		currentPP = entry.getMaxPP();
	}

	/**
	 * Returns the move's name.
	 *
	 * @return the move's name
	 */
	public String getName()
	{
		return entry.getName();
	}

	/**
	 * Returns the move's type.
	 *
	 * @return the move's type
	 */
	public Type getType()
	{
		return entry.getType();
	}

	/**
	 * Returns the move's category.
	 *
	 * @return PHYSICAL, SPECIAL, or STATUS
	 */
	public Category getCategory()
	{
		return entry.getCategory();
	}

	/**
	 * Returns the move's power.
	 *
	 * @return the move's power, 0 for status moves
	 */
	public int getPower()
	{
		return entry.getPower();
	}

	/**
	 * Returns the move's accuracy.
	 *
	 * @return the percent chance the move hits, or -1 if it always hits
	 */
	public int getAccuracy()
	{
		return entry.getAccuracy();
	}

	/**
	 * Returns the PP the move starts each battle with.
	 *
	 * @return the move's maximum PP
	 */
	public int getMaxPP()
	{
		return entry.getMaxPP();
	}

	/**
	 * Returns the PP this move has left.
	 *
	 * @return the move's remaining PP
	 */
	public int getCurrentPP()
	{
		return currentPP;
	}

	/**
	 * Returns the move's priority.
	 *
	 * @return the move's priority
	 */
	public int getPriority()
	{
		return entry.getPriority();
	}

	/**
	 * Returns the move's critStage.
	 *
	 * @return 1 for a higher critical hit chance, otherwise 0
	 */
	public int getCritStage()
	{
		return entry.getCritStage();
	}

	/**
	 * Returns the move's userHPChange.
	 *
	 * @return the percent of damage dealt the user gains (positive) or loses
	 *     (negative)
	 */
	public int getUserHPChange()
	{
		return entry.getUserHPChange();
	}

	/**
	 * Returns the move's effect.
	 *
	 * @return a status, a stat name, or "none"
	 */
	public String getEffect()
	{
		return entry.getEffect();
	}

	/**
	 * Returns who the move's effect happens to.
	 *
	 * @return "self", "opponent", or "none"
	 */
	public String getEffectTarget()
	{
		return entry.getEffectTarget();
	}

	/**
	 * Returns how many stages the move's effect changes a stat by.
	 *
	 * @return the number of stages, positive to raise and negative to lower
	 */
	public int getStages()
	{
		return entry.getStages();
	}

	/**
	 * Returns the percent chance that the move's effect happens.
	 *
	 * @return the move's effect chance
	 */
	public int getChance()
	{
		return entry.getChance();
	}

	/**
	 * Returns true if this move is physical or special.
	 *
	 * @return true if this move deals damage
	 */
	public boolean isDamaging()
	{
		return getCategory() != Category.STATUS;
	}

	/**
	 * Returns true if this move has at least 1 PP left.
	 *
	 * @return true if this move has PP left
	 */
	public boolean hasPP()
	{
		return currentPP > 0;
	}

	/**
	 * Uses 1 of this move's PP.
	 *
	 * @throws java.lang.IllegalStateException if this move has 0 PP
	 */
	public void usePP()
	{
		if (currentPP == 0)
		{
			throw new IllegalStateException(getName() + " has no PP left");
		}
		currentPP--;
	}

	/**
	 * Decides whether this move hits, based on its accuracy.
	 *
	 * @return true if this move hits
	 */
	public boolean rollHit()
	{
		if (getAccuracy() == -1)
		{
			return true;
		}

		// A whole number from 1 to 100. It's at most the accuracy exactly
		// accuracy percent of the time.
		int roll = (int) (Math.random() * 100) + 1;
		return roll <= getAccuracy();
	}

	/**
	 * Decides whether this move lands a critical hit, based on its critStage.
	 *
	 * @return true if this move lands a critical hit
	 */
	public boolean rollCritical()
	{
		if (!isDamaging())
		{
			return false;
		}

		int oneIn = 24;
		if (getCritStage() == 1)
		{
			oneIn = 8;
		}

		// A whole number from 0 to oneIn - 1. It's 0 exactly 1 in oneIn times.
		int roll = (int) (Math.random() * oneIn);
		return roll == 0;
	}

	/**
	 * Decides whether this move's effect happens, based on its chance.
	 *
	 * @return true if this move's effect happens
	 */
	public boolean rollEffect()
	{
		if (getEffect().equals("none"))
		{
			return false;
		}

		int roll = (int) (Math.random() * 100) + 1;
		return roll <= getChance();
	}

	/**
	 * Returns this move's name, type, category, and PP.
	 *
	 * @return a one-line description of this move
	 */
	@Override
	public String toString()
	{
		return getName() + " (" + getType().getName() + ", "
			+ getCategory().toString().toLowerCase() + ") " + currentPP + "/" + getMaxPP()
			+ " PP";
	}
}
