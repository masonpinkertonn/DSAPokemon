import java.util.HashMap;

/**
 * A Pokemon in battle. It gets its name, types, and starting stats from its
 * PokedexEntry, and keeps track of everything that changes during a battle.
 * Getters and setters are already completed for you.
 */
public class Pokemon
{
	// Do not add new instance variables.
	private PokedexEntry entry;
	private int currentHP;

	// Keys are "attack", "defense", "spAttack", "spDefense", and "speed".
	private HashMap<String, Stat> stats;

	// A move listed as "none" in pokemon.csv is null here.
	private Move[] moves;

	// Confusion isn't a major status, so it's tracked separately below.
	private Status status;
	private int sleepTurns;

	private boolean confused;
	private int confusionTurns;

	/**
	 * Creates a Pokemon from its Pokedex entry, with full HP, every stage at 0,
	 * no status, no confusion, and a new Move for each of its default moves.
	 *
	 * @param entry this Pokemon's Pokedex entry
	 * @throws java.lang.IllegalArgumentException if entry is null
	 */
	public Pokemon(PokedexEntry entry)
	{
		// TODO: Implement this method
	}

	/**
	 * Returns this Pokemon's name.
	 *
	 * @return the Pokemon's name
	 */
	public String getName()
	{
		return entry.getName();
	}

	/**
	 * Returns this Pokemon's first type.
	 *
	 * @return the Pokemon's first type
	 */
	public Type getType1()
	{
		return entry.getType1();
	}

	/**
	 * Returns this Pokemon's second type.
	 *
	 * @return the Pokemon's second type, or null if it has only one type
	 */
	public Type getType2()
	{
		return entry.getType2();
	}

	/**
	 * Returns this Pokemon's max HP.
	 *
	 * @return the Pokemon's max HP
	 */
	public int getMaxHP()
	{
		return entry.getMaxHP();
	}

	/**
	 * Returns this Pokemon's current HP.
	 *
	 * @return the Pokemon's current HP
	 */
	public int getCurrentHP()
	{
		return currentHP;
	}

	/**
	 * Returns one of this Pokemon's five stats.
	 *
	 * @param statName "attack", "defense", "spAttack", "spDefense", or "speed"
	 * @return the Stat with that name
	 * @throws java.lang.IllegalArgumentException if statName isn't a stat name
	 */
	public Stat getStat(String statName)
	{
		if (!stats.containsKey(statName))
		{
			throw new IllegalArgumentException("Not a stat name: " + statName);
		}
		return stats.get(statName);
	}

	/**
	 * Returns one of this Pokemon's four moves.
	 *
	 * @param index the move's position, from 0 to 3
	 * @return the move at that position, or null if there isn't one
	 * @throws java.lang.IndexOutOfBoundsException if index is less than 0 or
	 *     more than 3
	 */
	public Move getMove(int index)
	{
		if (index < 0 || index >= moves.length)
		{
			throw new IndexOutOfBoundsException("index must be from 0 to 3");
		}
		return moves[index];
	}

	/**
	 * Returns this Pokemon's major status.
	 *
	 * @return the Pokemon's status, or Status.NONE if it has none
	 */
	public Status getStatus()
	{
		return status;
	}

	/**
	 * Returns how many more of its turns this Pokemon will sleep through.
	 *
	 * @return the number of turns left asleep
	 */
	public int getSleepTurns()
	{
		return sleepTurns;
	}

	/**
	 * Sets how many more of its turns this Pokemon will sleep through.
	 *
	 * @param turns the number of turns left asleep
	 * @throws java.lang.IllegalArgumentException if turns is negative
	 */
	public void setSleepTurns(int turns)
	{
		if (turns < 0)
		{
			throw new IllegalArgumentException("turns can't be negative");
		}
		sleepTurns = turns;
	}

	/**
	 * Returns true if this Pokemon is confused.
	 *
	 * @return true if this Pokemon is confused
	 */
	public boolean isConfused()
	{
		return confused;
	}

	/**
	 * Returns how many more of its turns this Pokemon will be confused.
	 *
	 * @return the number of turns left confused
	 */
	public int getConfusionTurns()
	{
		return confusionTurns;
	}

	/**
	 * Sets how many more of its turns this Pokemon will be confused.
	 *
	 * @param turns the number of turns left confused
	 * @throws java.lang.IllegalArgumentException if turns is negative
	 */
	public void setConfusionTurns(int turns)
	{
		if (turns < 0)
		{
			throw new IllegalArgumentException("turns can't be negative");
		}
		confusionTurns = turns;
	}

