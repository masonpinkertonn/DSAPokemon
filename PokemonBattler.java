import java.util.Scanner;

/**
 * Handles the battle logic. This class applies the rules in the Battle Rules
 * document to the Pokemon, Moves, and Trainers in a battle.
 *
 * You never create a PokemonBattler object. Every method is called on the class
 * name. A whole battle is run with one call.
 *
 *     PokemonBattler.battle(ash, gary);
 *
 * Every random result in a battle comes from the Dice class.
 *
 * @author [your name here]
 */
public class PokemonBattler
{
	private static Scanner input = new Scanner(System.in);

	/**
	 * No PokemonBattler objects are ever created.
	 */
	private PokemonBattler()
	{
	}

	/**
	 * Decides whether a move hits. Returns true with a percent chance equal to
	 * the move's accuracy. A move with an accuracy of -1 always hits.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     For a move with 90 accuracy, returns true 90% of the time and false
	 *     10% of the time.
	 *
	 * @param move the move being used
	 * @return true if the move hits
	 * @throws java.lang.IllegalArgumentException if move is null
	 */
	public static boolean rollHit(Move move)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Decides whether a move lands a critical hit (see Critical hits). Moves with
	 * a critStage of 0 land a critical hit 1 in 24 times. Moves with a critStage
	 * of 1 land a critical hit 1 in 8 times. Status moves never land a critical
	 * hit.
	 *
	 * Must be O(1).
	 *
	 * @param move the move being used
	 * @return true if the move lands a critical hit
	 * @throws java.lang.IllegalArgumentException if move is null
	 */
	public static boolean rollCritical(Move move)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Decides whether a move's effect happens. Returns true with a percent chance
	 * equal to the move's chance. A move whose effect is "none" always returns
	 * false.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Flamethrower (chance 10) returns true 10% of the time.
	 *     Swords Dance (chance 100) always returns true.
	 *     Tackle (effect "none") always returns false.
	 *
	 * @param move the move being used
	 * @return true if the move's effect happens
	 * @throws java.lang.IllegalArgumentException if move is null
	 */
	public static boolean rollEffect(Move move)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns true if the first Pokemon moves before the second Pokemon this
	 * turn (see How a turn works). If their battle Speeds are exactly equal,
	 * each has a 50% chance to go first.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     first's battle Speed is 131, second's is 76     returns true
	 *     first's battle Speed is 65,  second's is 76     returns false
	 *     both battle Speeds are 100                      returns true half of
	 *                                                      the time
	 *
	 * @param first one of the active Pokemon
	 * @param second the other active Pokemon
	 * @return true if first moves before second
	 * @throws java.lang.IllegalArgumentException if first or second is null
	 */
	public static boolean goesFirst(Pokemon first, Pokemon second)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Calculates the damage a move does, using the formula in the Damage section
	 * of the Battle Rules. Does not change anyone's HP.
	 *
	 * Returns 0 if the move's effectiveness against the defender is 0. Otherwise
	 * returns at least 1.
	 *
	 * Must be O(1).
	 *
	 * Example (Charizard uses Flamethrower on Venusaur, no critical hit):
	 *
	 *     calculateDamage(charizard, flamethrower, venusaur, false, 85)     returns 112
	 *     calculateDamage(charizard, flamethrower, venusaur, false, 100)    returns 132
	 *
	 * @param attacker the Pokemon using the move
	 * @param move the damaging move being used
	 * @param defender the Pokemon being attacked
	 * @param isCritical true if the move landed a critical hit
	 * @param randomPercent the random percent in the damage formula, from 85 to 100
	 * @return the damage the move does
	 * @throws java.lang.IllegalArgumentException if attacker, move, or defender is
	 *     null, if move is a status move, or if randomPercent is less than 85 or
	 *     more than 100
	 */
	public static int calculateDamage(Pokemon attacker, Move move, Pokemon defender,
		boolean isCritical, int randomPercent)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Calculates the damage a confused Pokemon does to itself when it hurts
	 * itself in its confusion (see Confusion). Does not change anyone's HP.
	 *
	 * Must be O(1).
	 *
	 * Example (for a Venusaur with 113 Attack and 114 Defense, both at stage 0):
	 *
	 *     calculateConfusionDamage(venusaur, 85)     returns 16
	 *     calculateConfusionDamage(venusaur, 100)    returns 19
	 *
	 * @param pokemon the confused Pokemon
	 * @param randomPercent the random percent in the damage formula, from 85 to 100
	 * @return the damage the Pokemon does to itself
	 * @throws java.lang.IllegalArgumentException if pokemon is null, or if
	 *     randomPercent is less than 85 or more than 100
	 */
	public static int calculateConfusionDamage(Pokemon pokemon, int randomPercent)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Decides whether a Pokemon can use its move this turn. This is step 1 of
	 * Using a move in the Battle Rules. It covers sleep, freeze, confusion, and
	 * paralysis, in that order, including a confused Pokemon hurting itself.
	 *
	 * Prints a message for anything that happens.
	 *
	 * Must be O(1).
	 *
	 * Example output, one line per possible situation:
	 *
	 *     Venusaur is fast asleep.
	 *     Venusaur woke up!
	 *     Venusaur is frozen solid!
	 *     Venusaur thawed out!
	 *     Venusaur is confused!
	 *     It hurt itself in its confusion! Venusaur lost 18 HP.
	 *     Venusaur snapped out of its confusion!
	 *     Venusaur is paralyzed! It can't move!
	 *
	 * @param pokemon the Pokemon trying to move
	 * @return true if the Pokemon can use its move this turn
	 * @throws java.lang.IllegalArgumentException if pokemon is null
	 */
	public static boolean canMove(Pokemon pokemon)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Rolls for a move's effect and, if it happens, applies it to the attacker
	 * or the defender (see Move effects). An effect on the defender doesn't
	 * happen if the defender has fainted.
	 *
	 * When the effect puts a Pokemon to sleep or confuses it, this method also
	 * decides how many turns it lasts (see Sleep and Confusion).
	 *
	 * Prints a message for anything that happens.
	 *
	 * Must be O(1).
	 *
	 * Example output, one line per possible situation:
	 *
	 *     Venusaur was burned!
	 *     Venusaur was paralyzed!
	 *     Venusaur was frozen solid!
	 *     Venusaur fell asleep!
	 *     Venusaur was poisoned!
	 *     Venusaur became confused!
	 *     Charizard's attack rose by 2 stages!
	 *     Venusaur's spDefense fell by 1 stage!
	 *     Charizard's attack won't go any higher!
	 *     But it failed!
	 *
	 * @param attacker the Pokemon that used the move
	 * @param move the move that was used
	 * @param defender the Pokemon that was targeted
	 * @throws java.lang.IllegalArgumentException if attacker, move, or defender
	 *     is null
	 */
	public static void applyMoveEffect(Pokemon attacker, Move move, Pokemon defender)
	{
		// TODO: Implement this method
	}

