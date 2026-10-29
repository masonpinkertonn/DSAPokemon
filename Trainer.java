import java.util.ArrayList;
import java.util.Arrays;

/**
 * A trainer with a team of Pokemon.
 *
 * In the base project, every trainer gets a random team of Pokemon from the
 * Pokedex. One Pokemon on the team is active at a time. The rest are on the
 * bench.
 *
 * Getters and setters are already completed for you.
 *
 * @author [your name here]
 */
public class Trainer
{
	// Pokemon that can never be put on a random team. Every trainer shares
	// this one list.
	public static final ArrayList<String> BANNED_POKEMON = new ArrayList<>(
		Arrays.asList("Caterpie", "Metapod", "Weedle", "Kakuna", "Magikarp", "Ditto"));

	// Do not add new instance variables.
	private String name;
	private int teamSize;
	private ArrayList<Pokemon> team;
	private int activeIndex;

	/**
	 * Creates a trainer with the given name and an empty team. The team is
	 * filled later by generateTeam().
	 *
	 * Must be O(1).
	 *
	 * @param name the trainer's name
	 * @param teamSize how many Pokemon the trainer's team will have, from 1 to 6
	 * @throws java.lang.IllegalArgumentException if name is null or teamSize is
	 *     less than 1 or more than 6
	 */
	public Trainer(String name, int teamSize)
	{
		// TODO: Implement this method
	}

	/**
	 * Returns true if the Pokemon with the given name is on the banned list.
	 *
	 * Must be O(b), where b is the number of banned Pokemon.
	 *
	 * Example:
	 *
	 *     Trainer.isBanned("Magikarp")     returns true
	 *     Trainer.isBanned("Gyarados")     returns false
	 *
	 * @param pokemonName the name of a Pokemon, exactly as it appears in pokemon.csv
	 * @return true if that Pokemon is banned
	 */
	public static boolean isBanned(String pokemonName)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns an ArrayList of teamSize random, distinct whole numbers, each from
	 * 1 to length, including both 1 and length. No number appears more than once.
	 *
	 * Must be O(n), where n is length.
	 *
	 * Example (for a trainer with a teamSize of 3):
	 *
	 *     getRandomIndexes(151)    might return [42, 7, 133]
	 *     getRandomIndexes(3)      returns 1, 2, and 3 in some order
	 *
	 * @param length the largest number that can be in the list
	 * @return a list of teamSize distinct random numbers from 1 to length
	 * @throws java.lang.IllegalArgumentException if length is less than teamSize
	 */
	public ArrayList<Integer> getRandomIndexes(int length)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Fills this trainer's team with teamSize random Pokemon from the Pokedex.
	 * No Pokemon appears on the team more than once, and no Pokemon on the team
	 * is on the banned list. The first Pokemon on the team becomes the active
	 * Pokemon.
	 *
	 * Pokedex.setup() must be called before this method.
	 *
	 * Must be O(n), where n is the number of Pokemon in the Pokedex.
	 */
	public void generateTeam()
	{
		// TODO: Implement this method
	}

	/**
	 * Returns the number of Pokemon on this trainer's team that haven't fainted.
	 *
	 * Must be O(k), where k is teamSize.
	 *
	 * @return the number of Pokemon that haven't fainted
	 */
	public int getNumRemaining()
	{
		return 0; // TODO: Implement this method
	}

	/**
	 * Returns true if every Pokemon on this trainer's team has fainted.
	 *
	 * Must be O(k), where k is teamSize.
	 *
	 * @return true if this trainer has no Pokemon left that can battle
	 */
	public boolean isDefeated()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns true if this trainer has a Pokemon on the bench that hasn't
	 * fainted, which means the trainer is able to switch.
	 *
	 * Must be O(k), where k is teamSize.
	 *
	 * @return true if this trainer can switch
	 */
	public boolean canSwitch()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns this trainer's active Pokemon.
	 *
	 * Must be O(1).
	 *
	 * @return the active Pokemon
	 */
	public Pokemon getActivePokemon()
	{
		return team.get(activeIndex);
	}

	/**
	 * Returns the position of the active Pokemon on the team.
	 *
	 * Must be O(1).
	 *
	 * @return the active Pokemon's index in team
	 */
	public int getActiveIndex()
	{
		return activeIndex;
	}

	/**
	 * Makes the Pokemon at the given position on the team the active Pokemon.
	 *
	 * Must be O(1).
	 *
	 * @param index the new active Pokemon's index in team
	 * @throws java.lang.IndexOutOfBoundsException if index is less than 0 or is
	 *     not less than the size of the team
	 * @throws java.lang.IllegalArgumentException if the Pokemon at index has
	 *     fainted
	 */
	public void setActiveIndex(int index)
	{
		if (index < 0 || index >= team.size())
		{
			throw new IndexOutOfBoundsException("index is outside the team");
		}
		if (team.get(index).isFainted())
		{
			throw new IllegalArgumentException("can't switch to a fainted Pokemon");
		}
		activeIndex = index;
	}

	/**
	 * Returns this trainer's team.
	 *
	 * Must be O(1).
	 *
	 * @return the list of Pokemon on the team
	 */
	public ArrayList<Pokemon> getTeam()
	{
		return team;
	}

	/**
	 * Returns this trainer's name.
	 *
	 * Must be O(1).
	 *
	 * @return the trainer's name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns the trainer's name followed by every Pokemon on the team, one per
	 * line, in team order. Each Pokemon's line is that Pokemon's toString().
	 *
	 * Must be O(k), where k is teamSize.
	 *
	 * Example (for a trainer named William with two Pokemon):
	 *
	 *     William's team
	 *     Charizard (fire/flying) 164/164 HP
	 *     Pikachu (electric) 0/121 HP
	 *
	 * @return the trainer's name and team
	 */
	@Override
	public String toString()
	{
		return null; // TODO: Implement this method
	}
}
