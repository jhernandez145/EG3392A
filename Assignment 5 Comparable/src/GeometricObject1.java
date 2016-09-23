import java.util.Date;
public abstract class GeometricObject1 implements Comparable{
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	//Constructors
	public GeometricObject1(){
		color = "none";
		filled = false;
	}
	public GeometricObject1(String color){
		this.color = color;
		filled = true;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}

	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public Date getDateCreated(){
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	
	@Override
	public String toString() {
		return "GeometricObject1:  color = " + color + ", filled = " + filled + ", dateCreated = " + dateCreated;
	}
	
	public abstract boolean compareColor(GeometricObject1 obj);
	public abstract boolean compareArea(GeometricObject1 obj);
	public abstract boolean comparePerimeter(GeometricObject1 obj);
}
