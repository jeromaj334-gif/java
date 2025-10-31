/* You are tasked with creating a simple employee details system for an HR team.
 *  Each employee has a name, ID number, department, and salary, which must be protected from direct access or modification.
 *   Complete the following tasks:

Tasks:

Create an Employee class that encapsulates the following fields:
    Name (String)
    ID number (integer)
    Department (String)
     Salary (double)
Ensure all fields are private to prevent direct access or modification.
Provide public getter and setter methods for each field (name, ID, department, salary) 
to allow controlled access and modification.
Create a test class named EmployeeTest with a main() method that:
Creates two Employee objects.
 Uses setter methods to assign values for name, ID, department, and salary for each employee.
 Displays the details of both employees using getter methods only, not by accessing fields directly.*/
class employee{
	private String name;
	private int id_no;
	private String department;
	private double salary;
	
	public String getname(){
		return name;
	}
	public int getId() {
		return id_no;
	}
	public String getdepart() {
		return department;
	}
	public double getsalar() {
		return salary;
		
	}
	public void setmy_Method(String name,int id_no,String department,double salary) 
	{
		this.name=name;
		this.id_no=id_no;
		this.department=department;
		this.salary=salary;
	
}
}
public class day10homework
 {

	public static void main(String[] args) {
	
		employee emp1=new employee();
		employee emp2=new employee();
		emp1.setmy_Method("aashif", 364, "artificial", 60.4);
		emp2.setmy_Method("alex", 032, "mechanical", 40.2);
		System.out.println("name1 " +emp1.getname());
		System.out.println("id number " +emp1.getId());
		System.out.println("department is " +emp1.getdepart());
		System.out.println("salary is " +emp1.getsalar());
		System.out.println("name2 is " +emp2.getname());
		System.out.println("department is " +emp2.getdepart());
		System.out.println("salary is " +emp2.getsalar());

	}

}

