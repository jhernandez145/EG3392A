//OK. Aktunc

/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 2
 */
public class TestVehicle {

	public static void main(String[] args) {
		Car honda = new Car(2006, 2100.56, "1RT245", "Honda", 5);
		Truck dodge = new Truck(2009, 2500.45, "2TU123", "Dodge", 1200.0);
		Tank tank = new Tank(2011, 7000.5, 4.56);

		System.out.println("Honda: " + honda.toString());
		System.out.println("Dodge: " + dodge.toString());
		System.out.println("Tank: " + tank.toString());
	}
}
