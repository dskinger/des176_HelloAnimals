import java.util.ArrayList;

//Created by Derrick Skinger
//For IS 1017
// Much inspiration taken from https://www.geeksforgeeks.org/inheritance-in-java/

class Animal {
	private String age;
	private String color;
	private int weight;
	int minimumWeight;

	public static void main(String args[]) 
	{
		//Had some help from https://stackoverflow.com/questions/3982550/creating-an-arraylist-of-objects
		ArrayList<Animal> animals = new ArrayList<Animal>();

		//I created the animals then allowed them to eat and do there action
		Fish trout = new Fish("3", "brown", 4, 2);
		trout.eat();
		trout.swim(1);

		Mammal human = new Mammal("25", "White", 200, 125);
		human.eat();
		human.run(2);

		Bird robin = new Bird ("2", "Red", 2,1);
		robin.eat();
		robin.fly(1);

		Mammal rhino = new Mammal("50", "Black", 400, 350);
		rhino.eat();
		rhino.run(2);

		Bird blueJay = new Bird ("1", "Blue", 4,2);
		blueJay.eat();
		blueJay.fly(1);

		Fish bass = new Fish("7", "Green", 8, 4);
		trout.eat();
		bass.swim(2);

		//Added each animal to the array
		animals.add(trout);
		animals.add(human);
		animals.add(robin);
		animals.add(rhino);
		animals.add(blueJay);
		animals.add(bass);

		//Printed the array
		System.out.println(animals.toString());
	}

	//This is the constructor for the animal object
	public Animal(String age, String color, int weight, int minimumWeight) {
		this.age = age;
		this.color = color;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}

	//This allows the object to eat
	public void eat () 
	{
		weight++;
	}

	// toString() method to print info about the animal
	//This was taken from the website at the top then rewritten
	public String toString() 
	{
		return("\n \n" + "This Animal is " + age + " years old." + "\n" +
				"It weights " + weight + " pounds." + "\n" + 
				"It is a " + color + " ");
	} 
}
