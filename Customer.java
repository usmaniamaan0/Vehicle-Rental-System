package vehicleRentalSystem;

public class Customer {
	
	private String name;
	private String contactNo;
	private Vehicle rentedVehicle;
	
	public Customer(String name, String contactNo)
	{
		this.name = name;
		this.contactNo = contactNo;
		this.rentedVehicle = null;
	}

	public String getName() {
		return name;
	}


	public String getContactNo() {
		return contactNo;
	}

	public Vehicle getRentedVehicle() {
		return rentedVehicle;
	}

	public void setRentedVehicle(Vehicle rentedVehicle) {
		this.rentedVehicle = rentedVehicle;
	}
	
       
	public void showDetails()
	{
		System.out.println("Customer Name: " + name);
		System.out.println("Contact No: " + contactNo);
		 
		if(rentedVehicle != null)
		{
		   System.out.println("Rented Vehicle: " + rentedVehicle.getBrand() + " " + rentedVehicle.getModel());	
		}
		
		else
		{
			System.out.println("No vehicle rented");
		}
		
	}
}
