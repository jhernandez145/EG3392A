/*
 * Jesus Hernandez 614019
 * 9-22-16
 * Assignment 5 Question 3
 */
public abstract class Animal {
	private String name;
	private String breed;
	private int age;
	
	//Constructors
	public Animal() {
		super();
	}
	public Animal(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Abstract methods
	public abstract String makeNoise();
	public abstract boolean canFly();
}
