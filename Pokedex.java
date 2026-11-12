import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Reads the data files and holds every Type, MoveEntry, and PokedexEntry in the
 * project. All methods are static. No Pokedex objects are ever created.
 */
public class Pokedex
{
	private static final String TYPE_CHART_FILE = "Data/typeChart.csv";
	private static final String MOVES_FILE = "Data/moves.csv";
	private static final String POKEMON_FILE = "Data/pokemon.csv";

	// Key is a type's name, such as "fire".
	private static HashMap<String, Type> allTypes = new HashMap<>();

	// Key is a move's name, such as "Flamethrower".
	private static HashMap<String, MoveEntry> allMoves = new HashMap<>();

	// Key is a Pokemon's name, such as "Charmander".
	private static HashMap<String, PokedexEntry> allPokemon = new HashMap<>();

	// Index matches Pokedex number. Index 0 is null.
	private static ArrayList<PokedexEntry> pokedex = new ArrayList<>();

	/**
	 * Reads every data file and creates every Type, MoveEntry, and PokedexEntry.
	 */
	public static void setup()
	{
		// TODO: Implement this method
	}

	/**
	 * Returns the contents of a file, one String per line.
	 *
	 * @param fileName the name of the file to read
	 * @return an ArrayList with one String for each line of the file
	 */
	private static ArrayList<String> readFile(String fileName)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Reads typeChart.csv and fills allTypes with one Type for each type.
	 */
	public static void readTypeChart()
	{
		// TODO: Implement this method
	}

	/**
	 * Reads moves.csv and fills allMoves with one MoveEntry for each move.
	 */
	public static void readMoves()
	{
		// TODO: Implement this method
	}

	/**
	 * Reads pokemon.csv and fills allPokemon and pokedex with one PokedexEntry for
	 * each Pokemon.
	 */
	public static void readPokemon()
	{
		// TODO: Implement this method
	}

	/**
	 * Returns the Type with the given name.
	 *
	 * @param typeName the name of the type, such as "fire"
	 * @return the Type with that name, or null if there isn't one
	 */
	public static Type getType(String typeName) throws FileNotFoundException
	{
		File typeCSV = new File(TYPE_CHART_FILE);
		Scanner typeScanner = new Scanner(typeCSV);

		HashMap<String, Double> effectiveness = new HashMap<>();

		String[] legend = typeScanner.nextLine().split(",");

		ArrayList<String> finalLegend = new ArrayList<>(Arrays.asList(legend));

		int colNum = finalLegend.indexOf(typeName);

		for (int i = 0; i < colNum; i++) {
			typeScanner.nextLine();
		}

		String[] defense = typeScanner.nextLine().split(",");

		for (int i = 0; i < defense.length; i++) {
			effectiveness.put(legend[i], Double.parseDouble(defense[i]));
		}

		return new Type(typeName, effectiveness); // TODO: Implement this method
	}

	/**
	 * Returns the MoveEntry with the given name.
	 *
	 * @param moveName the name of the move, such as "Flamethrower"
	 * @return the MoveEntry with that name, or null if there isn't one
	 */
	public static MoveEntry getMoveEntry(String moveName)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Returns the PokedexEntry with the given Pokedex number.
	 *
	 * @param dexNumber the Pokemon's Pokedex number, from 1 to 151
	 * @return the PokedexEntry with that number
	 * @throws java.lang.IndexOutOfBoundsException if dexNumber is less than 1 or
	 *     more than the number of Pokemon in the Pokedex
	 */
	public static PokedexEntry getPokedexEntryByNumber(int dexNumber)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Returns the PokedexEntry with the given name.
	 *
	 * @param pokemonName the Pokemon's name, such as "Charmander"
	 * @return the PokedexEntry with that name, or null if there isn't one
	 */
	public static PokedexEntry getPokedexEntryByName(String pokemonName)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Returns a new Pokemon object with the given Pokedex number.
	 *
	 * @param dexNumber the Pokemon's Pokedex number, from 1 to 151
	 * @return a newly created Pokemon object
	 * @throws java.lang.IndexOutOfBoundsException if dexNumber is less than 1 or
	 *     more than the number of Pokemon in the Pokedex
	 */
	public static Pokemon getPokemon(int dexNumber)
	{
		return null; // TODO: Implement this method
	}

	/**
	 * Returns the number of Pokemon in the Pokedex.
	 *
	 * @return the number of Pokemon in the Pokedex
	 */
	public static int getNumPokemon()
	{
		return 0; // TODO: Implement this method
	}
}
