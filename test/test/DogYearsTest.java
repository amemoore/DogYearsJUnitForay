package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import dog.Dog;

public class DogYearsTest {

	ArrayList<Dog> testerDog;
	int nameLength;
	int totalLongNames;
	int totalDogs;
	
	//Testing stringbuilder name length and counters in the for loop.
	@Test
	public void testDogName() {
		testerDog = new ArrayList<>();
		testerDog.add(new Dog("Harry", 30, 4));
		testerDog.add(new Dog("Delila", 33, 2));
		StringBuilder dogName = new StringBuilder("Harry");
		assertEquals(dogName.length(), 5);
		
		for (int i=0; i<testerDog.size(); i++){	
			if (nameLength > 4)
				totalLongNames ++;
			totalDogs ++ ;
		}
			assertEquals(totalLongNames, 2);
			assertEquals(totalDogs, 2);
	}
}
