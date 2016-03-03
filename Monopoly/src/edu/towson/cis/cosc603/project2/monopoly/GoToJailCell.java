package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class GoToJailCell.
 */
public class GoToJailCell extends Cell {
	
	/** The available. */
	private boolean available = true;

	/**
	 * Instantiates a new go to jail cell.
	 */
	public GoToJailCell() {
		setName("Go to Jail");
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction()
	 */
	public Boolean playAction(String msg) {
		Player currentPlayer = GameMaster.instance().getCurrentPlayer();
		GameMaster.instance().getGameBoard().queryCell("Jail");
		GameMaster.instance().sendToJail(currentPlayer);
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
