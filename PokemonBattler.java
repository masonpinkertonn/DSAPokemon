import java.util.ArrayList;
import java.util.Scanner;

/**
 * Runs the battle. It gets each trainer's choices and carries out every turn by
 * calling methods on the trainers and their Pokemon. All methods are static. No
 * PokemonBattler objects are ever created.
 */
public class PokemonBattler
{
	private static Scanner input = new Scanner(System.in);

	/**
	 * Returns true if the first Pokemon moves before the second this turn.
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
	 * Returns true if either trainer has no Pokemon left that can battle, and
	 * prints who lost and who won.
	 *
	 * @param trainer1 one trainer in the battle
	 * @param trainer2 the other trainer in the battle
	 * @return true if the battle is over
	 * @throws java.lang.IllegalArgumentException if trainer1 or trainer2 is null
	 */
	public static boolean checkBattleOver(Trainer trainer1, Trainer trainer2)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Asks the trainer which Pokemon to send in until they choose one that is on
	 * the bench and hasn't fainted.
	 *
	 * @param trainer the trainer choosing a Pokemon
	 * @return the chosen Pokemon's index in the trainer's team
	 * @throws java.lang.IllegalArgumentException if trainer is null
	 */
	public static int getSwitchIndex(Trainer trainer)
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Asks the trainer what their active Pokemon will do this turn, until they
	 * enter a valid choice.
	 *
	 * @param trainer the trainer choosing an action
	 * @return the trainer's choice
	 * @throws java.lang.IllegalArgumentException if trainer is null
	 */
	public static TurnChoice getTurnChoice(Trainer trainer)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Applies end-of-turn damage, then replaces any active Pokemon that fainted.
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
	 * Plays one turn of the battle.
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
	 * Has the two trainers battle until one of them has no Pokemon left that
	 * can battle. Both trainers must already have their teams.
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
