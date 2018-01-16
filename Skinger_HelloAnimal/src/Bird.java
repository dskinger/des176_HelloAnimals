
class Bird extends Animal 
{
	private String type;
	// the MountainBike subclass has one constructor
	public Bird (String age, String color, int weight, int minimumWeight)
	{
		// invoking base-class(Bicycle) constructor
		super(age, color, weight, minimumWeight);
		type = "Bird";
	}

	//The Bird's action
	public void fly (int weight)
	{
		weight = weight - 2;
	}

	//Adds the type of animal to the println
	@Override
	public String toString()
	{
		return (super.toString()+ type + ".");
	}
}
