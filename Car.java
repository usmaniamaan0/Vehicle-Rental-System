package vehicleRentalSystem;

public class Car extends Vehicle
{
	 private int seatingCapacity;

	 public Car(String vehicleId, String brand, String model, double rentPricePerDay, int seatingCapacity)
	 {
		super(vehicleId, brand, model, rentPricePerDay);
		
		this.seatingCapacity= seatingCapacity;
		
	 }

	 
	 @Override
	 
	 public void showDetails()
	 {
		 super.showDetails();
		 System.out.println("Seating Capacity " + seatingCapacity);
	 }
	 
	 @Override
	 
	 public double calculateRent(int days)
		{
			return getRentPricePerDay() * days;
		}
	 
	 

}
