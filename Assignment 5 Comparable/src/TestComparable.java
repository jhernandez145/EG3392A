/*
 * Jesus Hernandez 614019
 * 9-22-16
 * Assignment 5 Question 2
 */
public class TestComparable {
	public static void main(String[] args){
		Circle circle = new Circle("Red", 5);
	Rectangle rectangle = new Rectangle("Red", 5, 5);
	
	System.out.println("compareColor: " + circle.compareColor(rectangle));
	System.out.println("compareArea " + circle.compareArea(rectangle));
	System.out.println("comparePerimeter: " + circle.comparePerimeter(rectangle));
	
	System.out.println();
	
	System.out.println(circle.toString());
	System.out.println(rectangle.toString());
	}
}
