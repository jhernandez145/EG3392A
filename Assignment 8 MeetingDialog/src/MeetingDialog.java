/*
 * Jesus Hernandez 614019
 * 10-12-19
 * Assignment 8 Question 3
 */

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeetingDialog extends JFrame {
	private static final long serialVersionUID = 1L;

	public MeetingDialog() {
		setLayout(null);
		setSize(1200, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Meeting Dialog");
		setResizable(false);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		MeetingDialog frame = new MeetingDialog();

		JPanel panel = new JPanel(null);
		setPanelProperties(frame, panel);

		JTextField textField = new JTextField();
		setTextFieldProperties(panel, textField);

		JLabel label = new JLabel("Name:");
		setLabelProperties(panel, label);

		JButton button = new JButton("Enter");
		setButtonProperties(panel, button, textField);

		frame.setVisible(true);
	}

	public static void setPanelProperties(JFrame frame, JPanel panel) {
		panel.setLayout(null);
		panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		panel.setVisible(true);
		frame.add(panel);
	}

	public static void setTextFieldProperties(JPanel panel, JTextField textField) {
		textField.setLayout(null);
		textField.setBounds(450, 300, 300, 50);
		textField.setFont(new Font("Dialog", Font.BOLD, 15));
		textField.setVisible(true);
		panel.add(textField);
	}

	public static void setLabelProperties(JPanel panel, JLabel label) {
		label.setLayout(null);
		label.setBounds(400, 275, 100, 100);
		label.setFont(new Font("Dialog", Font.BOLD, 15));
		label.setVisible(true);
		panel.add(label);
	}

	public static void setButtonProperties(JPanel panel, JButton button, JTextField textField){
		button.setEnabled(true);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String messageAsk = "Is " + textField.getText() + " your name?";
				String messageGreet = "Nice to meet you, " + textField.getText() + "!";
				String messageConfirm = "Confirm name: " + textField.getText();
				int response = JOptionPane.showConfirmDialog(panel, messageAsk, messageConfirm, JOptionPane.YES_NO_OPTION);
				
				if(response == JOptionPane.YES_OPTION){
					JOptionPane.showMessageDialog(panel, messageGreet);
				}
			}
		});
		
		button.setBounds(650, 375, 100, 50);
		button.setVisible(true);
		panel.add(button);
	}
}
