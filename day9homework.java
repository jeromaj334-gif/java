
/*You are tasked with developing a  ridesharing app  model how different vehicles calculate ride charges. 
 * All vehicles must display their ride type and calculate the fare based on a user-provided distance.
 *  Some vehicles, like autos, charge less, while cars charge more. Complete the following tasks:

Tasks:

Create an abstract class named Ride with:
An abstract method calculateFare(int distance) that returns an integer (fare in ?).
A concrete method rideType() that prints "Generic Ride".
Create a subclass named AutoRide that extends Ride:
Overrides calculateFare(int distance) to return ?10 per km.
Overrides rideType() to print "Auto Ride".
Create a subclass named CarRide that extends Ride:
Overrides calculateFare(int distance) to return ?20 per km.
Overrides rideType() to print "Car Ride".
Create a class named BookingApp with a main() method that:
Prompts the user to input the ride type ("auto" or "car").
Prompts the user to input the distance in kilometers (a positive integer).
Creates an object of AutoRide or CarRide based on the user’s ride type input.
Calls rideType() and calculateFare() to display the ride type and total fare for the given distance.*/ 
import java.util.*;
abstract class Ride{
	abstract int calculateFare(int distance);
	void rideType() {
		System.out.println("Generic Ride:");
		
	}
}
class AutoRide extends Ride{
	public int calculateFare(int distance) {
		return 10*distance;
	}
	public void rideType() {
		System.out.println("Auto Ride");
	
	}
}
class CarRide extends Ride{
	public int calculateFare(int distance) {
		return 20*distance;
	}
	public void rideType() {
		System.out.println("Car ride:");
	}
}

public class day9homework{
	public static void main(String[] args) {
		Ride auto=new AutoRide();
		Ride car=new CarRide();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you ride type:");
		String ride=sc.nextLine().toLowerCase();
		System.out.println("enter your distance km:");
		int dist=sc.nextInt();
		if(ride.equals("auto"))
		{
			auto.rideType();
			int fare=auto.calculateFare(dist );
			System.out.println("your travelling fare is::" + fare +"$");
			
		}
		else
		{
			car.rideType();
			int fare=car.calculateFare(dist);
			System.out.println("your car travelling fare is::" +fare +"$");
		}
		sc.close();
		
		

	}

}
