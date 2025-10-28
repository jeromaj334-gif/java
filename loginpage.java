import java.util.Scanner;

public class loginpage {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the your username:");
		String username=sc.nextLine();
		System.out.println("enter your password:");
		String password=sc.nextLine();
		String difUsername="admin";//default usernames
		String difPassword="java123";// default passwords
		System.out.println(username+ " " +" "+ password);
		if(difUsername.equals(username) && difPassword.equals(password))
		{
			System.out.println("login successful!!");
		}
		else
		{
			System.out.println("access denied###");
		}
		sc.close();
	}
}
