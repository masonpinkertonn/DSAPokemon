import java.util.HashMap;

/**
 * A Pokemon that can battle.
 *
 * A Pokemon object keeps track of its own HP, stats and stat stages, four moves,
 * and any status or confusion it has during a battle. Its methods only look at
 * or change this one Pokemon. The PokemonBattler class applies the rules of the
 * battle by calling these methods. Pokemon objects are created by the Pokedex
 * class.
 *
 * The keys of the stats HashMap are the five stat names, written exactly as
 * they appear in the header of pokemon.csv.
 *
 *     "attack", "defense", "spAttack", "spDefense", "speed"
 *
 * Each value is an int array of length 2. Index 0 holds the stat from
 * pokemon.csv and index 1 holds the stat's current stage.
 *
 *     A Charizard whose Attack has been raised by Swords Dance has
 *         stats.get("attack")    holding [115, 2]
 *
 * Getters and setters are already completed for you.
 *
 * @author [your name here]
 */
public class Pokemon
{
	// Do not add new instance variables.
	private String name;
	private Type type1;
	private Type type2;

	private int maxHp;
	private int currentHp;

	// Key is a stat name. Index 0 of the value is the stat from pokemon.csv,
	// and index 1 is the stat's current stage.
	private HashMap<String, int[]> stats;

	private Move[] moves;

	// status is "none", "burn", "paralyze", "freeze", "sleep", or "poison".
	// While asleep, sleepTurns is how many more of its turns it will sleep
	// through before it wakes up.
	private String status;
	private int sleepTurns;

	// While confused, confusionTurns is how many more of its turns it will be
	// confused before it snaps out of it.
	private boolean confused;
	private int confusionTurns;

	/**
	 * Creates a Pokemon from the values in one row of pokemon.csv.
	 *
	 * The new Pokemon has full HP, a stage of 0 in every stat, no status, and is
	 * not confused.
	 *
	 * Must be O(1).
	 *
	 * Example usage:
	 *
	 *     Pokemon charizard = new Pokemon("Charizard", fire, flying, 164, 115, 109,
	 *         140, 116, 131, charizardMoves);
	 *
	 *     charizard.getCurrentHp()          returns 164
	 *     charizard.getStat("spAttack")     returns 140
	 *     charizard.getType2().getName()    returns "flying"
	 *
	 * @param name the Pokemon's name
	 * @param type1 the Pokemon's first type
	 * @param type2 the Pokemon's second type, or null if it has only one type
	 * @param maxHp the Pokemon's max HP
	 * @param attack the Pokemon's Attack
	 * @param defense the Pokemon's Defense
	 * @param spAttack the Pokemon's Special Attack
	 * @param spDefense the Pokemon's Special Defense
	 * @param speed the Pokemon's Speed
	 * @param moves the Pokemon's four moves. A move listed as "none" in
	 *     pokemon.csv is null in this array
	 * @throws java.lang.IllegalArgumentException if name, type1, or moves is null,
	 *     or if moves doesn't have a length of 4
	 */
	public Pokemon(String name, Type type1, Type type2, int maxHp, int attack,
		int defense, int spAttack, int spDefense, int speed, Move[] moves)
	{
		// TODO: Implement this method
	}

	/**
	 * Creates a new Pokemon that is a copy of the given Pokemon, with the same
	 * name, types, HP, stats, stages, status, and moves.
	 *
	 * The copy and the original never affect each other. Anything that happens
	 * to one, such as losing HP, changing a stat stage, or using a move's PP,
	 * never changes the other.
	 *
	 * Must be O(1).
	 *
	 * @param other the Pokemon to copy
	 * @throws java.lang.IllegalArgumentException if other is null
	 */
	public Pokemon(Pokemon other)
	{
		// TODO: Implement this method
	}

	/**
	 * Returns the value of the given stat during battle, after its stage is
	 * applied. Rounded down. Does not include the effect of paralysis on
	 * Speed (see getBattleSpeed).
	 *
	 * Must be O(1).
	 *
	 * Example (for a Charizard, whose Attack in pokemon.csv is 115):
	 *
	 *     At stage  0, getStat("attack") returns 115
	 *     At stage +2, getStat("attack") returns 230
	 *     At stage -1, getStat("attack") returns 76
	 *
	 * @param statName one of the five stat names
	 * @return the value of the stat after its stage
	 * @throws java.lang.IllegalArgumentException if statName isn't one of the
	 *     five stat names
	 */
	public int getStat(String statName)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Returns the current stage of the given stat, from -6 to +6.
	 *
	 * Must be O(1).
	 *
	 * @param statName one of the five stat names
	 * @return the stat's current stage
	 * @throws java.lang.IllegalArgumentException if statName isn't one of the
	 *     five stat names
	 */
	public int getStage(String statName)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Raises or lowers the stage of the given stat. A stage never goes above +6
	 * or below -6.
	 *
	 * Returns true if the stage changed at all, and false if it was already at
	 * the limit in the direction of the change.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Stage is  0, changeStage("attack", 2)     stage becomes  2, returns true
	 *     Stage is  5, changeStage("attack", 2)     stage becomes  6, returns true
	 *     Stage is  6, changeStage("attack", 1)     stage stays    6, returns false
	 *     Stage is -6, changeStage("speed", -1)     stage stays   -6, returns false
	 *
	 * @param statName one of the five stat names
	 * @param amount how many stages to change the stat by, positive to raise it
	 *     and negative to lower it
	 * @return true if the stage changed
	 * @throws java.lang.IllegalArgumentException if statName isn't one of the
	 *     five stat names
	 */
	public boolean changeStage(String statName, int amount)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Sets the stage of every stat back to 0.
	 *
	 * Must be O(1).
	 */
	public void resetStages()
	{
		// TODO: Implement this method
	}

