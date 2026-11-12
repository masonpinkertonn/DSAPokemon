import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
	public static HashMap<String, Type> allTypes = new HashMap<>();

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
		// The order matters. Moves need their types, and Pokemon need their
		// types and moves.
		readTypeChart();
		readMoves();
		readPokemon();
	}

	/**
	 * Returns the contents of a file, one String per line.
	 *
	 * @param fileName the name of the file to read
	 * @return an ArrayList with one String for each line of the file
	 */
	private static ArrayList<String> readFile(String fileName)
	{
		ArrayList<String> lines = new ArrayList<>();
		try
		{
			File file = new File(fileName);
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine())
			{
				lines.add(fileScanner.nextLine());
			}
			fileScanner.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Could not find file: " + fileName);
		}
		return lines;
	}

	/**
	 * Reads typeChart.csv and fills allTypes with one Type for each type.
	 */
	public static void readTypeChart()
	{
		ArrayList<String> lines = readFile(TYPE_CHART_FILE);
		String[] typeNames = lines.get(0).split(",");

		// Line row + 1 of the file is the row for typeNames[row]. Its columns are
		// the defending types, in the same order as typeNames.
		for (int row = 0; row < typeNames.length; row++)
		{
			String[] values = lines.get(row + 1).split(",");
			HashMap<String, Double> effectivenessMap = new HashMap<>();

			for (int col = 0; col < values.length; col++)
			{
				double multiplier = Double.parseDouble(values[col]);
				effectivenessMap.put(typeNames[col], multiplier);
			}

			allTypes.put(typeNames[row], new Type(typeNames[row], effectivenessMap));
		}
	}

	/**
	 * Reads moves.csv and fills allMoves with one MoveEntry for each move.
	 */
	public static void readMoves()
	{
		ArrayList<String> lines = readFile(MOVES_FILE);

		// Line 0 is the header
		for (int i = 1; i < lines.size(); i++)
		{
			String[] values = lines.get(i).split(",");

			// The columns are in the same order as the MoveEntry constructor
			Type type = getType(values[1]);
			Category category = Category.valueOf(values[2].toUpperCase());
			MoveEntry entry = new MoveEntry(values[0], type, category,
				Integer.parseInt(values[3]), Integer.parseInt(values[4]),
				Integer.parseInt(values[5]), Integer.parseInt(values[6]),
				Integer.parseInt(values[7]), Integer.parseInt(values[8]), values[9],
				values[10], Integer.parseInt(values[11]), Integer.parseInt(values[12]));

			allMoves.put(entry.getName(), entry);
		}
	}

	/**
	 * Reads pokemon.csv and fills allPokemon and pokedex with one PokedexEntry for
	 * each Pokemon.
	 */
	public static void readPokemon()
	{
		ArrayList<String> lines = readFile(POKEMON_FILE);

		// Start over, so calling this twice doesn't add every Pokemon again.
		// Index 0 is null, so each index matches its Pokedex number.
		allPokemon = new HashMap<>();
		pokedex = new ArrayList<>();
		pokedex.add(null);

		// Line 0 is the header, so line i is Pokedex number i
		for (int i = 1; i < lines.size(); i++)
		{
			String[] values = lines.get(i).split(",");

			// A single-type Pokemon has an empty type2 column
			Type type2 = null;
			if (!values[2].isEmpty())
			{
				type2 = getType(values[2]);
			}

			// A move listed as "none" isn't in allMoves, so it stays null
			MoveEntry[] defaultMoves = new MoveEntry[4];
			for (int m = 0; m < defaultMoves.length; m++)
			{
				defaultMoves[m] = getMoveEntry(values[9 + m]);
			}

			PokedexEntry entry = new PokedexEntry(values[0], getType(values[1]), type2,
				Integer.parseInt(values[3]), Integer.parseInt(values[4]),
				Integer.parseInt(values[5]), Integer.parseInt(values[6]),
				Integer.parseInt(values[7]), Integer.parseInt(values[8]), defaultMoves);

			allPokemon.put(entry.getName(), entry);
			pokedex.add(entry);
		}
	}

	/**
	 * Returns the Type with the given name.
	 *
	 * @param typeName the name of the type, such as "fire"
	 * @return the Type with that name, or null if there isn't one
	 */
	public static Type getType(String typeName)
	{
		if (allTypes.containsKey(typeName))
		{
			return allTypes.get(typeName);
		}
		return null;
	}

	/**
	 * Returns the MoveEntry with the given name.
	 *
	 * @param moveName the name of the move, such as "Flamethrower"
	 * @return the MoveEntry with that name, or null if there isn't one
	 */
	public static MoveEntry getMoveEntry(String moveName)
	{
		// A MoveEntry never changes, so it's safe for everyone to share it
		if (allMoves.containsKey(moveName))
		{
			return allMoves.get(moveName);
		}
		return null;
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
		if (dexNumber < 1 || dexNumber > getNumPokemon())
		{
			throw new IndexOutOfBoundsException("No Pokemon with number " + dexNumber);
		}
		return pokedex.get(dexNumber);
	}

	/**
	 * Returns the PokedexEntry with the given name.
	 *
	 * @param pokemonName the Pokemon's name, such as "Charmander"
	 * @return the PokedexEntry with that name, or null if there isn't one
	 */
	public static PokedexEntry getPokedexEntryByName(String pokemonName)
	{
		if (allPokemon.containsKey(pokemonName))
		{
			return allPokemon.get(pokemonName);
		}
		return null;
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
		// Every call makes a new Pokemon, so two trainers never share one
		return new Pokemon(getPokedexEntryByNumber(dexNumber));
	}

	/**
	 * Returns the number of Pokemon in the Pokedex.
	 *
	 * @return the number of Pokemon in the Pokedex
	 */
	public static int getNumPokemon()
	{
		// Index 0 is null, not a Pokemon
		return pokedex.size() - 1;
	}
}
