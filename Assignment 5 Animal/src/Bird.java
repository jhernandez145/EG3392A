/*
 * Jesus Hernandez 614019
 * 9-22-16
 * Assignment 5 Question 3
 */
public class Bird extends Animal {

	public Bird() {
		// TODO Auto-generated constructor stub
	}
	public Bird(String name, String breed, int age) {
		super(name, breed, age);
		// TODO Auto-generated constructor stub
	}

	//Overridden abstract methods
	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Pio Pio";
	}
	@Override
	public boolean canFly() {
		// TODO Auto-generated method stub
		return true;
	}

}
