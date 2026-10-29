/**
 * A move that a Pokemon can use in battle.
 *
 * Every Move holds the data from one row of moves.csv, plus how much PP it has
 * left. The meaning of each column is explained in the Battle Rules document.
 *
 * Move objects are created by the Pokedex class. A Move only knows its own
 * data. The PokemonBattler class decides what happens when a move is used.
 *
 * Getters are already completed for you.
 *
 * @author [your name here]
 */
public class Move
{
	// Do not add new instance variables.
	private String name;
	private Type type;
	private String category;
	private int power;

	private int accuracy;
	private int maxPp;
	private int currentPp;
	private int priority;

	private int critStage;
	private int userHpChange;

	// The move's effect. These four match the effect, target, stages,
	// and chance columns of moves.csv.
	private String effect;
	private String effectTarget;
	private int stages;
	private int chance;

	/**
	 * Creates a Move from the values in one row of moves.csv. The new move
	 * starts with full PP.
	 *
	 * Must be O(1).
	 *
	 * Example usage:
	 *
	 *     Move flamethrower = new Move("Flamethrower", fire, "special", 90, 100,
	 *         15, 0, 0, 0, "burn", "opponent", 0, 10);
	 *
	 *     flamethrower.getPower()        returns 90
	 *     flamethrower.getCurrentPp()    returns 15
	 *     flamethrower.getEffect()       returns "burn"
	 *
	 * @param name the move's name
	 * @param type the move's type
	 * @param category "physical", "special", or "status"
	 * @param power the move's power, 0 for status moves
	 * @param accuracy the percent chance the move hits, or -1 if it always hits
	 * @param pp the PP the move starts each battle with
	 * @param priority the move's priority (only used in an add-on)
	 * @param critStage 1 for moves with a higher critical hit chance, otherwise 0
	 * @param userHpChange the percent of the damage dealt the user gains
	 *     (positive) or loses (negative)
	 * @param effect the move's effect, such as "burn", "attack", or "none"
	 * @param effectTarget "self", "opponent", or "none"
	 * @param stages how many stages the effect changes a stat by
	 * @param chance the percent chance the effect happens
	 * @throws java.lang.IllegalArgumentException if name, type, category, effect,
	 *     or effectTarget is null
	 */
	public Move(String name, Type type, String category, int power, int accuracy,
		int pp, int priority, int critStage, int userHpChange, String effect,
		String effectTarget, int stages, int chance)
	{
		// TODO: Implement this method
	}

	/**
	 * Creates a new Move with the same data as the given move. The new move
	 * starts with full PP. Using the new move never changes the PP of the
	 * original move, and using the original move never changes the PP of the
	 * new move.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Move copy = new Move(flamethrower);
	 *     copy.usePp();
	 *
	 *     copy.getCurrentPp()            returns 14
	 *     flamethrower.getCurrentPp()    still returns 15
	 *
	 * @param other the move to copy
	 * @throws java.lang.IllegalArgumentException if other is null
	 */
	public Move(Move other)
	{
		// TODO: Implement this method
	}

	/**
	 * Returns true if this move deals damage. Physical and special moves deal
	 * damage. Status moves don't.
	 *
	 * Must be O(1).
	 *
	 * @return true if this move's category is physical or special
	 */
	public boolean isDamaging()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns true if this move has at least 1 PP left.
	 *
	 * Must be O(1).
	 *
	 * @return true if this move's current PP is more than 0
	 */
	public boolean hasPp()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Uses 1 of this move's PP.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     A move with 10 PP that has been used 3 times has 7 PP remaining.
	 *
	 * @throws java.lang.IllegalStateException if this move has 0 PP
	 */
	public void usePp()
	{
		// TODO: Implement this method
	}

	/**
	 * Returns this move's name.
	 *
	 * Must be O(1).
	 *
	 * @return the move's name, such as "Flamethrower"
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns this move's type.
	 *
	 * Must be O(1).
	 *
	 * @return the move's type
	 */
	public Type getType()
	{
		return type;
	}

	/**
	 * Returns this move's category.
	 *
	 * Must be O(1).
	 *
	 * @return "physical", "special", or "status"
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * Returns this move's power. Status moves have a power of 0.
	 *
	 * Must be O(1).
	 *
	 * @return the move's power
	 */
	public int getPower()
	{
		return power;
	}

	/**
	 * Returns this move's accuracy, the percent chance it hits. An accuracy
	 * of -1 means the move always hits.
	 *
	 * Must be O(1).
	 *
	 * @return the move's accuracy
	 */
	public int getAccuracy()
	{
		return accuracy;
	}

	/**
	 * Returns the PP this move starts each battle with.
	 *
	 * Must be O(1).
	 *
	 * @return the move's maximum PP
	 */
	public int getMaxPp()
	{
		return maxPp;
	}

	/**
	 * Returns the PP this move has left.
	 *
	 * Must be O(1).
	 *
	 * @return the move's remaining PP
	 */
	public int getCurrentPp()
	{
		return currentPp;
	}

	/**
	 * Returns this move's priority. Priority is only used in an add-on.
	 *
	 * Must be O(1).
	 *
	 * @return the move's priority
	 */
	public int getPriority()
	{
		return priority;
	}

	/**
	 * Returns this move's critStage, 1 for moves with a higher critical hit
	 * chance and 0 for every other move.
	 *
	 * Must be O(1).
	 *
	 * @return the move's critStage
	 */
	public int getCritStage()
	{
		return critStage;
	}

	/**
	 * Returns this move's userHpChange, the percent of the damage dealt that the
	 * user gains (positive, draining) or loses (negative, recoil). Most moves
	 * have a userHpChange of 0.
	 *
	 * Must be O(1).
	 *
	 * @return the move's userHpChange
	 */
	public int getUserHpChange()
	{
		return userHpChange;
	}

	/**
	 * Returns this move's effect. It's a status ("burn", "paralyze", "freeze",
	 * "sleep", "poison", or "confuse"), a stat ("attack", "defense", "spAttack",
	 * "spDefense", or "speed"), or "none".
	 *
	 * Must be O(1).
	 *
	 * @return the move's effect
	 */
	public String getEffect()
	{
		return effect;
	}

	/**
	 * Returns who this move's effect happens to.
	 *
	 * Must be O(1).
	 *
	 * @return "self", "opponent", or "none"
	 */
	public String getEffectTarget()
	{
		return effectTarget;
	}

	/**
	 * Returns how many stages this move's effect changes a stat by. Positive
	 * numbers raise the stat and negative numbers lower it. Always 0 for moves
	 * whose effect isn't a stat.
	 *
	 * Must be O(1).
	 *
	 * @return the number of stages
	 */
	public int getStages()
	{
		return stages;
	}

	/**
	 * Returns the percent chance that this move's effect happens.
	 *
	 * Must be O(1).
	 *
	 * @return the move's effect chance
	 */
	public int getChance()
	{
		return chance;
	}

	/**
	 * Returns the move's name, type, category, and PP.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Flamethrower (fire, special) 15/15 PP
	 *     Swords Dance (normal, status) 19/20 PP
	 *
	 * @return a one-line description of this move
	 */
	@Override
	public String toString()
	{
		return null; // TODO: Implement this method
	}
}
