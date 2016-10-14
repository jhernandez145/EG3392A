/*
 * Jesus Hernandez 614019
 * 10-12-19
 * Assignment 8 Question 3
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeetingDialog {
	public static void main(String[] args) {
		final String TITLE = "Meeting Dialog";
		final String ENTER_TITLE = "Enter";
		final String NAME_LABEL = "Name:";
		
		final int WINDOW_WIDTH = 1000;
		final int WINDOW_HEIGHT = 500;
		
		final int TEXTFIELD_HEIGHT = 50;
		final int TEXTFIELD_WIDTH = 500;
		
		/*
		 *  CREATE ALL THE SWING OBJECTS 
		 */
		
		// JFrame
		JFrame frame = new JFrame(TITLE);
		
		
		// JLabels
		JLabel instructionLabel = new JLabel();
		JLabel nameLabel = new JLabel(NAME_LABEL);
		
		// JTextField
		JTextField inputField = new JTextField();
		
		// JButtons
		JButton enterButton = new JButton(ENTER_TITLE);
		
		/*
		 *  SETS THE LABEL WITH GIVEN PROPERTIES
		 */
		
		
		// nameLabel
		nameLabel.setLayout(null);
		nameLabel.setBounds((WINDOW_WIDTH/4), (TEXTFIELD_HEIGHT*5), 50, 50);
		nameLabel.setVisible(true);
		
		/*
		 *  SETS THE TEXTFIELD WITH GIVEN PROPERTIES
		 */
		inputField.setLayout(null);
		inputField.setBounds((WINDOW_WIDTH/3), (WINDOW_HEIGHT/2), TEXTFIELD_WIDTH, TEXTFIELD_HEIGHT);
		inputField.setBackground(Color.WHITE);
		inputField.setVisible(true);
		
		
		/*
		 *  SETS THE BUTTONS WITH GIVEN PROPERTIES
		 */
		enterButton.setEnabled(true);
		enterButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String messageAsk = "Is " + inputField.getText() + " your name?";
				String messageGreet = "Nice to meet you " + inputField.getText();
				int response = JOptionPane.showConfirmDialog(frame, messageAsk, "Confirm name", JOptionPane.YES_NO_OPTION);
				
				if(response == JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(frame, messageGreet);
				}
			}
		});
		enterButton.setBounds((WINDOW_WIDTH/2), ((WINDOW_HEIGHT/2) + 100), 100, 50);
		enterButton.setVisible(true);
		
		/*
		 * ADD TEXTFIELD/LABELS/BUTTON AND SET FRAME PROPERTIES
		 */
		
		frame.add(inputField);
		frame.add(instructionLabel);
		frame.add(nameLabel);
		frame.add(enterButton);
		
		//Set JFrame properties
		frame.setLayout(null);
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
