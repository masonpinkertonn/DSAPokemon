/**
 * One trainer's choice for one turn. Both trainers choose before anything
 * happens, so each choice is stored here and carried out afterward. This file is
 * already completed for you.
 */
public class TurnChoice
{
	private Trainer trainer;
	private Action action;

	// For MOVE, the position of the move (0 to 3).
	// For SWITCH, the position of the teammate to switch to.
	private int index;

	/**
	 * Creates a choice for the given trainer.
	 *
	 * @param trainer the trainer making the choice
	 * @param action what the trainer chose to do
	 * @param index the move's position for MOVE, or the teammate's position for
	 *     SWITCH
	 * @throws java.lang.IllegalArgumentException if trainer or action is null
	 */
	public TurnChoice(Trainer trainer, Action action, int index)
	{
		if (trainer == null)
		{
			throw new IllegalArgumentException("trainer can't be null");
		}
		if (action == null)
		{
			throw new IllegalArgumentException("action can't be null");
		}

		this.trainer = trainer;
		this.action = action;
		this.index = index;
	}

	/**
	 * Returns the trainer who made this choice.
	 *
	 * @return the trainer
	 */
	public Trainer getTrainer()
	{
		return trainer;
	}

	/**
	 * Returns what the trainer chose to do.
	 *
	 * @return MOVE or SWITCH
	 */
	public Action getAction()
	{
		return action;
	}

	/**
	 * Returns the move's position for MOVE, or the teammate's position for
	 * SWITCH.
	 *
	 * @return the index for this choice
	 */
	public int getIndex()
	{
		return index;
	}

	/**
	 * Returns true if this choice is a switch.
	 *
	 * @return true if the action is SWITCH
	 */
	public boolean isSwitch()
	{
		return action == Action.SWITCH;
	}
}
