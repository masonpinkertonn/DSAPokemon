import java.io.FileNotFoundException;

/**
 * Tests every method in the project, and runs a full battle once everything
 * works.
 *
 * Test each method one at a time, in the main method below, before moving on to
 * the next one. Leave your test cases in this file, commented out, when you're
 * done with them.
 *
 * @author [your name here]
 */
public class PokemonTester
{
	/**
	 * Sets up the Pokedex, then runs your test cases.
	 *
	 * @param args not used
	 * @throws java.io.FileNotFoundException if a data file can't be found
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Pokedex.setup();

		// Write your test cases here.

		// When every method has been tested, uncomment these lines to run a
		// full battle.
		// Trainer ash = new Trainer("Ash", 3);
		// Trainer gary = new Trainer("Gary", 3);
		// ash.generateTeam();
		// gary.generateTeam();
		// PokemonBattler.battle(ash, gary);
	}
}
