/*
 * Jesus Hernandez 614019
 * 9-15-16
 * Assignment 4 Question 1
 */
public class Shape {
	private String color;
	
	public Shape(){
		color = "transparent";
	}
	public Shape(String color){
		this.color = color;
	}
	
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public double getArea(){
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Shape [color=" + color + ", hashCode()=" + hashCode() + "]";
	}
}
