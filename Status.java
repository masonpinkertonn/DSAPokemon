/**
 * The major status conditions a Pokemon can have. A Pokemon has exactly one of
 * these at a time, and NONE means it has no status. This file is already
 * completed for you.
 */
public enum Status
{
	NONE,

	// Lose HP at the end of every turn
	BURN,
	POISON,

	// Can stop a Pokemon from moving
	PARALYZE,
	FREEZE,
	SLEEP
}
