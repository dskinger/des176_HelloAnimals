
class Mammal extends Animal 
{
	private String type;

	public Mammal (String age, String color, int weight, int minimumWeight)
	{
		// invoking base-class constructor
		super(age, color, weight, minimumWeight);
		type = "Mammal";
	}

	//The Mammal's action
	public void run (int weight)
	{
		weight--;
	}

	//Adds the type of animal to the println
	@Override
	public String toString()
	{
		return (super.toString()+ type + ".");
	}
}
