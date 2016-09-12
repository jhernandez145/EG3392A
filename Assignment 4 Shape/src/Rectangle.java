/*
 * Jesus Hernandez 614019
 * 9-15-16
 * Assignment 4 Question 1
 */
public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle() {
		width = 0.0;
		height = 0.0;
	}
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea(){
		return (width * height);
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getColor()=" + getColor() + ", hashCode()="
				+ hashCode() + "]";
	}	
}
