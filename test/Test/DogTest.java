package Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import DogObject.Dog;

public class DogTest {

	@Test
	public void testDogCreation() {
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Rufus",49, 3));
		for (Dog d : dogs){
			
			assertNotNull(dogs);
			assertEquals(d.getName(), "Rufus");
			assertEquals(d.getWeight(), 49);
			assertEquals(d.getAge(), 3);
		}
	}
	@Test
	public void testSize() {
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Rufus",49, 3));
		for (Dog d : dogs){
				assertEquals(d.getSize(), "medium");
		}
	}
	@Test
	public void testDogYears() {
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Rufus",49, 3));
		for (Dog d : dogs){
			assertEquals(d.getAge(), 3);
			assertEquals(d.getSize(), "medium");
			assertEquals(d.getdogYears(), 21);
		}
	}
}
