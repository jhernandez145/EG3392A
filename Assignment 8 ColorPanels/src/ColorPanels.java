/*
 * Jesus Hernandez 614019
 * 10-12-19
 * Assignment 8 Question 2
 */

import javax.swing.*;
import java.awt.Color;

public class ColorPanels {
	final static String TITLE = "Color Panels";
	final static String RED_LABEL = "Red";
	final static String BLUE_LABEL = "Blue";
	final static String YELLOW_LABEL = "Yellow";
	
	final static int WINDOW_WIDTH = 1000;
	final static int WINDOW_HEIGHT = 500;
	
	final static int PANEL_WIDTH = (WINDOW_WIDTH / 4);
	final static int PANEL_HEIGHT = (WINDOW_HEIGHT / 2);
	final static int PANEL_VERTICLE = 100;
	final static int PANEL_HORIZONTAL = 20;
	
	public static void main(String[] args) {
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
		
		// Set panel properties
		setPanelProperties(rPanel, Color.RED, 0);
		setPanelProperties(bPanel, Color.BLUE, 1);
		setPanelProperties(yPanel, Color.YELLOW, 2);
		
		// Set label properties
		setLabelProperties(rLabel, Color.RED, 0);
		setLabelProperties(bLabel, Color.BLUE, 1);
		setLabelProperties(yLabel, Color.YELLOW, 2);
		
		// Set button properties
		setButtonProperties(rButton, 0);
		setButtonProperties(bButton, 1);
		setButtonProperties(yButton, 2);
		
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
		setFrameProperties(frame);
	}
	public static void setPanelProperties(JPanel panel, Color color, int offset){
		int horizontalOffset = (offset * (250 + (250 / 2) - 25));
		panel.setLayout(null);
		panel.setBackground(color);
		panel.setLocation(PANEL_HORIZONTAL + horizontalOffset, PANEL_VERTICLE);
		panel.setSize(PANEL_WIDTH, PANEL_HEIGHT);
		panel.setVisible(true);
		
	}
	public static void setLabelProperties(JLabel label, Color color, int offset){
		int horizontalOffset = ((offset * (250 + (250 / 2) - 25)) + 115);	// lableHorizontalOffset + 115
		label.setLayout(null);
		label.setForeground(color);
		label.setBounds(PANEL_HORIZONTAL + horizontalOffset, PANEL_VERTICLE - 150, PANEL_WIDTH, PANEL_HEIGHT);	//No clue why I have to subtract from vertical to go up
		label.setVisible(true);
	}
	public static void setButtonProperties(JButton button, int offset){
		int horizontalOffset = ((offset * (250 + (250 / 2) - 25)) + 80);	//labelHorizontalOffset + 80
		button.setLayout(null);
		button.setBounds(PANEL_HORIZONTAL + horizontalOffset, PANEL_VERTICLE + 300 , 100, 50);
		button.setVisible(true);
	}
	public static void setFrameProperties(JFrame frame){
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}