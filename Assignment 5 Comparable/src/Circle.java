
public class Circle extends GeometricObject1 {
	private int radius;
	public Circle() {
	}

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + " Circle:  radius = " + radius;
	}

	@Override
	public double getArea() {
		return (Math.PI * Math.pow(radius, 2));
	}

	@Override
	public double getPerimeter() {
		return (2 * Math.PI * radius);
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
