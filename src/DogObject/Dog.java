package DogObject;

import java.util.ArrayList;


public class Dog {
	String name = "";
	int weight = 0;
	int age = 0;
	String size = "";
	int dogYears = 0;
	ArrayList<Dog> dogs;
	
	public Dog (String nm, int wt, int ag){
		name = nm;
		weight = wt;
		age = ag;
	}
	public Dog (){
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDogYears() {
		return dogYears;
	}
	public void setDogYears(int dogYears) {
		this.dogYears = dogYears;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize(){
			if (weight>0 && weight <26)
				size = "small";
			else if (weight>=26 && weight<51)
				size = "medium";
			else
				size = "big";
			return size;
	}
	public int getdogYears(){
		if (size.equalsIgnoreCase("small"))
			dogYears = getAge() * 6;
		else if (size.equalsIgnoreCase("medium"))
			dogYears = getAge() * 7;
		else
		dogYears = getAge() * 8;
		return dogYears;
	}
}
