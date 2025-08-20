package vehicleRentalSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalSystemController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		ArrayList<Customer> customers = new ArrayList<>();
		
		vehicles.add(new Car("C1", "Toyota", "Innova", 1200, 7));
		vehicles.add(new Bike("B1", "Honda", "Activa", 300, 110));
		vehicles.add(new Truck("T1", "Tata", "HeavyDuty", 2500, 10));
		
         while(true)
         {
        	 System.out.println("\n-------Vehicle Rental System-------");
        	 System.out.println("1.   Show available Vehicles");
        	 System.out.println("2.   Rent vehicles ");
        	 System.out.println("3.   Return Vehicles ");
        	 System.out.println("4.   Show Customers ");
        	 System.out.println("5.   Exit");
        	 
        	 System.out.println("Enter choice.....");
        	 int choice = sc.nextInt();
        	 
        	  sc.nextLine();
        	  
        	  switch(choice)
        	  {
        	  case 1:
        		  System.out.println("\n---- Available Vehicles ----");
        		  for(Vehicle v : vehicles)
        		  {
        			  if(v.isAvailable())
        			  {
        				  v.showDetails();    				  
        				  System.out.println("-----------------------------------");
        			  }
        		  }
        		  
        		  break;
        		  
        	  case 2:
        		  System.out.println("Enter Customer Name:");
        		  String cname = sc.nextLine();
        		  System.out.println("Enter Contact Number:");
        		  String contact = sc.nextLine();
        		  Customer customer = new Customer(cname, contact);
        		  
        		  System.out.println("Enter vehicle id to rent: ");
        		  String vid = sc.nextLine();
        		  boolean found = false;
        		  
        		  for (Vehicle v : vehicles)
        		  {
        			  if(v.getvehicleId().equalsIgnoreCase(vid) && v.isAvailable())
        			  {
        				  System.out.println("Enter the number of days: ");
        				  int days = sc.nextInt();
        				  double rent = v.calculateRent(days);
        				  System.out.println("Total Rent:" + rent);
        				  
        				  v.setAvailable(false);
        				  customer.setRentedVehicle(v);
        				  customers.add(customer);
        				  
        				  System.out.println(" Vehicle Rented Sucessfully");
        				  found = true;
        				  break;
        			  }
        		  }
        		  
        		  if(!found)
        			  System.out.println("Vehicle not found or not available....");
        		      break;
        		      
        	  case 3:
        		  System.out.println("Enter Customer Nmae: ");
        		  String cname2 = sc.nextLine();
        		  boolean returned = false;
        		  
        		  for(Customer c : customers)
        		  {
        			  if(c.getName().equalsIgnoreCase(cname2) && c.getRentedVehicle()!= null)
        			  {
        				  Vehicle v = c.getRentedVehicle();
        				  v.setAvailable(true);
        				  c.setRentedVehicle(null);
        				  
        				  System.out.println("Vehicle returned sucessfully....");
        				  returned = true;
        				  break;
        			  }
        		  }
        		  
        		  if(!returned)
        			  System.out.println("No vehicle found for this customer...");
        		      break;
        		      
        	  case 4:
        		  System.out.println("\n ---Customers---");
        		  for(Customer c: customers)
        		  {
        			  c.showDetails();
        			  System.out.println("------------------------------------");
        			 
        		  }
        		  
        		  break;
        		  
        	  case 5:
        		  System.out.println("Exiting.......");
        		  sc.close();
        		  return;
        		  
        		  default:
        			  System.out.println("Invalid choice!......");
        	  }
        	  
        }
	}

}
