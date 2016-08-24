public class Rectangle extends Shape {
	private int width;
	private int height;
	
	/*
	 * Constructors
	 */
	public Rectangle() {
		super();
	}
	public Rectangle(String color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	/*
	 * Getter methods for fields
	 */
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	public int getPerimeter(){
		return (2 * (height + width));
	}
	public int getDiagonal(){
		return (int) Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	public int getArea(){
		return (width * height);
	}
	
	/*
	 * Setter methods for fields
	 */
	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	
	/*
	 * toString method, notice this contains methods that return info from superclass
	 */
	public String toString(){
		return "Height: " + height + " Width: " + width + " Area: " + getArea() +
			   "\nPerimeter: " + getPerimeter() + " Diagonal: " + getDiagonal() +
			   "\nColor: " + getColor() + " isFilled: " + isFilled() + 
			   "\nDate Created: " + getDateCreated();
	}	
}