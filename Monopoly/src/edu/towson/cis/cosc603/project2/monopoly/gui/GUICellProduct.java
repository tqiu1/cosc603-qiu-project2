package edu.towson.cis.cosc603.project2.monopoly.gui;


import edu.towson.cis.cosc603.project2.monopoly.IOwnable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.io.Serializable;

public class GUICellProduct implements Serializable {
	private IOwnable cell;
	private JLabel lblInfo;

	public IOwnable getCell() {
		return cell;
	}

	public void setCell(IOwnable cell) {
		this.cell = cell;
	}

	/**
	 * Display info.
	 */
	public void displayInfo(GUICell gUICell) {
		lblInfo.setText(InfoFormatter.cellInfo(cell));
		gUICell.invalidate();
		gUICell.repaint();
	}

	/**
	 * Adds the cell info.
	 */
	public void addCellInfo(GUICell gUICell) {
		lblInfo = new JLabel();
		displayInfo(gUICell);
		JPanel pnlInfo = new JPanel();
		pnlInfo.setLayout(new GridLayout(1, 1));
		pnlInfo.add(lblInfo);
		gUICell.add(pnlInfo);
	}
}