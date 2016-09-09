/*
 * Jesus Hernandez 614019
 * 9-9-16
 * Assignment 3 Question 2
 */
public class Polygon extends GeometricObject1 {
	private int sides;
	private int sideLength;

	public Polygon() {
		super();
	}

	public Polygon(String color, boolean filled, int sides, int sideLenght) {
		super(color, filled);
		this.sides = sides;
		this.sideLength = sideLenght;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLenght) {
		this.sideLength = sideLenght;
	}
	
	public double getPerimeter(){
		return (sides * sideLength);
	}
	
	public double getAngle(){
		return ((sides - 2) * (180 / sides));
	}

	@Override
	public String toString() {
		return "The polygon has " + getSides() + " sides\n" +
			   "A side length of " + getSides() +"\n" + 
			   "A perimeter of " + getPerimeter() + "\n" +
			   getDateCreated();
	}
}
