/**
 * Tests the project one milestone at a time, and plays a full battle once
 * everything works.
 *
 * Each milestone in the Build Guide has its own test method below. When a
 * milestone's tests pass, comment out its call in main so its output doesn't
 * get in the way of the next milestone's.
 */
public class PokemonTester
{
	/**
	 * Sets up the Pokedex, then runs the tests for each milestone.
	 *
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		Pokedex.setup();

		testTypeChart();
		testMoveEntries();
		testPokedexEntries();
		testMoveRolls();

		testStats();
		testNewPokemon();
		testPokemonBasics();
		testStatus();

		testDamage();
		testHPChanges();
		testUsingMoves();
		testTrainer();

		testBattler();

		// When every milestone's tests pass, uncomment this line to play a
		// battle.
		// runBattle();
	}

	/**
	 * Tests the methods from Milestone 1 of the Build Guide.
	 */
	private static void testTypeChart()
	{
		// Paste the Milestone 1 tests from the Build Guide here.
		Type fire = Pokedex.getType("fire");
		Type water = Pokedex.getType("water");
		Type grass = Pokedex.getType("grass");

		System.out.println(fire.getName() + " (fire)");
		System.out.println(fire.getEffectiveness(grass) + " (2.0)");
		System.out.println(fire.getEffectiveness(water) + " (0.5)");
		System.out.println(water.getEffectiveness(fire) + " (2.0)");

		System.out.println(grass.getEffectiveness(grass) + " (0.5)");

		// The first and last types in the chart
		Type normal = Pokedex.getType("normal");
		Type ghost = Pokedex.getType("ghost");
		Type dragon = Pokedex.getType("dragon");
		Type fairy = Pokedex.getType("fairy");

		System.out.println(normal.getEffectiveness(normal) + " (1.0)");
		System.out.println(normal.getEffectiveness(ghost) + " (0.0)");
		System.out.println(dragon.getEffectiveness(fairy) + " (0.0)");
		System.out.println(fairy.getEffectiveness(dragon) + " (2.0)");

		// toString
		System.out.println(fire);
		System.out.println("(fire type\n-----\nSuper effective against: steel, ice, bug, grass\n"
			+ "Not very effective against: dragon, water, rock, fire\nImmune to fire: (none))");
		System.out.println(normal);

		System.out.println("(normal type\n-----\nSuper effective against: (none)\n"
			+ "Not very effective against: steel, rock\nImmune to normal: ghost)");

		// Names that aren't in the type chart
		System.out.println(Pokedex.getType("shadow") + " (null)");
		System.out.println(Pokedex.getType("Fire") + " (null)");

		// A Type with no name
		try
		{
			new Type(null, null);
			System.out.println("no exception (IllegalArgumentException)");
		}
		catch (IllegalArgumentException exception)
		{
			System.out.println("IllegalArgumentException (IllegalArgumentException)");
		}
	}

	/**
	 * Tests the methods from Milestone 2 of the Build Guide.
	 */
	private static void testMoveEntries()
	{
		// Paste the Milestone 2 tests from the Build Guide here.
	}

	/**
	 * Tests the methods from Milestone 3 of the Build Guide.
	 */
	private static void testPokedexEntries()
	{
		// Paste the Milestone 3 tests from the Build Guide here.
	}

	/**
	 * Tests the methods from Milestone 4 of the Build Guide.
	 */
	private static void testMoveRolls()
	{
		// Paste the Milestone 4 tests from the Build Guide here, then write
		// tests for the scenarios under "Also test these."
	}

	/**
	 * Tests the methods from Milestone 5 of the Build Guide.
	 */
	private static void testStats()
	{
		// Paste the Milestone 5 tests from the Build Guide here, then write
		// tests for the scenarios under "Also test these."
	}

	/**
	 * Tests the methods from Milestone 6 of the Build Guide.
	 */
	private static void testNewPokemon()
	{
		// Paste the Milestone 6 tests from the Build Guide here, then write
		// tests for the scenarios under "Also test these."
	}

	/**
	 * Tests the methods from Milestone 7 of the Build Guide.
	 */
	private static void testPokemonBasics()
	{
		// Paste the Milestone 7 tests from the Build Guide here, then write
		// tests for the scenarios under "Also test these."
	}

	/**
	 * Tests the methods from Milestone 8 of the Build Guide.
	 */
	private static void testStatus()
	{
		// Paste the Milestone 8 tests from the Build Guide here, then write
		// tests for the scenarios under "Also test these."
	}

	/**
	 * Tests the methods from Milestone 9 of the Build Guide.
	 */
	private static void testDamage()
	{
		// Write your Milestone 9 tests here.
	}

	/**
	 * Tests the methods from Milestone 10 of the Build Guide.
	 */
	private static void testHPChanges()
	{
		// Write your Milestone 10 tests here.
	}

	/**
	 * Tests the methods from Milestone 11 of the Build Guide.
	 */
	private static void testUsingMoves()
	{
		// Write your Milestone 11 tests here.
	}

	/**
	 * Tests the methods from Milestone 12 of the Build Guide.
	 */
	private static void testTrainer()
	{
		// Write your Milestone 12 tests here.
	}

	/**
	 * Tests the methods from Milestone 13 of the Build Guide.
	 */
	private static void testBattler()
	{
		// Write your Milestone 13 tests here.
	}

	/**
	 * Plays a full battle between two trainers with random teams.
	 */
	private static void runBattle()
	{
		Trainer ash = new Trainer("Ash", 3);
		Trainer gary = new Trainer("Gary", 3);
		ash.generateTeam();
		gary.generateTeam();

		PokemonBattler.battle(ash, gary);
	}
}
