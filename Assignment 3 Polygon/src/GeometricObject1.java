/*
 * Jesus Hernandez 614019
 * 9-9-16
 * Assignment 3 Question 2
 */
import java.util.Date;
public class GeometricObject1 {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject1(){
		dateCreated = new Date();
	}
	public GeometricObject1(String color, boolean filled){
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	@Override
	public String toString() {
		return "GeometricObject1:  color = " + color + ", filled = " + filled + ", dateCreated = " + dateCreated;
	}	
}
