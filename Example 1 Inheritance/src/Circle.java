public class Circle extends Shape{
	private int radius;
	
	public Circle(){
		super();
		radius = 1;
	}
	public Circle(String color, int radius){
		super(color);
		this.radius = radius;
	}
	
	/*
	 * Getter methods
	 */
	public int getRadius(){
		return radius;
	}
	public int getPerimeter(){
		return (int) (2 * Math.PI * radius);
	}
	public int getDiameter(){
		return (2 * radius);
	}
	public int getArea(){
		return (int) (Math.PI * Math.pow(radius, 2.0));
	}
	
	/*
	 * toString method, notice this contains methods that return info from superclass
	 */
	public String toString(){
		return "Radius: " + radius + " Diameter: " + getDiameter() + 
			   "\nPerimiter: " + getPerimeter() + " Area: " + getArea() +
			   "\nColor: " + getColor() + " isFilled: " + isFilled() +
			   "\nDate Created: " + getDateCreated();
	}
}