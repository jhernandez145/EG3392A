/*
 * Jesus Hernandez 614019
 * 9-15-16
 * Assignment 4 Question 1
 */
public class TestShape {
	public static void main(String[] args) {
		Shape[] shapeArray = new Shape[3];
		
		shapeArray[0] = new Shape("Red");
		shapeArray[1] = new Circle(2.0);
		shapeArray[2] = new Rectangle(5.0, 5.0);
		
		for(Shape shapeObj : shapeArray){
			System.out.println(shapeObj.toString() + ", getArea() = " + shapeObj.getArea());
		}
	}
}