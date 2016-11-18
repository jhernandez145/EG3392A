package GUI;

import java.util.Arrays;

public class Tile {
	private boolean isEmpty;
	private boolean isHit;
	private boolean isMiss;
	private int[] coordinates;

	public Tile(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public boolean isHit() {
		return isHit;
	}

	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}

	public boolean isMiss() {
		return isMiss;
	}

	public void setMiss(boolean isMiss) {
		this.isMiss = isMiss;
	}

	public int[] getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(int[] coordinates) {
		this.coordinates = coordinates;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tile:  isEmpty = " + isEmpty + ", isHit = " + isHit + ", isMiss = " + isMiss + ", coordinates = "
				+ Arrays.toString(coordinates);
	}

}
