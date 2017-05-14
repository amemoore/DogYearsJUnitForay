package presentation;

import java.util.ArrayList;

import dog.Dog;

public class DogYearsApp {
	public static ArrayList<Dog> dogs;
	private static int totalLongNames = 0;
	private static int totalDogs = 0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Dog Years Calculator!\n");
		makeDogArrayList();
		getDogStats();
	}
	
	//Adding dogs to ArrayList
	public static void makeDogArrayList(){
		dogs = new ArrayList<>();
		dogs.add(new Dog("Lily", 30, 4));
		dogs.add(new Dog("Spike", 62, 5));
		dogs.add(new Dog("Spot", 23, 1));
		dogs.add(new Dog("Blue", 51, 8));
		dogs.add(new Dog("Snoopy", 25, 14));
	}
	
	//Method to get name, age, size, weight, and age in dog years.  
	//Counts # of long names and total # of dogs.
	public static void getDogStats(){
		System.out.println("There are five dogs in the Dog Years Calculator.\nSee their stats below:\n");
		System.out.println("Name\tAge\tSize\tWeight(lbs)\tDog Years");
		System.out.println("==================================================");
		for (Dog d : dogs){
			System.out.println(d.getName() +"\t"+ d.getAge() +"\t"+ d.getSize() +"\t\t"+ 
								d.getWeight() +"\t\t"+ d.getdogYears() +"\n");
			StringBuilder dogName = new StringBuilder(d.getName());
			int nameLength = dogName.length();
			if (nameLength > 4)
				totalLongNames ++;
			totalDogs ++ ;
		}
		System.out.println(totalLongNames + " out of " + totalDogs + " dogs have a name greater than 4 letters.");
	}
}