	/**
	 * Returns true if this Pokemon has fainted.
	 *
	 * @return true if current HP is 0
	 */
	public boolean isFainted()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Lowers current HP by the given amount, never going below 0.
	 *
	 * @param amount the amount of damage
	 * @return the HP actually lost
	 * @throws java.lang.IllegalArgumentException if amount is negative
	 */
	public int takeDamage(int amount)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Raises current HP by the given amount, never going above max HP.
	 *
	 * @param amount the amount of HP to restore
	 * @return the HP actually gained
	 * @throws java.lang.IllegalArgumentException if amount is negative
	 */
	public int restoreHP(int amount)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Returns true if at least one of this Pokemon's moves has PP left.
	 *
	 * @return true if any move has PP left
	 */
	public boolean hasPPRemaining()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns this Pokemon's Speed after its stage and paralysis are applied.
	 *
	 * @return this Pokemon's Speed in battle
	 */
	public int getBattleSpeed()
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Returns how effective an attack of the given type is against this Pokemon.
	 *
	 * @param attackingType the type of the attack
	 * @return 4.0, 2.0, 1.0, 0.5, 0.25, or 0.0
	 * @throws java.lang.IllegalArgumentException if attackingType is null
	 */
	public double getTypeEffectiveness(Type attackingType)
	{
		return 0.0; // TODO: Implement this method
	}

	/**
	 * Gives this Pokemon a major status, unless something about it prevents it.
	 * A Pokemon that falls asleep sleeps for a random 1 to 3 turns.
	 *
	 * @param newStatus the status to give this Pokemon
	 * @return true if the status was given
	 * @throws java.lang.IllegalArgumentException if newStatus is null or
	 *     Status.NONE
	 */
	public boolean inflictStatus(Status newStatus)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Sets this Pokemon's status to Status.NONE.
	 */
	public void cureStatus()
	{
		// TODO: Implement this method
	}

	/**
	 * Confuses this Pokemon for a random 1 to 4 turns, unless it's already
	 * confused.
	 *
	 * @return true if this Pokemon became confused
	 */
	public boolean confuse()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Ends this Pokemon's confusion.
	 */
	public void cureConfusion()
	{
		// TODO: Implement this method
	}

	/**
	 * Resets this Pokemon's stages and confusion as it switches out of battle.
	 */
	public void switchOut()
	{
		// TODO: Implement this method
	}

	/**
	 * Has this Pokemon struggle, and prints a message.
	 */
	public void struggle()
	{
		// TODO: Implement this method
	}

	/**
	 * Applies end-of-turn damage from burn or poison, and prints a message if
	 * this Pokemon loses HP.
	 *
	 * @return the HP this Pokemon lost
	 */
	public int applyEndOfTurnDamage()
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Applies the move's draining or recoil to this Pokemon, and prints a message
	 * if its HP changes.
	 *
	 * @param move the move this Pokemon used
	 * @param damageDealt the HP the opponent actually lost from the move
	 * @throws java.lang.IllegalArgumentException if move is null or damageDealt
	 *     is negative
	 */
	public void applyUserHPChange(Move move, int damageDealt)
	{
		// TODO: Implement this method
	}

	/**
	 * Returns the damage a move used by this Pokemon would do to the defender,
	 * without changing anyone's HP.
	 *
	 * @param move the damaging move being used
	 * @param defender the Pokemon being attacked
	 * @param isCritical true if the move landed a critical hit
	 * @param randomPercent the random percent in the damage formula, from 85 to 100
	 * @return the damage the move does
	 * @throws java.lang.IllegalArgumentException if move or defender is null, if
	 *     move is a status move, or if randomPercent is outside 85 to 100
	 */
	public int calculateDamage(Move move, Pokemon defender, boolean isCritical,
		int randomPercent)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Returns the damage this Pokemon does to itself when it hurts itself in its
	 * confusion, without changing its HP.
	 *
	 * @param randomPercent the random percent in the damage formula, from 85 to 100
	 * @return the damage this Pokemon does to itself
	 * @throws java.lang.IllegalArgumentException if randomPercent is outside 85
	 *     to 100
	 */
	public int calculateConfusionDamage(int randomPercent)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Decides whether this Pokemon can use its move this turn, and prints a
	 * message for anything that happens.
	 *
	 * @return true if this Pokemon can use its move
	 */
	public boolean canMove()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Rolls for a move's effect and applies it to this Pokemon or the defender if
	 * it happens, printing a message for anything that happens.
	 *
	 * @param move the move this Pokemon used
	 * @param defender the Pokemon that was targeted
	 * @throws java.lang.IllegalArgumentException if move or defender is null
	 */
	public void applyMoveEffect(Move move, Pokemon defender)
	{
		// TODO: Implement this method
	}

	/**
	 * Has this Pokemon use the move at the given position against the defender,
	 * or struggle if none of its moves has PP left, printing a message for
	 * everything that happens.
	 *
	 * @param moveIndex the move's position, from 0 to 3
	 * @param defender the Pokemon being targeted
	 * @throws java.lang.IllegalArgumentException if defender is null
	 * @throws java.lang.IllegalStateException if the move at moveIndex has 0 PP
	 *     while another move still has PP
	 */
	public void useMove(int moveIndex, Pokemon defender)
	{
		// TODO: Implement this method
	}

	/**
	 * Returns this Pokemon's name, types, HP, and status.
	 *
	 * @return a one-line description of this Pokemon
	 */
	@Override
	public String toString()
	{
		return null; // TODO: Implement this method
	}
}
