
/*
 * Jesus Hernandez 614019
 * 10-28-16
 * Assignment 9 Question 3
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TempConverter extends JFrame {
	private static final long serialVersionUID = 1L;

	public TempConverter() {
		Dimension preferredSizeLabel = new Dimension(220, 25);
		Dimension preferredSizeTextField = new Dimension(100, 25);
		Dimension preferredSizeButton = new Dimension(150, 30);
		setLayout(new FlowLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JLabel variableLabel = new JLabel("Enter a value in Celsius or Fahrenheit:");
		variableLabel.setPreferredSize(preferredSizeLabel);
		JLabel answerLabel = new JLabel("Fahrenheit:");
		answerLabel.setPreferredSize(preferredSizeLabel);

		JTextField variableTextField = new JTextField();
		variableTextField.setPreferredSize(preferredSizeTextField);
		JTextField answerTextField = new JTextField();
		answerTextField.setPreferredSize(preferredSizeTextField);

		JRadioButton toFahrenheitRadioButton = new JRadioButton("Convert to fahrenheit");
		toFahrenheitRadioButton.setPreferredSize(preferredSizeButton);
		toFahrenheitRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double celsius = Double.parseDouble(variableTextField.getText());
					answerTextField.setText(Double.toString((celsius * (1.8)) + 32));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage() + ", expected number!", "Error!",
							JOptionPane.ERROR_MESSAGE, null);
					variableTextField.setText(null);
				}

			}
		});
		JRadioButton toCelsiusRadioButton = new JRadioButton("Convert to celsius");
		toCelsiusRadioButton.setPreferredSize(preferredSizeButton);
		toCelsiusRadioButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double fahrenheit = Double.parseDouble(variableTextField.getText());
					answerTextField.setText(Double.toString((fahrenheit - 32) / 1.8));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage() + ", expected number!", "Error!",
							JOptionPane.ERROR_MESSAGE, null);
					variableTextField.setText(null);
				}
			}
		});

		// Not a layout component, used to have only one JRadioButton selected
		// at a time.
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(toFahrenheitRadioButton);
		buttonGroup.add(toCelsiusRadioButton);

		panel.add(variableLabel);
		panel.add(variableTextField);
		panel.add(toFahrenheitRadioButton);
		panel.add(toCelsiusRadioButton);
		panel.add(answerTextField);

		getContentPane().add(panel);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		TempConverter tc = new TempConverter();
	}

}
