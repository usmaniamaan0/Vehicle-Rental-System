package vehicleRentalSystem;

public abstract class Vehicle {
	
	private String vehicleId;
	private String brand;
	private String model;
	private double rentPricePerDay;
	private boolean available;
	
	public Vehicle(String vehicleId,String brand, String model, double rentPricePerDay)
	{
		this.vehicleId = vehicleId;
		this.brand= brand;
		this. model = model;
		this.rentPricePerDay = rentPricePerDay;
		this.available = true;
	}
	
	
	
	
	public String getvehicleId() {
		return vehicleId;
	}




	public void setvehicleId(String id) {
		this.vehicleId = id;
	}




	public boolean isAvailable() {
		return available;
	}

	
	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}
	



	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public double getRentPricePerDay() {
		return rentPricePerDay;
	}

	public void setAvailable(boolean available)
	{
		this.available = available;
	}



	public void setRentPricePerDay(double rentPricePerDay) {
		this.rentPricePerDay = rentPricePerDay;
	}

	public void showDetails()
	{
		System.out.println("id :" + vehicleId );
		System.out.println("brand : " + brand);    
		System.out.println("model :" + model );
		System.out.println("rent price per day :" + rentPricePerDay);  
		System.out.println("Available :" + (available ? "Yes" : "No"));
		
	}
	
	
	public abstract double calculateRent(int days);

}
