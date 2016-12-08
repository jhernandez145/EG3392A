/*
 * Jesus Hernandez 614019
 * 10-28-16
 * Assignment 9 Question 1
 */
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Scoreboard extends JFrame {
	private static final long serialVersionUID = 1L;

	public Scoreboard() {
		setLayout(null);
		setSize(1200, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JButton Scoreboard");
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Scoreboard frame = new Scoreboard();

		JPanel panel = new JPanel(null);

		setPanelProperties(frame, panel);

		JLabel rLabel = new JLabel("Red Team");
		setLabelProperties(panel, rLabel, Color.RED, 0);
		JLabel bLabel = new JLabel("Blue Team");
		setLabelProperties(panel, bLabel, Color.BLUE, 2);

		JLabel rsLabel = new JLabel("0");
		setScoreLabelProperties(panel, rsLabel, Color.BLACK, 0);
		JLabel bsLabel = new JLabel("0");
		setScoreLabelProperties(panel, bsLabel, Color.BLACK, 2);

		JButton rButton = new JButton("Red Score!");
		setButtonProperties(panel, rButton, 0);
		JButton bButton = new JButton("Blue Score!");
		setButtonProperties(panel, bButton, 1);

		JButton resetButton = new JButton("Reset Score");
		resetButton.setBounds(50, 400, 1100, 150);
		resetButton.setEnabled(true);
		resetButton.setVisible(true);
		panel.add(resetButton);

		frame.setVisible(true);
	}

	public static void setPanelProperties(JFrame frame, JPanel panel) {
		panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		frame.getContentPane().add(panel);
	}

	public static void setLabelProperties(JPanel parentPanel, JLabel label, Color color, int index) {
		label.setBounds(250 + (index * 300), 10, 100, 50);
		label.setForeground(color);
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		parentPanel.add(label);
	}

	public static void setScoreLabelProperties(JPanel parentPanel, JLabel label, Color color, int index) {
		label.setBounds(300 + (index * 300), 150, 100, 50);
		label.setForeground(color);
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		parentPanel.add(label);

	}

	public static void setButtonProperties(JPanel parentPanel, JButton button, int index) {
		button.setBounds(50 + (600 * index), 250, 450, 125);
		button.setEnabled(true);
		button.setVisible(true);
		parentPanel.add(button);
	}

	public static void setResetButtonProperties(JPanel parentPanel, JButton button) {
		button.setBounds(300, 400, 600, 150);
		button.setEnabled(true);
		button.setVisible(true);
		parentPanel.add(button);
	}
}
