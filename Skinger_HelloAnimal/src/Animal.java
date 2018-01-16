//Created by Derrick Skinger
//For IS 1017
// Much inspiration taken from https://www.geeksforgeeks.org/inheritance-in-java/

class Animal {
	private String age;
	private String color;
	private int weight;
	int minimumWeight = 0;

	public static void main(String args[]) 
	{
		Fish fish = new Fish("3", "brown", 2, 1);
		fish.eat();
		fish.swim(2);
		System.out.println(fish.toString());
	}

	public Animal(String age, String color, int weight, int minimumWeight) {
		this.age = age;
		this.color = color;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}

	//This 
	public void eat () 
	{
		weight++;
	}
	
    // toString() method to print info about the animal
	//This was taken from the website on main then rewritten
    public String toString() 
    {
        return("This Animal is " + age + " years old." + "\n" +
        		"It weights " + weight + " pounds." + "\n" + 
        		"It is a " + color + " ");
    } 
}
