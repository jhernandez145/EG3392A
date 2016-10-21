
/*
 * Jesus Hernandez 614019
 * 10-28-16
 * Assignment 9 Question 2
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TemperatureConverter extends JFrame {
	private static final long serialVersionUID = 1L;

	public TemperatureConverter() {
		Dimension preferredSizeLabel = new Dimension(75, 25);
		Dimension preferredSizeTextField = new Dimension(100, 25);
		Dimension preferredSizeButton = new Dimension(100, 30);
		setLayout(new FlowLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JLabel celsiusLabel = new JLabel("Celsius:");
		celsiusLabel.setPreferredSize(preferredSizeLabel);
		JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
		fahrenheitLabel.setPreferredSize(preferredSizeLabel);

		JTextField celsiusTextField = new JTextField();
		celsiusTextField.setPreferredSize(preferredSizeTextField);
		JTextField fahrenheitTextField = new JTextField();
		fahrenheitTextField.setPreferredSize(preferredSizeTextField);

		JButton convertButton = new JButton("convert");
		convertButton.setPreferredSize(preferredSizeButton);
		convertButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double celsius = Double.parseDouble(celsiusTextField.getText());
				fahrenheitTextField.setText(Double.toString((celsius * (1.8)) + 32));
			}
		});

		panel.add(celsiusLabel);
		panel.add(celsiusTextField);
		panel.add(fahrenheitLabel);
		panel.add(fahrenheitTextField);
		panel.add(convertButton);

		getContentPane().add(panel);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		TemperatureConverter tc = new TemperatureConverter();
	}

}
