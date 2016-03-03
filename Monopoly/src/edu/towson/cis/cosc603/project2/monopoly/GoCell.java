package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class GoCell.
 */
public class GoCell extends Cell {
	
	/** The available. */
	private boolean available = true;

	/**
	 * Instantiates a new go cell.
	 */
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	public Boolean playAction(String msg) {
		return available;
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#setName(java.lang.String)
	 */
	void setName(String name) {
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.Cell#isAvailable()
	 */
	public boolean isAvailable() {
		return available;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.Cell#setAvailable(boolean)
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
