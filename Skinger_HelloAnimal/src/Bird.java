
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
    
    public void fly (int weight)
    {
    	weight = weight - 2;
    }
    
    @Override
    public String toString()
    {
    	return (super.toString()+ type + ".");
    }
}
