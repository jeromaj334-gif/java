/**Class Work Problem:
You are working on a system that prints different types of messages based on the user's role. Each type of user (Admin and Guest) should display a different welcome message. You are asked to:

Create an abstract class User with:

An abstract method showMessage()

A concrete method displayUserType() that prints "User type selected"

Create two subclasses:

AdminUser: prints "Welcome, Admin!" in showMessage()

GuestUser: prints "Welcome, Guest!" in showMessage()

In a class called UserTest, create objects of AdminUser and GuestUser, call both displayUserType() and showMessage() methods for each.**/
abstract class User{
	abstract void showMessage();
	void displayUserType() {
		System.out.println("User type selected");
	}
}
class AdminUser extends User{
	public void showMessage() {
		System.out.println("welcome, Admin!");
	}
}
class GuestUser extends User{
	void showMessage() {
		System.out.println("Welcom, Guest!");
	}
}

public class day9classwork {


	public static void main(String[] args) {
		AdminUser ad=new AdminUser();
		ad.showMessage();
		ad.displayUserType();
		GuestUser gd=new GuestUser();
		
		gd.showMessage();
		gd.displayUserType();

	}

}


