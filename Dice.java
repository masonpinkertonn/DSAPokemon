import java.util.Random;

/**
 * Random numbers for the whole project.
 *
 * This class is already completed for you. Don't change it.
 *
 * You never create a Dice object. Every method is called on the class name.
 *
 *     int roll = Dice.roll(1, 6);
 *
 * @author Mr. Bryant
 */
public class Dice
{
	private static Random random = new Random();

	/**
	 * No Dice objects are ever created.
	 */
	private Dice()
	{
	}

	/**
	 * Returns a random whole number from min to max, including both min and max.
	 * Every number in that range is equally likely.
	 *
	 * Runs in O(1).
	 *
	 * Example:
	 *
	 *     Dice.roll(1, 6)       returns one of 1, 2, 3, 4, 5, 6
	 *     Dice.roll(85, 100)    returns one of 85, 86, ..., 99, 100
	 *     Dice.roll(4, 4)       returns 4
	 *
	 * @param min the smallest number that can be returned
	 * @param max the largest number that can be returned
	 * @return a random whole number from min to max
	 * @throws java.lang.IllegalArgumentException if min is more than max
	 */
	public static int roll(int min, int max)
	{
		if (min > max)
		{
			throw new IllegalArgumentException("min can't be more than max");
		}
		return random.nextInt(max - min + 1) + min;
	}

	/**
	 * Makes every roll after this call come out in the same order each time the
	 * program runs with the same seed. This is useful for testing, since it
	 * makes random results repeatable.
	 *
	 * Runs in O(1).
	 *
	 * Example:
	 *
	 *     Dice.setSeed(42);
	 *     Dice.roll(1, 100);    returns the same number every time you run
	 *                           the program
	 *
	 * @param seed any whole number. The same seed always gives the same rolls
	 */
	public static void setSeed(long seed)
	{
		random = new Random(seed);
	}
}
