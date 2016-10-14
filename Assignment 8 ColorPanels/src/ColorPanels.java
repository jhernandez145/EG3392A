/*
 * Jesus Hernandez 614019
 * 10-12-19
 * Assignment 8 Question 2
 */

import javax.swing.*;
import java.awt.Color;

public class ColorPanels {
	public static void main(String[] args) {
		final String TITLE = "Color Panels";
		final String RED_LABEL = "Red";
		final String BLUE_LABEL = "Blue";
		final String YELLOW_LABEL = "Yellow";
		
		final int WINDOW_WIDTH = 1000;
		final int WINDOW_HEIGHT = 500;
		
		final int PANEL_WIDTH = (WINDOW_WIDTH / 4);
		final int PANEL_HEIGHT = (WINDOW_HEIGHT / 2);
		final int PANEL_VERTICLE = 100;
		final int PANEL_HORIZONTAL = 20;
		
		/*
		 *  CREATE ALL THE SWING OBJECTS 
		 */
		
		// JFrame
		JFrame frame = new JFrame(TITLE);
		
		// JPanels
		JPanel rPanel = new JPanel();
		JPanel bPanel = new JPanel();
		JPanel yPanel = new JPanel();
		
		// JLabels
		JLabel rLabel = new JLabel(RED_LABEL);
		JLabel bLabel = new JLabel(BLUE_LABEL);
		JLabel yLabel = new JLabel(YELLOW_LABEL);
		
		// JButtons
		JButton rButton = new JButton(RED_LABEL.toUpperCase());
		JButton bButton = new JButton(BLUE_LABEL.toUpperCase());
		JButton yButton = new JButton(YELLOW_LABEL.toUpperCase());
		
		/*
		 *  SETS THE PANELS WITH GIVEN PROPERTIES
		 */
		
		// Red panel
		rPanel.setLayout(null);
		rPanel.setBackground(Color.RED);
		rPanel.setLocation(PANEL_HORIZONTAL, PANEL_VERTICLE);
		rPanel.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		rPanel.setVisible(true);
		
		// Blue panel
		bPanel.setLayout(null);
		bPanel.setBackground(Color.BLUE);
		bPanel.setLocation(PANEL_HORIZONTAL + 350, PANEL_VERTICLE);	// 1 * [250 + (250 / 2 = 125)- 25]  = 350 (bPanel offset)
		bPanel.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		bPanel.setVisible(true);
		
		// Yellow panel
		yPanel.setLayout(null);
		yPanel.setBackground(Color.YELLOW);
		yPanel.setLocation(PANEL_HORIZONTAL + 700, PANEL_VERTICLE);	// 2 * [250 + (250 / 2 = 125) - 25] = 700 (yPanel offset)
		yPanel.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		yPanel.setVisible(true);
		
		/*
		 *  SETS THE LABELS WITH GIVEN PROPERTIES
		 */
		
		// Red label
		rLabel.setLayout(null);
		rLabel.setForeground(Color.RED);
		rLabel.setBounds(PANEL_HORIZONTAL + 115, PANEL_VERTICLE - 150, PANEL_WIDTH, PANEL_HEIGHT); //No clue why I have to subtract from vertical to go up
		rLabel.setVisible(true);
		
		// Blue label
		bLabel.setLayout(null);
		bLabel.setForeground(Color.BLUE);
		bLabel.setBounds(PANEL_HORIZONTAL + 465, PANEL_VERTICLE - 150, PANEL_WIDTH, PANEL_HEIGHT);	// 350(bPanel offset) + 120 (offset to get to center of panel) - 5 = 465
		bLabel.setVisible(true);
		
		// Blue label
		yLabel.setLayout(null);
		yLabel.setForeground(Color.YELLOW);
		yLabel.setBounds(PANEL_HORIZONTAL + 815, PANEL_VERTICLE - 150, PANEL_WIDTH, PANEL_HEIGHT);	// 700(yPanel offset) + 120 (offset to get to center of panel) - 5 = 815
		yLabel.setVisible(true);
		
		/*
		 *  SETS THE BUTTONS WITH GIVEN PROPERTIES
		 */
		
		// Red button
		rButton.setLayout(null);
		rButton.setBounds(PANEL_HORIZONTAL + 80, PANEL_VERTICLE + 300 , 100, 50);
		rButton.setVisible(true);
		
		// Blue button
		bButton.setLayout(null);
		bButton.setBounds(PANEL_HORIZONTAL + 430, PANEL_VERTICLE + 300 , 100, 50);	// 350 (bPanel offset) + 80 = 430
		bButton.setVisible(true);
		
		// Yellow button
		yButton.setLayout(null);
		yButton.setBounds(PANEL_HORIZONTAL + 780, PANEL_VERTICLE + 300 , 100, 50);	// 700 (yPanel offset) + 80 = 780
		yButton.setVisible(true);
		
		/*
		 *  ADD PANELS/LABELS/BUTTONS AND SET THE FRAME PROPERTIES
		 */
		
		// Add panels
		frame.add(rPanel);
		frame.add(bPanel);
		frame.add(yPanel);
		
		// Add labels
		frame.add(rLabel);
		frame.add(bLabel);
		frame.add(yLabel);
		
		// Add buttons
		frame.add(rButton);
		frame.add(bButton);
		frame.add(yButton);
		
		// Set JFrame properties
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
