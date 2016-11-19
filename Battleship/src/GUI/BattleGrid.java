package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BattleGrid extends JPanel {

	private static int totalShots = 0;
	private static int hitShots = 0;

	private static final long serialVersionUID = 1L;
	private final static int X_LENGTH = 7; // X = [0,7]
	private final static int Y_LENGTH = 7; // Y = [0,7]
	private final static int SHIP_UNITS = 4;

	private static Tile[][] tile = new Tile[X_LENGTH + 1][Y_LENGTH + 1]; // 8x8
																			// grid
	private static Battleship[] battleshipArray = new Battleship[SHIP_UNITS];
	private static Battleship battleship1;
	private static Battleship battleship2;
	private static Battleship battleship3;
	private static Battleship battleship4;

	private static Map<JButton, int[]> buttonToCoordMap = new HashMap<JButton, int[]>();

	// TODO FIX: only the 4-tile long Battleship is properly displayed when hit.

	public BattleGrid() {
		System.out.println("readying ships");
		readyShipsAI();
		System.out.println("done");
		setLayout(new BorderLayout());
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		gbc.anchor = GridBagConstraints.CENTER;

		System.out.println("adding components");
		for (int x = 0; x <= X_LENGTH; x++) {
			for (int y = 0; y <= Y_LENGTH; y++) {
				JButton button = new JButton("(" + x + ", " + y + ")");
				// this is because we are going to have labels to the left
				// indicating X_COORDINATE, so offset by one
				gbc.gridx = (x + 1);
				gbc.gridy = (Y_LENGTH - y);

				int[] coords = { x, y };
				tile[x][y].setCoordinates(coords);
				System.out.println(Arrays.toString(coords));
				button.addActionListener(new ActionListener() {
					// on pressing a button (tile) check to see if it has a
					// Battleship on it. if so, set it to 'hit' and add one
					// damage to the battleship. else, set it to 'miss'.
					// if 'miss', set the button to color white and change
					// text to 'miss', else, set the color to red and set the
					// text to 'hit'.
					@Override
					public void actionPerformed(ActionEvent e) {
						totalShots++;
						int[] coords = buttonToCoordMap.get(button);
						System.out.println("Coords" + Arrays.toString(coords));
						System.out.println("is empty: " + tile[coords[0]][coords[1]].isEmpty());

						// TODO on hit, it changes to "Miss" and turns white,
						// however the button does get disabled. Fix bug.
						for (Battleship b : battleshipArray) {
							System.out.println("Seeing if ship " + b.getLength() + "is on tile");
							System.out.println("at coords: " + tile[coords[0]][coords[1]].getCoordinates());
							System.out.println(b.isOnTile(tile[coords[0]][coords[1]]));
							if (b.isOnTile(tile[coords[0]][coords[1]])) {
								hitShots++; // once this reaches 10, game ends
								tile[coords[0]][coords[1]].setMiss(false);
								tile[coords[0]][coords[1]].setHit(true);
								button.setText("HIT");
								button.setBackground(Color.RED);
								button.setEnabled(false);
								System.out.println("HIT!");
								b.setHitCounter(b.getHitCounter() + 1);
								System.out.println("TOTAL HITS ON TARGET: " + b.getHitCounter());
								tile[coords[0]][coords[1]].setHit(true);
							} else if (!b.isOnTile(tile[coords[0]][coords[1]])) {
								tile[coords[0]][coords[1]].setMiss(true);
								button.setText("MISS");
								button.setBackground(Color.WHITE);
								continue;
							}
						}
						System.out.println("t: " + totalShots + " h: " + hitShots);
						if (hitShots == 10) {
							JOptionPane.showMessageDialog(null, "You won! only took you " + totalShots + " shots ",
									"Victory!", JOptionPane.INFORMATION_MESSAGE);
						}
						System.out.println("\n\n\n");
					}
				});
				buttonToCoordMap.put(button, coords);
				panel.add(button, gbc);
			}
		}

		for (int y = Y_LENGTH; y >= 0; y--) {
			JLabel yCoordLabel = new JLabel(Integer.toString(Y_LENGTH - y));
			yCoordLabel.setHorizontalAlignment(JLabel.CENTER);
			yCoordLabel.setVerticalAlignment(JLabel.CENTER);
			gbc.gridx = 0;
			gbc.gridy = y;

			panel.add(yCoordLabel, gbc);
		}

		for (int x = 0; x <= X_LENGTH; x++) {
			JLabel xCoordLabel = new JLabel(Integer.toString(x));
			xCoordLabel.setHorizontalAlignment(JLabel.CENTER);
			xCoordLabel.setVerticalAlignment(JLabel.CENTER);
			gbc.gridx = (x + 1);
			gbc.gridy = (Y_LENGTH + 1);

			panel.add(xCoordLabel, gbc);
		}

		System.out.println("done");

		add(panel, BorderLayout.CENTER);

		System.out.println("battle grid done");
	}

	public static void readyShipsAI() {
		for (int i = 0; i < tile.length; i++) {
			for (int j = 0; j < tile[i].length; j++) {
				tile[i][j] = new Tile(true);
				int[] coords = { i, j };
				tile[i][j].setCoordinates(coords);
			}
		}
		System.out.println("Start");
		battleship1 = new Battleship(1, generateRandomInteger(), generateRandomInteger(), generateRandomInteger());
		battleship2 = new Battleship(2, generateRandomInteger(), generateRandomInteger(), generateRandomInteger());
		battleship3 = new Battleship(3, generateRandomInteger(), generateRandomInteger(), generateRandomInteger());
		battleship4 = new Battleship(4, generateRandomInteger(), generateRandomInteger(), generateRandomInteger());

		battleshipArray[0] = battleship1;
		battleshipArray[1] = battleship2;
		battleshipArray[2] = battleship3;
		battleshipArray[3] = battleship4;

		for (int i = 0; i < battleshipArray.length; i++) {
			System.out.println("Ship #" + (i + 1) + ": " + battleshipArray[i].toString());
		}
		System.out.println("\n\n\n");

		for (int i = 0; i < battleshipArray.length; i++) {
			System.out.println("Ship #" + (i + 1) + " Clearance: " + hasClearance(battleshipArray[i]));
		}

		for (int i = 0; i < battleshipArray.length; i++) {
			while (!hasClearance(battleshipArray[i])) {
				battleshipArray[i].setHeadX(generateRandomInteger());
				battleshipArray[i].setHeadY(generateRandomInteger());
				battleshipArray[i].setHeading(Battleship.setHeading(generateRandomInteger()));
			}
		}

		System.out.println("\n\n\n");

		for (int i = 0; i < battleshipArray.length; i++) {
			System.out.println("Ship #" + (i + 1) + ": " + battleshipArray[i].toString());
		}

		System.out.println("\n\n\n");

		for (int i = 0; i < battleshipArray.length; i++) {
			System.out.println("Ship #" + (i + 1) + " Clearance: " + hasClearance(battleshipArray[i]));
		}

		for (Battleship b : battleshipArray) {
			fillTile(b);
		}

	}

	public static int generateRandomInteger() {
		Random r = new Random();
		return r.nextInt(8); // [0, 8)
	}

	// Checks to see if battleship can clear the board given a position and
	// heading.
	public static boolean hasClearance(Battleship b) {
		// given a heading, traverse the length of the board given the length of
		// the battleship. It first checks to see if the BATTLESHIP_POS +
		// BATTLESHIP_LENGTH does not exit the bounds of the grid. if it does
		// not, then check each tile in that selected area if it has been
		// previously filled with a battleship. if so, then it
		// does not have clearance.

		if (b.getHeading() == Battleship.ShipHeader.NORTH) {
			if (b.getHeadY() + b.getLength() > Y_LENGTH) {
				return false;
			} else if (b.getHeadY() + b.getLength() <= Y_LENGTH) {
				for (int i = 0; i < b.getLength(); i++) {
					if (!tile[b.getHeadX()][b.getHeadY() + i].isEmpty()) {
						return false;
					} else if (tile[b.getHeadX()][b.getHeadY() + i].isEmpty()) {
						continue;
					}
				}
			}
		} else if (b.getHeading() == Battleship.ShipHeader.SOUTH) {
			if (b.getHeadY() - b.getLength() < 0) {
				return false;
			} else if (b.getHeadY() - b.getLength() >= 0) {
				for (int i = 0; i < b.getLength(); i++) {
					if (!tile[b.getHeadX()][b.getHeadY() - i].isEmpty()) {
						return false;
					} else if (tile[b.getHeadX()][b.getHeadY() - i].isEmpty()) {
						continue;
					}
				}
			}
		} else if (b.getHeading() == Battleship.ShipHeader.EAST) {
			if (b.getHeadX() + b.getLength() > X_LENGTH) {
				return false;
			} else if (b.getHeadX() + b.getLength() <= X_LENGTH) {
				for (int i = 0; i < b.getLength(); i++) {
					if (!tile[b.getHeadX() + i][b.getHeadY()].isEmpty()) {
						return false;
					} else if (tile[b.getHeadX() + i][b.getHeadY()].isEmpty()) {
						continue;
					}
				}
			}
		} else if (b.getHeading() == Battleship.ShipHeader.WEST) {
			if (b.getHeadX() - b.getLength() < 0) {
				return false;
			} else if (b.getHeadX() - b.getLength() >= 0) {
				for (int i = 0; i < b.getLength(); i++) {
					if (!tile[b.getHeadX() - i][b.getHeadY()].isEmpty()) {
						return false;
					} else if (tile[b.getHeadX() - i][b.getHeadY()].isEmpty()) {
						continue;
					}
				}
			}
		}
		return true;
	}

	public static void fillTile(Battleship b) {
		// if there is a ship that occupies this tile, change isEmtpy to false
		// traverses the entire grid, including every tile to determine the
		// occupancy
		for (int x = 0; x < X_LENGTH; x++) {
			for (int y = 0; y < Y_LENGTH; y++) {
				System.out.println("x: " + x + " y: " + y + " isOnTile: " + b.isOnTile(tile[x][y]) + " bx: "
						+ b.getHeadX() + " by: " + b.getHeadY() + " l: " + b.getLength());
				if (b.isOnTile(tile[x][y])) {
					tile[x][y].setEmpty(false);
				} else {
					continue;
				}
			}
		}
	}

}
