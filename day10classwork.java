/*You are designing a basic student profile system where each student has a name, roll number, and percentage score.
 *  The data should be protected and only accessible through proper methods. You need to:

Create a class Student with:

Three private variables: name, rollNo, and percentage

Public getter and setter methods for each variable

Use the this keyword in setter methods to refer to the current object

In a class called StudentTest, create a Student object, set values using setters, and display them using getters.*/
class Student{
	private String name;
	private int roll_no;
	private  String percent;
	
	public String getName()
	{
		return name;
	}
	public  void setName(String na)
	{
		this.name=na;
	}
	public int getRoll() {
		return roll_no;
	}
	public  void setRoll(int roll)
	{
		this.roll_no=roll;
	}
	public String getPercent()
	{
		return percent;
	}
	public void setPercent(String perc)
	{
		this.percent=perc;
	}
}
public class day10classwork

 {

	public static void main(String[] args) {
		Student sc=new Student();
		sc.setName("alex");
		System.out.println("name is: " +sc.getName());
		sc.setRoll(334);
		System.out.println("roll no is: " +sc.getRoll());
		sc.setPercent("97%");
		System.out.println("mark in % : " +sc.getPercent());
		
	}
		

}


 
