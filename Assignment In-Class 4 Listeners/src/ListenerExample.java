import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerExample extends JFrame {

	private static final long serialVersionUID = 1L;
	public int clickCount = 0;

	public ListenerExample() {
		Dimension dimension = new Dimension(500, 500);
		setTitle("ListenerExample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setPreferredSize(dimension);
		
		JButton button = new JButton("Click");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getToolkit().beep();
				System.out.println("Click #" + ++clickCount);
			}
		});

		button.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("(x, y) = (" + e.getX() + ", " + e.getY() + ")");
			}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		getContentPane().add(button, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		ListenerExample le = new ListenerExample();
		le.setVisible(true);
	}

}
