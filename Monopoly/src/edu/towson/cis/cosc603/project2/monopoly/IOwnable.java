package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOwnable.
 */
public interface IOwnable {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * Gets the the owner.
	 *
	 * @return the the owner
	 */
	public abstract Player getTheOwner();

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public abstract int getPrice();

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public abstract boolean isAvailable();

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public abstract void setAvailable(boolean available);

	/**
	 * Sets the the owner.
	 *
	 * @param owner the new the owner
	 */
	public abstract void setTheOwner(Player owner);

	public abstract void playerMoved(Player player, int playerIndex,
			GameMaster gameMaster);

}