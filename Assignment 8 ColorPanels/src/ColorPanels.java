import javax.swing.*;
import java.awt.Color;

public class ColorPanels extends JFrame {
	private static final long serialVersionUID = 1L;

	public ColorPanels() {
		setLayout(null);
		setSize(1200, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Colors Panel");
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		ColorPanels frame = new ColorPanels();

		JPanel panel_0 = new JPanel(null);
		setParentPanelProperties(frame, panel_0, Color.LIGHT_GRAY, 0);

		JPanel panel_1 = new JPanel(null);
		setParentPanelProperties(frame, panel_1, Color.LIGHT_GRAY, 1);

		JPanel panel_2 = new JPanel(null);
		setParentPanelProperties(frame, panel_2, Color.LIGHT_GRAY, 2);

		JPanel rPanel = new JPanel(null);
		setChildPanelProperties(panel_0, rPanel, Color.RED);

		JPanel bPanel = new JPanel(null);
		setChildPanelProperties(panel_1, bPanel, Color.BLUE);

		JPanel yPanel = new JPanel(null);
		setChildPanelProperties(panel_2, yPanel, Color.YELLOW);

		JLabel rLabel = new JLabel("Red");
		setLabelProperties(rPanel, rLabel, Color.RED);

		JLabel bLabel = new JLabel("Blue");
		setLabelProperties(bPanel, bLabel, Color.BLUE);

		JLabel yLabel = new JLabel("Yellow");
		setLabelProperties(yPanel, yLabel, Color.YELLOW);

		JButton rButton = new JButton("RED");
		setButtonProperties(rPanel, rButton);

		JButton bButton = new JButton("BLUE");
		setButtonProperties(bPanel, bButton);

		JButton yButton = new JButton("YELLOW");
		setButtonProperties(yPanel, yButton);

		panel_0.add(rPanel);
		panel_1.add(bPanel);
		panel_2.add(yPanel);

		panel_0.add(rLabel);
		panel_1.add(bLabel);
		panel_2.add(yLabel);

		panel_0.add(rButton);
		panel_1.add(bButton);
		panel_2.add(yButton);

		frame.getContentPane().add(panel_0);
		frame.getContentPane().add(panel_1);
		frame.getContentPane().add(panel_2);
	}

	public static void setParentPanelProperties(JFrame frame, JPanel panel, Color color, int location) {
		panel.setBackground(color);
		panel.setBounds(((frame.getWidth() / 3) * location), 0, (frame.getWidth() / 3), frame.getHeight());
		panel.setVisible(true);
	}

	public static void setChildPanelProperties(JPanel parentPanel, JPanel childPanel, Color color) {
		childPanel.setBounds((parentPanel.getWidth() / 3), (parentPanel.getHeight() / 3), (parentPanel.getHeight() / 4),
				(parentPanel.getWidth() / 4));
		childPanel.setBackground(color);
		childPanel.setVisible(true);
	}

	public static void setLabelProperties(JPanel panel, JLabel label, Color color) {
		label.setBounds((panel.getX() + (panel.getWidth() / 3) + 3), (panel.getY() - panel.getHeight()), 100, 100);
		label.setForeground(color);
		label.setVisible(true);
	}

	public static void setButtonProperties(JPanel panel, JButton button) {
		button.setEnabled(true);
		button.setBounds((panel.getX() + (panel.getWidth() / 6)), panel.getHeight() + panel.getY() + 50, 100, 50);
		button.setVisible(true);
	}
}