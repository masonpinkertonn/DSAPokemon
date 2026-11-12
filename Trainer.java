import java.util.ArrayList;
import java.util.Arrays;

/**
 * A trainer with a team of Pokemon, one of which is active at a time. Getters
 * and setters are already completed for you.
 */
public class Trainer
{
	// Pokemon that can never be put on a random team.
	public static final ArrayList<String> BANNED_POKEMON = new ArrayList<>(
		Arrays.asList("Caterpie", "Metapod", "Weedle", "Kakuna", "Magikarp", "Ditto"));

	// Do not add new instance variables.
	private String name;
	private int teamSize;
	private ArrayList<Pokemon> team;
	private int activeIndex;

	/**
	 * Creates a trainer with the given name and an empty team.
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
	 * Returns this trainer's name.
	 *
	 * @return the trainer's name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns this trainer's team.
	 *
	 * @return the list of Pokemon on the team
	 */
	public ArrayList<Pokemon> getTeam()
	{
		return team;
	}

	/**
	 * Returns the position of the active Pokemon on the team.
	 *
	 * @return the active Pokemon's index in team
	 */
	public int getActiveIndex()
	{
		return activeIndex;
	}

	/**
	 * Returns this trainer's active Pokemon.
	 *
	 * @return the active Pokemon
	 */
	public Pokemon getActivePokemon()
	{
		return team.get(activeIndex);
	}

	/**
	 * Makes the Pokemon at the given position on the team the active Pokemon.
	 *
	 * @param index the new active Pokemon's index in team
	 * @throws java.lang.IndexOutOfBoundsException if index is outside the team
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
	 * Returns true if the Pokemon with the given name is on the banned list.
	 *
	 * @param pokemonName the name of a Pokemon
	 * @return true if that Pokemon is banned
	 */
	public static boolean isBanned(String pokemonName)
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns the number of Pokemon on this trainer's team that haven't fainted.
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
	 * @return true if this trainer has no Pokemon left that can battle
	 */
	public boolean isDefeated()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns true if this trainer has a benched Pokemon that hasn't fainted.
	 *
	 * @return true if this trainer can switch
	 */
	public boolean canSwitch()
	{
		return false; // TODO: Implement this method
	}

	/**
	 * Returns teamSize random, distinct whole numbers from 1 to length.
	 *
	 * @param length the largest number that can be in the list
	 * @return a list of teamSize distinct random numbers
	 * @throws java.lang.IllegalArgumentException if length is less than teamSize
	 */
	public ArrayList<Integer> getRandomIndexes(int length)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Fills this trainer's team with teamSize random, distinct Pokemon that are
	 * not banned, and makes the first one active.
	 */
	public void generateTeam()
	{
		// TODO: Implement this method
	}

	/**
	 * Switches the active Pokemon out of battle and sends in the Pokemon at the
	 * given position, printing a message.
	 *
	 * @param index the new active Pokemon's index in team
	 * @throws java.lang.IndexOutOfBoundsException if index is outside the team
	 * @throws java.lang.IllegalArgumentException if the Pokemon at index has
	 *     fainted
	 */
	public void switchTo(int index)
	{
		// TODO: Implement this method
	}

	/**
	 * Returns the trainer's name followed by every Pokemon on the team, one per
	 * line.
	 *
	 * @return the trainer's name and team
	 */
	@Override
	public String toString()
	{
		return null; // TODO: Implement this method
	}
}
