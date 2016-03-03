package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class JailCell.
 */
public class JailCell extends Cell {
	
	/** The bail. */
	public static int BAIL = 50;
	
	/** The available. */
	private boolean available = true;
	
	/**
	 * Instantiates a new jail cell.
	 */
	public JailCell() {
		setName("Jail");
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	public Boolean playAction(String msg) {
		return available;
		
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
