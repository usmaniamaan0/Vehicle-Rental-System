package vehicleRentalSystem;

public class Bike extends Vehicle
{
	
	private int engineCC;

	public Bike(String vehicleId, String brand, String model, double rentPricePerDay, int engineCC)
	{
		super(vehicleId, brand, model, rentPricePerDay);
		
		this.engineCC = engineCC;
		
	}

	
	@Override
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Engine CC : " + engineCC);
	}
	
	@Override
	
	public double calculateRent(int days)
	{
		return getRentPricePerDay() * days;
	}


}
