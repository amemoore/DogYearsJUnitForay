package Presentation;

import java.util.ArrayList;

import DogObject.Dog;

public class DogYearsApp {
	private static ArrayList<Dog> dogs;
	private static int totalLongNames = 0;
	private static int totalDogs = 0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Dog Years Calculator!\n");
		dogs = new ArrayList<>();
		dogs.add(new Dog("Lily", 30, 4));
		dogs.add(new Dog("Spike", 62, 5));
		dogs.add(new Dog("Spot", 23, 1));
		dogs.add(new Dog("Blue", 51, 8));
		dogs.add(new Dog("Snoopy", 25, 14));
		System.out.println("There are five dogs in the Dog Years Calculator.\nSee their stats below:\n");
		System.out.println("Name\tAge\tSize\tWeight(lbs)\tDog Years\n");
			
		for (Dog d : dogs){
				System.out.println(d.getName() +"\t"+ d.getAge() +"\t"+ d.getSize() +"\t"+ 
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
