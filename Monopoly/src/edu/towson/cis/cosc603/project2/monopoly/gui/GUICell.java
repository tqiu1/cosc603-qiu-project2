package edu.towson.cis.cosc603.project2.monopoly.gui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import edu.towson.cis.cosc603.project2.monopoly.*;

// TODO: Auto-generated Javadoc
/**
 * The Class GUICell.
 */
public class GUICell extends JPanel {

	
	private GUICellProduct gUICellProduct = new GUICellProduct();

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The lbl players. */
	private JLabel[] lblPlayers = new JLabel[GameMaster.MAX_PLAYER];
	
    /**
     * Instantiates a new GUI cell.
     *
     * @param cell the cell
     */
    public GUICell(IOwnable cell) {
        gUICellProduct.setCell(cell);
        setLayout(new OverlayLayout(this));
        setBorder(new BevelBorder(BevelBorder.LOWERED));
        JPanel pnlPlayer = new JPanel();
        pnlPlayer.setLayout(new GridLayout(2, 4));
        pnlPlayer.setOpaque(false);
        createPlayerLabels(pnlPlayer);
        add(pnlPlayer);
        setPreferredSize(new Dimension(100,100));
        gUICellProduct.addCellInfo(this);
        this.doLayout();
	}
	
	/**
	 * Adds the player.
	 *
	 * @param index the index
	 */
	public void addPlayer(int index) {
		Player player = GameMaster.instance().getPlayer(index);
		lblPlayers[index].setText(player.getName().substring(0, 1));
		lblPlayers[index].setOpaque(true);
	}

    /**
     * Creates the player labels.
     *
     * @param pnlPlayer the pnl player
     */
    private void createPlayerLabels(JPanel pnlPlayer) {
		for (int i = 0; i < GameMaster.MAX_PLAYER; i++) {
			lblPlayers[i] = new JLabel();
			lblPlayers[i].setBackground(Color.GREEN);
			pnlPlayer.add(lblPlayers[i]);
		}
	}

	/**
	 * Display info.
	 */
	public void displayInfo() {
		gUICellProduct.displayInfo(this);
	}

	/**
	 * Gets the cell.
	 *
	 * @return the cell
	 */
	public IOwnable getCell() {
		return gUICellProduct.getCell();
	}
	
	/**
	 * Removes the player.
	 *
	 * @param index the index
	 */
	public void removePlayer(int index) {
		lblPlayers[index].setText("");
		lblPlayers[index].setOpaque(false);
        this.repaint();
	}
}
