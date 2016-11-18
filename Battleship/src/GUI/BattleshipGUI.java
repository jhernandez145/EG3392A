package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BattleshipGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelContainer = new JPanel();
	private JPanel mainMenu = new MainMenu();
	private JPanel battleGrid = new BattleGrid();
	private CardLayout cl = new CardLayout();

	public BattleshipGUI() {
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelContainer.setLayout(cl);
		panelContainer.add(mainMenu, "0");
		panelContainer.add(battleGrid, "1");
		//panelContainer.add(nextMenu, "1"); ...
		
		cl.show(panelContainer, "0");
		
		add(panelContainer);
		pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
		System.out.println("main");
		new BattleshipGUI();
	}
}
