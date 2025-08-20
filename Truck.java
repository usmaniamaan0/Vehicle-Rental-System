package vehicleRentalSystem;

public class Truck extends Vehicle
{
	
	private double loadCapacity;

	public Truck(String id, String brand, String model, double rentPricePerDay, double loadCapacity) 
	{
		super(id, brand, model, rentPricePerDay);
		
		this.loadCapacity = loadCapacity;
		
	}

	@Override
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Loading capacity (Tons) :" + loadCapacity);
	}
	
	@Override
	
	public double calculateRent(int days)
	{
		return (getRentPricePerDay() * days) +  500;
	}
	
	

}
