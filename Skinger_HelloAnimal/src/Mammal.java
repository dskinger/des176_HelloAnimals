
class Mammal extends Animal 
{
	private String type;
	// the MountainBike subclass has one constructor
    public Mammal (String age, String color, int weight, int minimumWeight)
    {
        // invoking base-class(Bicycle) constructor
        super(age, color, weight, minimumWeight);
        type = "Mammal";
    }
    
    public void run (int weight)
    {
    	weight--;
    }
    
    @Override
    public String toString()
    {
    	return (super.toString()+ type + ".");
    }
}
