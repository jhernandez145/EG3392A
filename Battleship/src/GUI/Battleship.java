package GUI;

public class Battleship {
	protected static enum ShipHeader {
		NORTH, SOUTH, EAST, WEST
	};

	private ShipHeader heading;
	private int length;
	private int headX;
	private int headY;
	private int hitCounter;

	public Battleship(int length, int headX, int headY, int headingSeed) {
		this.length = length;
		this.headX = headX;
		this.headY = headY;
		this.heading = setHeading(headingSeed);
	}

	public ShipHeader getHeading() {
		return heading;
	}

	public void setHeading(ShipHeader heading) {
		this.heading = heading;
	}

	public static ShipHeader setHeading(int number) {
		switch (number) {
		case 0:
		case 4:
			return ShipHeader.NORTH;
		case 1:
		case 5:
			return ShipHeader.EAST;
		case 2:
		case 6:
			return ShipHeader.SOUTH;
		case 3:
		case 7:
			return ShipHeader.WEST;
		}
		return null;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeadX() {
		return headX;
	}

	public void setHeadX(int headX) {
		this.headX = headX;
	}

	public int getHeadY() {
		return headY;
	}

	public void setHeadY(int headY) {
		this.headY = headY;
	}

	public int getHitCounter() {
		return hitCounter;
	}

	public void setHitCounter(int hitCounter) {
		this.hitCounter = hitCounter;
	}

	public boolean isDestroyed() {
		return (hitCounter == length);
	}

	public boolean isOnTile(Tile t) {
		int[] tileCoords = t.getCoordinates();

		// given an orientation, traverse the tile in that direction and see if
		// battleship coordinates match.

		// along the ship given a NORTH heading
		if (heading == ShipHeader.NORTH) {
			for (int i = 0; i < length; i++) {
				if (headX == tileCoords[0] && headY + i == tileCoords[1]) {
					return true;
				} else if (!(headX == tileCoords[0]) && !(headY + i == tileCoords[1])) {
					continue;
				}
			}
			// along the ship given a SOUTH heading
		} else if (heading == ShipHeader.SOUTH) {
			for (int i = 0; i < length; i++) {
				if (headX == tileCoords[0] && headY - i == tileCoords[1]) {
					return true;
				} else if (!(headX == tileCoords[0]) && !(headY + i == tileCoords[1])) {
					continue;
				}
			}
			// along the ship given a EAST heading
		} else if (heading == ShipHeader.EAST) {
			for (int i = 0; i < length; i++) {
				if (headX + i == tileCoords[0] && headY == tileCoords[1]) {
					return true;
				} else if (!(headX + i == tileCoords[0]) && !(headY == tileCoords[1])) {
					continue;
				}
			}
			// along the ship given a WEST heading
		} else if (heading == ShipHeader.WEST) {
			for (int i = 0; i < length; i++) {
				if (headX - i == tileCoords[0] && headY == tileCoords[1]) {
					return true;
				} else if (!(headX - i == tileCoords[0]) && !(headY == tileCoords[1])) {
					continue;
				}
			}

		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Battleship:  heading = " + heading + ", length = " + length + ", headX = " + headX + ", headY = "
				+ headY + ", hitCounter = " + hitCounter;
	}

}
