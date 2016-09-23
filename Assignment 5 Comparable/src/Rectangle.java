
public class Rectangle extends GeometricObject1 {
	private int length;
	private int width;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return super.toString() + " Rectangle:  length = " + length + ", width = " + width;
	}

	@Override
	public double getArea() {
		return (length * width);
	}

	@Override
	public double getPerimeter() {
		return (2 * (length + width));
	}

	@Override
	public boolean compareColor(GeometricObject1 obj) {
		return (this.getColor() == obj.getColor());
	}

	@Override
	public boolean compareArea(GeometricObject1 obj) {
		return (this.getArea() == obj.getArea());
	}

	@Override
	public boolean comparePerimeter(GeometricObject1 obj) {
		return (this.getPerimeter() == obj.getPerimeter());
	}

}
