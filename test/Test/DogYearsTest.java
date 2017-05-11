package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import DogObject.Dog;

public class DogYearsTest {

	ArrayList<Dog> testerDog;
	int nameLength;
	int totalLongNames;
	int totalDogs;
	
	@Test
	public void testDogName() {
		testerDog = new ArrayList<>();
		testerDog.add(new Dog("Harry", 30, 4));
		StringBuilder dogName = new StringBuilder("Harry");
		nameLength = dogName.length();
		assertEquals(nameLength, 5);
		
		for (@SuppressWarnings("unused") Dog d : testerDog){	
			if (nameLength > 4)
				totalLongNames ++;
			totalDogs ++ ;
		}
			assertEquals(totalLongNames, 1);
			assertEquals(totalDogs, 1);
	}
	}
