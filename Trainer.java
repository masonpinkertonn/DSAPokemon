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
	public Trainer(String name, int teamSize)\
	{
		if(teamSize < 1 || teamSize > 6){
			throw new IllegalArgumentException("Team size must be between 1 and 6 inclusive");
		}

		this.name = name;
		this.teamSize = teamSize;
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
		if(BANNED_POKEMON.contains(pokemonName)){
			return true;
		} 

		return false;
	}

	/**
	 * Returns the number of Pokemon on this trainer's team that haven't fainted.
	 *
	 * @return the number of Pokemon that haven't fainted
	 */
	public int getNumRemaining()
	{
		int count = 0;
		for(Pokemon curh : team){
			if(curh.isFainted()){
				count++;
			}
		}
		
		return teamSize - count; 
	}

	/**
	 * Returns true if every Pokemon on this trainer's team has fainted.
	 *
	 * @return true if this trainer has no Pokemon left that can battle
	 */
	public boolean isDefeated()
	{
		if(this.getNumRemaining() == 0){
			return true;
		}

		return false;
	}

	/**
	 * Returns true if this trainer has a benched Pokemon that hasn't fainted.
	 *
	 * @return true if this trainer can switch
	 */
	public boolean canSwitch()
	{
		if(this.getNumRemaining() > 1){
			return true;
		}
		return false; 
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
		ArrayList<Integer> out = new ArrayList<>();

		for(int i = 0; i < teamSize; i++){
			out.add((int)(Math.random()*length)+1);
		}

		return out;
	}

	/**
	 * Fills this trainer's team with teamSize random, distinct Pokemon that are
	 * not banned, and makes the first one active.
	 */
	public void generateTeam()
	{
		ArrayList<Integer> indices = getRandomIndexes(151);

		for(int i = 0; i < teamSize; i++){
			team.set(i, Pokedex.getPokemon(indices.get(i)));
		}

		for(Pokemon mon : team){
			if(mon.isBanned()){
				this.generateTeam();
				break;
			}
		}
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
		if(index > teamSize - 1){
			throw new IndexOutOfBoundsException("Please choose a valid index.");
		}

		if(team.get(index).isFainted()){
			throw new IllegalArgumentException("That pokemon has fainted. Please choose another.");
		}

		team.get(index).switchOut();
		setActiveIndex(index);
		System.out.println(team.get(index).getName() + " I choose you!");

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
		System.out.println(name +"'s team");
		for(Pokemon jit : team){
			System.out.println(jit);
		}
	}
}
