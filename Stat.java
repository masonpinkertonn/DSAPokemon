/**
 * One of a Pokemon's five stats, along with its current stage. Everything except
 * getValue is already completed for you.
 */
public class Stat
{
	// Do not add new instance variables.
	private int base;
	private int stage;

	/**
	 * Creates a Stat with the given value and a stage of 0.
	 *
	 * @param base the stat's value from pokemon.csv
	 */
	public Stat(int base)
	{
		this.base = base;
		stage = 0;
	}

	/**
	 * Returns the stat's value from pokemon.csv, without its stage applied.
	 *
	 * @return the stat's base value
	 */
	public int getBase()
	{
		return base;
	}

	/**
	 * Returns the stat's current stage.
	 *
	 * @return the stat's stage, from -6 to 6
	 */
	public int getStage()
	{
		return stage;
	}

	/**
	 * Raises or lowers the stage, staying between -6 and 6.
	 *
	 * @param amount how many stages to change the stat by
	 * @return true if the stage changed
	 */
	public boolean changeStage(int amount)
	{
		int oldStage = stage;
		stage += amount;

		if (stage > 6)
		{
			stage = 6;
		}
		if (stage < -6)
		{
			stage = -6;
		}

		return stage != oldStage;
	}

	/**
	 * Sets the stage back to 0.
	 */
	public void reset()
	{
		stage = 0;
	}

	/**
	 * Returns the stat's value after its stage is applied, rounded down.
	 *
	 * @return the stat's value in battle
	 */
	public int getValue()
	{
		return 0; // TODO: Implement this method
	}
}
