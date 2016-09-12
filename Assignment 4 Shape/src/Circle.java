/*
 * Jesus Hernandez 614019
 * 9-15-16
 * Assignment 4 Question 1
 */
public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		radius = 0;
	}
	public Circle(double radius){
		this.radius = radius;
	}
	
	
	public double getArea(){
		return (Math.PI * Math.pow(radius, 2));
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", hashCode()=" + hashCode() + "]";
	}
}
