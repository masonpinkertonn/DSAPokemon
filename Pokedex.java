import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Holds all of the data in the project and is the only class that reads files.
 *
 * Pokedex.setup() reads typeChart.csv, moves.csv, and pokemon.csv once, at the
 * start of the program, and creates every Type, Move, and Pokemon from them.
 * After that, the rest of the project gets those objects from the Pokedex
 * through its accessor methods.
 *
 * You never create a Pokedex object. Every method is called on the class name,
 * the same way you call Math.max.
 *
 *     Pokedex.setup();
 *     Pokemon charizard = Pokedex.getPokemon(6);
 *
 * @author [your name here]
 */
public class Pokedex
{
	private static final String TYPE_CHART_FILE = "typeChart.csv";
	private static final String MOVES_FILE = "moves.csv";
	private static final String POKEMON_FILE = "pokemon.csv";

	// Key is a type's name, such as "fire". Value is the Type with that name.
	private static HashMap<String, Type> allTypes = new HashMap<>();

	// Key is a move's name, exactly as it appears in moves.csv, such as
	// "Flamethrower". Value is the Move with that name.
	private static HashMap<String, Move> allMoves = new HashMap<>();

	// Index 0 is null. Every other index is a Pokemon's Pokedex number, so
	// index 1 is Bulbasaur, index 6 is Charizard, and index 151 is Mew.
	private static ArrayList<Pokemon> allPokemon = new ArrayList<>();

	Scanner moves = new Scanner(MOVES_FILE);
	Scanner typeChart = new Scanner(TYPE_CHART_FILE);
	Scanner pokemons = new Scanner(POKEMON_FILE);

	/**
	 * No Pokedex objects are ever created.
	 */
	private Pokedex()
	{
	}

	/**
	 * Reads every data file and creates every Type, Move, and Pokemon in the
	 * project. Must be called once, before anything else uses the Pokedex.
	 *
	 * Must be O(t^2 + m + p), where t is the number of types, m is the number of
	 * moves, and p is the number of Pokemon.
	 *
	 * @throws java.io.FileNotFoundException if a data file can't be found
	 */
	public static void setup() throws FileNotFoundException
	{
		// TODO: Implement this method
	}

	/**
	 * Reads typeChart.csv and fills allTypes with one Type for each type.
	 *
	 * The first line of typeChart.csv lists every type. Each line after that is
	 * one row of the type chart. The attacking type is the row and the defending
	 * type is the column, both in the same order as the types on the first line.
	 * Each Type's HashMap holds its own row (see the Type class).
	 *
	 * Must be O(t^2), where t is the number of types.
	 *
	 * Example (after this method runs):
	 *
	 *     allTypes holds 18 Types
	 *     allTypes.get("fire").getEffectiveness(allTypes.get("grass"))    is 2.0
	 *
	 * @throws java.io.FileNotFoundException if typeChart.csv can't be found
	 */
	public static void readTypeChart() throws FileNotFoundException
	{
		// TODO: Implement this method
	}

	/**
	 * Reads moves.csv and fills allMoves with one Move for each line after the
	 * header line. Each Move's type is the Type object from allTypes.
	 *
	 * The types must already be read.
	 *
	 * Must be O(m), where m is the number of moves.
	 *
	 * @throws java.io.FileNotFoundException if moves.csv can't be found
	 */
	public static void readMoves() throws FileNotFoundException
	{
		// TODO: Implement this method


	}

	/**
	 * Reads pokemon.csv and fills allPokemon with one Pokemon for each line after
	 * the header line, so that each Pokemon's index matches its Pokedex number.
	 * Index 0 holds null. Each Pokemon's types are Type objects from allTypes,
	 * and its moves are Move objects from allMoves.
	 *
	 * A few Pokemon on the banned list have "none" for some of their moves in
	 * pokemon.csv. Those moves are null.
	 *
	 * The types and moves must already be read.
	 *
	 * Must be O(p), where p is the number of Pokemon.
	 *
	 * Example (after this method runs):
	 *
	 *     allPokemon.size()              is 152
	 *     allPokemon.get(0)              is null
	 *     allPokemon.get(6).getName()    is "Charizard"
	 *
	 * @throws java.io.FileNotFoundException if pokemon.csv can't be found
	 */
	public static void readPokemon() throws FileNotFoundException
	{
		// TODO: Implement this method
	}

	/**
	 * Returns the Type with the given name, or null if there is no type with
	 * that name.
	 *
	 * Every caller gets the same Type object. That's safe because a Type never
	 * changes after it's created.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Pokedex.getType("fire")     returns the fire Type
	 *     Pokedex.getType("Fire")     returns null
	 *     Pokedex.getType("sound")    returns null
	 *
	 * @param typeName the name of the type, such as "fire"
	 * @return the Type with that name, or null if there isn't one
	 */
	public static Type getType(String typeName)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Returns a new copy of the move with the given name, or null if there is no
	 * move with that name.
	 *
	 * Every call returns a different Move object. Here's why that matters. A
	 * Move keeps track of its own PP, so it knows how many times it has been
	 * used and whether it has any uses left. If two Pokemon shared the same
	 * Flamethrower object, then every time one of them used Flamethrower, the
	 * other one's Flamethrower would lose PP too, even if that Pokemon had
	 * never used it.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Pokedex.getMove("Flamethrower")    returns a new Flamethrower with 15 PP
	 *     Pokedex.getMove("flamethrower")    returns null
	 *     Pokedex.getMove("none")            returns null
	 *
	 * @param moveName the name of the move, exactly as it appears in moves.csv
	 * @return a new copy of that move, or null if there isn't one
	 */
	public static Move getMove(String moveName)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Returns a new copy of the Pokemon with the given Pokedex number, with full
	 * HP, no status, and full PP on every move.
	 *
	 * Every call returns a different Pokemon object, for the same reason as
	 * getMove. If both trainers got the same Pikachu object, then whenever one
	 * trainer's Pikachu lost HP, the other trainer's Pikachu would lose HP too.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Pokedex.getPokemon(1)      returns a new Bulbasaur
	 *     Pokedex.getPokemon(6)      returns a new Charizard
	 *     Pokedex.getPokemon(151)    returns a new Mew
	 *
	 * @param dexNumber the Pokemon's Pokedex number, from 1 to 151
	 * @return a new copy of that Pokemon
	 * @throws java.lang.IndexOutOfBoundsException if dexNumber is less than 1 or
	 *     more than the number of Pokemon in the Pokedex
	 */
	public static Pokemon getPokemon(int dexNumber)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Returns how many Pokemon are in the Pokedex. Index 0 of allPokemon is not
	 * a Pokemon, so it isn't counted.
	 *
	 * Must be O(1).
	 *
	 * Example:
	 *
	 *     Pokedex.getNumPokemon()    returns 151
	 *
	 * @return the number of Pokemon in the Pokedex
	 */
	public static int getNumPokemon()
	{
		return 0; // TODO: Implement this method
	}
}
