
/*
 * Jesus Hernandez 614019
 * 9-22-16
 * Assignment 5 Question 3
 */
public class TestAnimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animalArray = new Animal[2];
		animalArray[0] = new Dog("Funny", "Rottwieler", 2);
		animalArray[1] = new Bird("Fred", "Cardinal", 1);
			for(Animal animalObject : animalArray){
				System.out.println(animalObject.getClass().getName() + ":"+
								   "\nName: " + animalObject.getName() +
								   "\nBreed: " + animalObject.getBreed() +
								   "\nYears old: " + animalObject.getAge() +
								   "\nMakes noise: " + animalObject.makeNoise() + 
								   "\nCan fly: " + animalObject.canFly() + "\n");
			}
	}
}
