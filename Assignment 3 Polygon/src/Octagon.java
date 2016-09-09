/*
 * Jesus Hernandez 614019
 * 9-9-16
 * Assignment 3 Question 2
 */
public class Octagon extends Polygon {
	private final static int OCTAGON_SIDES = 8;

	public Octagon() {
		super();
	}

	public Octagon(String color, int sideLenght) {
		super(color, true, OCTAGON_SIDES, sideLenght);
	}

	public double getArea() {
		return ((2 + (2 * Math.sqrt(2.0))) * getSideLength() * getSideLength());
	}

	@Override
	public String toString() {
		return "An octagon has " + getSides() + " sides\n" +
			   "A side length of " + getSideLength() +"\n" +
				"An area of " + getArea() + "\n" +
			   "A perimeter of " + getPerimeter() + "\n" +
			   "An internal angle of " + getAngle() +"\n" +
			   getDateCreated();
	}
}
