
class Fish extends Animal 
{
	private String type;
	// the MountainBike subclass has one constructor
	public Fish (String age, String color, int weight, int minimumWeight)
	{
		// invoking base-class(Bicycle) constructor
		super(age, color, weight, minimumWeight);
		type = "Fish";
	}

	//The Fish's action
	public void swim (int weight)
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
