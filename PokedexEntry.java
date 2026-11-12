/**
 * The data from one row of pokemon.csv. A PokedexEntry never changes after it's
 * created, and every Pokemon of that kind is created from it. This file is
 * already completed for you.
 */
public class PokedexEntry
{
	private String name;
	private Type type1;
	private Type type2;
	private int maxHP;

	private int attack;
	private int defense;
	private int spAttack;
	private int spDefense;

	private int speed;

	// A move listed as "none" in pokemon.csv is null here.
	private MoveEntry[] defaultMoves;

	/**
	 * Creates a PokedexEntry from the values in one row of pokemon.csv.
	 *
	 * @param name the Pokemon's name
	 * @param type1 the Pokemon's first type
	 * @param type2 the Pokemon's second type, or null if it has only one type
	 * @param maxHP the Pokemon's max HP
	 * @param attack the Pokemon's Attack
	 * @param defense the Pokemon's Defense
	 * @param spAttack the Pokemon's Special Attack
	 * @param spDefense the Pokemon's Special Defense
	 * @param speed the Pokemon's Speed
	 * @param defaultMoves the Pokemon's four default moves
	 * @throws java.lang.IllegalArgumentException if name, type1, or defaultMoves is
	 *     null, or if defaultMoves doesn't have a length of 4
	 */
	public PokedexEntry(String name, Type type1, Type type2, int maxHP, int attack,
		int defense, int spAttack, int spDefense, int speed, MoveEntry[] defaultMoves)
	{
		if (name == null)
		{
			throw new IllegalArgumentException("name can't be null");
		}
		if (type1 == null)
		{
			throw new IllegalArgumentException("type1 can't be null");
		}
		if (defaultMoves == null)
		{
			throw new IllegalArgumentException("defaultMoves can't be null");
		}
		if (defaultMoves.length != 4)
		{
			throw new IllegalArgumentException("defaultMoves must have a length of 4");
		}

		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.maxHP = maxHP;

		this.attack = attack;
		this.defense = defense;
		this.spAttack = spAttack;
		this.spDefense = spDefense;

		this.speed = speed;
		this.defaultMoves = defaultMoves;
	}

	/**
	 * Returns the Pokemon's name.
	 *
	 * @return the Pokemon's name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Returns the Pokemon's first type.
	 *
	 * @return the Pokemon's first type
	 */
	public Type getType1()
	{
		return type1;
	}

	/**
	 * Returns the Pokemon's second type.
	 *
	 * @return the Pokemon's second type, or null if it has only one type
	 */
	public Type getType2()
	{
		return type2;
	}

	/**
	 * Returns the Pokemon's max HP.
	 *
	 * @return the Pokemon's max HP
	 */
	public int getMaxHP()
	{
		return maxHP;
	}

	/**
	 * Returns the Pokemon's Attack.
	 *
	 * @return the Pokemon's Attack
	 */
	public int getAttack()
	{
		return attack;
	}

	/**
	 * Returns the Pokemon's Defense.
	 *
	 * @return the Pokemon's Defense
	 */
	public int getDefense()
	{
		return defense;
	}

	/**
	 * Returns the Pokemon's Special Attack.
	 *
	 * @return the Pokemon's Special Attack
	 */
	public int getSpAttack()
	{
		return spAttack;
	}

	/**
	 * Returns the Pokemon's Special Defense.
	 *
	 * @return the Pokemon's Special Defense
	 */
	public int getSpDefense()
	{
		return spDefense;
	}

	/**
	 * Returns the Pokemon's Speed.
	 *
	 * @return the Pokemon's Speed
	 */
	public int getSpeed()
	{
		return speed;
	}

	/**
	 * Returns one of the Pokemon's four default moves.
	 *
	 * @param index the move's position, from 0 to 3
	 * @return the move's entry, or null if pokemon.csv lists it as "none"
	 * @throws java.lang.IndexOutOfBoundsException if index is less than 0 or
	 *     more than 3
	 */
	public MoveEntry getDefaultMove(int index)
	{
		if (index < 0 || index >= defaultMoves.length)
		{
			throw new IndexOutOfBoundsException("index must be from 0 to 3");
		}
		return defaultMoves[index];
	}

	/**
	 * Returns this entry in the same format as its row in pokemon.csv.
	 *
	 * @return this entry as one line of pokemon.csv
	 */
	@Override
	public String toString()
	{
		String result = name + "," + type1.getName() + ",";
		if (type2 != null)
		{
			result += type2.getName();
		}
		result += "," + maxHP + "," + attack + "," + defense + "," + spAttack + ","
			+ spDefense + "," + speed;

		for (int i = 0; i < defaultMoves.length; i++)
		{
			if (defaultMoves[i] == null)
			{
				result += ",none";
			}
			else
			{
				result += "," + defaultMoves[i].getName();
			}
		}
		return result;
	}
}