	/**
	 * Returns this Pokemon's Speed during battle, after its stage and, if it's
	 * paralyzed, after paralysis. This is the Speed used to decide which Pokemon
	 * moves first.
	 *
	 * Must be O(1).
	 *
	 * Example (for a Charizard, whose Speed in pokemon.csv is 131):
	 *
	 *     Stage  0, not paralyzed    returns 131
	 *     Stage  0, paralyzed        returns 65
	 *     Stage +1, paralyzed        returns 98
	 *
	 * @return this Pokemon's Speed in battle
	 */
	public int getBattleSpeed()
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Returns true if this Pokemon has fainted.
	 *
	 * Must be O(1).
	 *
	 * @return true if current HP is 0
	 */
	public boolean isFainted()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Lowers this Pokemon's current HP by the given amount. Current HP never
	 * goes below 0.
	 *
	 * Returns the HP this Pokemon actually lost, which is the damage dealt.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Current HP is 100, takeDamage(40)    HP becomes 60, returns 40
	 *     Current HP is 30,  takeDamage(90)    HP becomes 0,  returns 30
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
	 * Raises this Pokemon's current HP by the given amount. Current HP never
	 * goes above max HP.
	 *
	 * Returns the HP this Pokemon actually gained.
	 *
	 * Must be O(1).
	 *
	 * Example (for a Pokemon with 131 max HP):
	 *
	 *     Current HP is 100, restoreHp(23)    HP becomes 123, returns 23
	 *     Current HP is 120, restoreHp(23)    HP becomes 131, returns 11
	 *
	 * @param amount the amount of HP to restore
	 * @return the HP actually gained
	 * @throws java.lang.IllegalArgumentException if amount is negative
	 */
	public int restoreHp(int amount)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Returns true if at least one of this Pokemon's moves has PP left.
	 *
	 * Must be O(1).
	 *
	 * @return true if any move has PP left, false if every move has 0 PP
	 */
	public boolean hasPpRemaining()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns how effective an attack of the given type is against this Pokemon,
	 * counting all of this Pokemon's types (see Type effectiveness in the Battle
	 * Rules).
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     dragonite.getTypeEffectiveness(ice)       returns 4.0
	 *     venusaur.getTypeEffectiveness(fire)       returns 2.0
	 *     pikachu.getTypeEffectiveness(water)       returns 1.0
	 *     charizard.getTypeEffectiveness(fire)      returns 0.5
	 *     charizard.getTypeEffectiveness(ground)    returns 0.0
	 *
	 * @param attackingType the type of the attack
	 * @return the effectiveness of attackingType against this Pokemon
	 * @throws java.lang.IllegalArgumentException if attackingType is null
	 */
	public double getTypeEffectiveness(Type attackingType)
	{
		return 0.0; // TODO: Implement this method
	}

	/**
	 * Gives this Pokemon a major status, if nothing about this Pokemon prevents
	 * it (see Major status conditions in the Battle Rules). Returns true if this
	 * Pokemon now has the new status, and false if nothing changed.
	 *
	 * When the new status is "sleep", how many turns this Pokemon sleeps is set
	 * separately, with setSleepTurns.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     venusaur.inflictStatus("burn")       Venusaur is burned, returns true
	 *     venusaur.inflictStatus("sleep")      Venusaur is already burned,
	 *                                          returns false
	 *     charizard.inflictStatus("burn")      Charizard is Fire type, returns false
	 *
	 * @param newStatus "burn", "paralyze", "freeze", "sleep", or "poison"
	 * @return true if the status was given
	 * @throws java.lang.IllegalArgumentException if newStatus isn't one of the
	 *     five major statuses
	 */
	public boolean inflictStatus(String newStatus)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Removes this Pokemon's major status, so its status becomes "none".
	 *
	 * Must be O(1).
	 */
	public void cureStatus()
	{
		// TODO: Implement this method
	}

	/**
	 * Returns how many more of its turns this Pokemon will sleep through before
	 * it wakes up.
	 *
	 * Must be O(1).
	 *
	 * @return the number of turns left asleep
	 */
	public int getSleepTurns()
	{
		return sleepTurns;
	}

	/**
	 * Sets how many more of its turns this Pokemon will sleep through before it
	 * wakes up.
	 *
	 * Must be O(1).
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
	 * Confuses this Pokemon for the given number of turns, if it isn't already
	 * confused. Returns true if this Pokemon became confused, and false if it
	 * was already confused.
	 *
	 * Must be O(1).
	 *
	 * @param turns how many of its turns this Pokemon will be confused
	 * @return true if this Pokemon became confused
	 * @throws java.lang.IllegalArgumentException if turns is negative
	 */
	public boolean confuse(int turns)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Ends this Pokemon's confusion.
	 *
	 * Must be O(1).
	 */
	public void cureConfusion()
	{
		// TODO: Implement this method
	}

	/**
	 * Returns true if this Pokemon is confused.
	 *
	 * Must be O(1).
	 *
	 * @return true if this Pokemon is confused
	 */
	public boolean isConfused()
	{
		return confused;
	}

	/**
	 * Returns how many more of its turns this Pokemon will be confused before it
	 * snaps out of it.
	 *
	 * Must be O(1).
	 *
	 * @return the number of turns left confused
	 */
	public int getConfusionTurns()
	{
		return confusionTurns;
	}

	/**
	 * Sets how many more of its turns this Pokemon will be confused before it
	 * snaps out of it.
	 *
	 * Must be O(1).
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
	 * Applies the move's userHpChange to this Pokemon, based on the damage the
	 * move dealt (see Draining and recoil). Does nothing if the move's
	 * userHpChange is 0 or if damageDealt is 0.
	 *
	 * Prints a message if this Pokemon's HP changes.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Giga Drain dealt 45 damage     this Pokemon gains 23 HP
	 *     Double-Edge dealt 90 damage    this Pokemon loses 30 HP
	 *
	 * Example output:
	 *
	 *     Venusaur restored 23 HP!
	 *     Tauros lost 30 HP from recoil!
	 *
	 * @param move the move this Pokemon used
	 * @param damageDealt the HP the opponent actually lost from the move
	 * @throws java.lang.IllegalArgumentException if move is null or damageDealt
	 *     is negative
	 */
	public void applyUserHpChange(Move move, int damageDealt)
	{
		// TODO: Implement this method
	}

	/**
	 * Has this Pokemon struggle, because every one of its moves has 0 PP (see
	 * PP and struggling). It loses 1/4 of its max HP, rounded to the nearest
	 * whole number.
	 *
	 * Prints a message.
	 *
	 * Must be O(1).
	 *
	 * Example output (for a Pokemon with 164 max HP):
	 *
	 *     Charizard has no moves left and struggles! It lost 41 HP.
	 */
	public void struggle()
	{
		// TODO: Implement this method
	}

	/**
	 * Applies this Pokemon's end-of-turn damage from burn or poison (see End of
	 * the turn). Does nothing if this Pokemon has fainted or has neither status.
	 *
	 * Prints a message if this Pokemon loses HP.
	 *
	 * Must be O(1).
	 *
	 * Example output (for a Pokemon with 164 max HP):
	 *
	 *     Charizard is hurt by its burn! It lost 10 HP.
	 *     Charizard is hurt by poison! It lost 20 HP.
	 *
	 * @return the HP this Pokemon lost
	 */
	public int applyEndOfTurnDamage()
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Updates this Pokemon as it switches out of battle. Its stat stages reset
	 * to 0 and it is no longer confused. Its HP, status, sleep turns, and PP
	 * don't change.
	 *
	 * Must be O(1).
	 */
	public void switchOut()
	{
		// TODO: Implement this method
	}

	/**
	 * Returns this Pokemon's name.
	 *
	 * Must be O(1).
	 *
	 * @return the Pokemon's name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns this Pokemon's first type.
	 *
	 * Must be O(1).
	 *
	 * @return the Pokemon's first type
	 */
	public Type getType1()
	{
		return type1;
	}

	/**
	 * Returns this Pokemon's second type, or null if it has only one type.
	 *
	 * Must be O(1).
	 *
	 * @return the Pokemon's second type, or null
	 */
	public Type getType2()
	{
		return type2;
	}

	/**
	 * Returns this Pokemon's max HP.
	 *
	 * Must be O(1).
	 *
	 * @return the Pokemon's max HP
	 */
	public int getMaxHp()
	{
		return maxHp;
	}

	/**
	 * Returns this Pokemon's current HP.
	 *
	 * Must be O(1).
	 *
	 * @return the Pokemon's current HP
	 */
	public int getCurrentHp()
	{
		return currentHp;
	}

	/**
	 * Returns this Pokemon's major status.
	 *
	 * Must be O(1).
	 *
	 * @return "none", "burn", "paralyze", "freeze", "sleep", or "poison"
	 */
	public String getStatus()
	{
		return status;
	}

	/**
	 * Returns one of this Pokemon's four moves.
	 *
	 * Must be O(1).
	 *
	 * @param index the move's position, from 0 to 3
	 * @return the move at that position
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
	 * Returns this Pokemon's name, types, HP, and status. The status is only
	 * shown if it isn't "none".
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Charizard (fire/flying) 164/164 HP
	 *     Venusaur (grass/poison) 46/166 HP [burn]
	 *     Pikachu (electric) 0/121 HP
	 *
	 * @return a one-line description of this Pokemon
	 */
	@Override
	public String toString()
	{
		return null; // TODO: Implement this method
	}
}