	/**
	 * Has the attacker use a move against the defender. This is steps 2 through 7
	 * of Using a move in the Battle Rules. It does not decide whether the
	 * attacker can move (see canMove).
	 *
	 * Thunder Wave never affects Ground-type Pokemon.
	 *
	 * Prints a message for everything that happens.
	 *
	 * Must be O(1).
	 *
	 * Example output (Charizard uses Flamethrower on Venusaur):
	 *
	 *     Charizard used Flamethrower!
	 *     It's super effective!
	 *     Venusaur lost 120 HP.
	 *     Venusaur was burned!
	 *
	 * Example output (Charizard uses Flamethrower and misses):
	 *
	 *     Charizard used Flamethrower!
	 *     Charizard's attack missed!
	 *
	 * @param attacker the Pokemon using the move
	 * @param move the move to use, one of the attacker's four moves
	 * @param defender the Pokemon being targeted
	 * @throws java.lang.IllegalArgumentException if attacker, move, or defender
	 *     is null
	 * @throws java.lang.IllegalStateException if move has 0 PP
	 */
	public static void useMove(Pokemon attacker, Move move, Pokemon defender)
	{
		// TODO: Implement this method
	}

	/**
	 * Asks the trainer what their active Pokemon will do this turn, and keeps
	 * asking until they enter a valid choice. Returns the valid choice.
	 *
	 * The choices are
	 *
	 *     "1" to "4"    use that move (only valid if the move has PP left)
	 *     "5"           switch (only valid if the trainer can switch)
	 *     "6"           struggle (only valid if every move has 0 PP)
	 *
	 * Example interaction:
	 *
	 *     What will Charizard do?
	 *     1. Will-O-Wisp (fire, status) 15/15 PP
	 *     2. Flamethrower (fire, special) 0/15 PP
	 *     3. Hurricane (flying, special) 10/10 PP
	 *     4. Focus Blast (fighting, special) 5/5 PP
	 *     5. Switch
	 *     > 2
	 *     Flamethrower has no PP left.
	 *     > 9
	 *     That isn't a valid choice.
	 *     > 3
	 *
	 * @param trainer the trainer choosing an action
	 * @return "1", "2", "3", "4", "5", or "6"
	 * @throws java.lang.IllegalArgumentException if trainer is null
	 */
	public static String getTurnInput(Trainer trainer)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Asks the trainer which Pokemon to send in, keeps asking until they choose
	 * a benched Pokemon that hasn't fainted, then switches it in. The Pokemon
	 * leaving battle is updated for switching out (see Pokemon's switchOut).
	 *
	 * This is used both when a trainer chooses to switch and when a trainer
	 * must replace a Pokemon that fainted.
	 *
	 * Example interaction:
	 *
	 *     Ash, choose a Pokemon to send in.
	 *     1. Charizard (fire/flying) 52/164 HP [burn]
	 *     2. Pikachu (electric) 0/121 HP
	 *     3. Lapras (water/ice) 216/216 HP
	 *     > 2
	 *     Pikachu has fainted and can't battle.
	 *     > 1
	 *     Charizard is already in battle.
	 *     > 3
	 *     Lapras I choose you!
	 *
	 * @param trainer the trainer who is switching
	 * @throws java.lang.IllegalArgumentException if trainer is null
	 */
	public static void switchPokemon(Trainer trainer)
	{
		// TODO: Implement this method
	}

	/**
	 * Plays one turn of the battle, from both trainers choosing an action
	 * through the end of the turn (see How a turn works).
	 *
	 * If a trainer's last Pokemon faints during the turn, the turn stops right
	 * there.
	 *
	 * @param trainer1 the first trainer
	 * @param trainer2 the second trainer
	 * @throws java.lang.IllegalArgumentException if trainer1 or trainer2 is null
	 */
	public static void playTurn(Trainer trainer1, Trainer trainer2)
	{
		// TODO: Implement this method
	}

	/**
	 * Handles the end of a turn. Applies end-of-turn damage, starting with the
	 * faster active Pokemon, then has each trainer whose active Pokemon fainted
	 * send in a new one (see End of the turn and Fainting and winning).
	 *
	 * @param trainer1 the first trainer
	 * @param trainer2 the second trainer
	 * @throws java.lang.IllegalArgumentException if trainer1 or trainer2 is null
	 */
	public static void endTurn(Trainer trainer1, Trainer trainer2)
	{
		// TODO: Implement this method
	}

	/**
	 * Has the two trainers battle until one of them is defeated, then prints
	 * the winner. Both trainers must already have their teams.
	 *
	 * Example output (the last lines of a battle):
	 *
	 *     Lapras fainted!
	 *     Gary is out of Pokemon!
	 *     Ash wins the battle!
	 *
	 * @param trainer1 the first trainer
	 * @param trainer2 the second trainer
	 * @throws java.lang.IllegalArgumentException if trainer1 or trainer2 is null
	 */
	public static void battle(Trainer trainer1, Trainer trainer2)
	{
		// TODO: Implement this method
	}
}
