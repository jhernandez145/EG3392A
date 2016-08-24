public class TestShape {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Rectangle square = new Rectangle("orange", 5, 5);
		
		circle.setColor("red"); //setColor not part of Circle subclass, but inherited from Shape superclass
		
		System.out.println("CIRCLE: ");
		System.out.println(circle.toString());
		System.out.println("\nRECTANGLE: ");
		System.out.println(rectangle.toString());
		System.out.println("\nSQUARE: ");
		System.out.println(square.toString());
	}
}