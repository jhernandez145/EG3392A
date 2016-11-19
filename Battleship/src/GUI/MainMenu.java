package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainMenu extends JPanel {

	private static final long serialVersionUID = 1L;

	public MainMenu() {
		setLayout(new BorderLayout());
		JPanel panel = new JPanel(new GridLayout(1, 3, 0, 0));
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		JPanel newGamePanel = new JPanel();
		JPanel loadGamePanel = new JPanel();
		JPanel exitGamePanel = new JPanel();

		JButton newGameButton = new JButton("New Game");
		JButton loadGameButton = new JButton("Load Old Game");
		JButton exitGameButton = new JButton("Abandon Ship");

		
		newGameButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)getParent().getLayout();
				cl.show(getParent(), "1");
			}
		});
		newGamePanel.add(newGameButton);

		
		loadGamePanel.add(loadGameButton);

		
		exitGameButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitGamePanel.add(exitGameButton);

		panel.add(newGamePanel);
		panel.add(exitGamePanel);

		add(panel, BorderLayout.CENTER);

		validate();
	}
}
