package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class FreeParkingCell.
 */
public class FreeParkingCell extends Cell {

	/** The available. */
	private boolean available = true;

	/**
	 * Instantiates a new free parking cell.
	 */
	public FreeParkingCell() {
		setName("Free Parking");
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	public Boolean playAction(String msg) {
		return available;
	}

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
