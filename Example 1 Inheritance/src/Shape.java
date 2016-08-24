//Good job on writing the abstract class and method. Aktunc
import java.util.Date;
//Since this is abstract, its constructor may not be called, instead one of it's subclasses will
public abstract class Shape {
	private boolean filled;
	private String color;
	private Date dateCreated;
	
	/*
	 * Constructors
	 */
	public Shape(){
		super();
		filled = false;
		color = "transperant";
		dateCreated = new Date();
	}
	public Shape(String color){
		super();
		this.color = color;
		dateCreated = new Date();		
	}
	
	/*
	 * Getter methods for fields
	 */
	public boolean isFilled(){
		return filled;
	}
	public String getColor(){
		return color;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	
	/*
	 * Setter methods for fields
	 */
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public void setColor(String color){
		this.color = color;
		this.filled = true;	//It is now filled in with a color
	}
	
	/*
	 * Abstract method for area, design-by-contract. All subclasses must implement this now
	 */
	public abstract int getArea();
}
