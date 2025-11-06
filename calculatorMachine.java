


import java.util.*;
class calc
{
	void  calculator(double a , double b)
	{
		System.out.println("performing calculations");
	}
}
	class add extends calc
	{
		void calculator(double a, double b)
		{
			double sum=a+b;
			System.out.println("sum is ="+sum);
		}
	}
	class sub extends calc
	{
		void calculator(double a, double b)
		{
			double differ=a-b;
			System.out.println("the differerence  is =" +differ );
			
		}
	}
	class multi extends calc
	{
		void calculator(double a, double b)
		{
		double produc=a*b;
		System.out.println("the multiplication is:"+produc);
		}
	}
	class divide extends calc
	{
		void calculator(double a,double b)
		{
			double divi=a/b;
			System.out.println("the division is:" +divi);
			
		}
	}
public class calculatorMachine {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("enter the first number:");
		double a=sc.nextInt();
		System.out.println("enter the second number:");
		double b=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the operators(+,-,*,/)");
		String op=sc.nextLine();
		
		calc calculate;
		
		
		
			switch(op)
			{
			case "+":
				calculate=new add();
				calculate.calculator(a, b);
				break;
			case "-":
				calculate=new sub();
				calculate.calculator(a, b);
				break;
			case "*":
				calculate=new multi();
				calculate.calculator(a, b);
				break;
			case "/":
				if(b==0)
				{
					System.out.println("error:");
				}
				else
				{
				calculate=new divide();
				calculate.calculator(a, b);
				}
				break;
			default:
				System.out.println("^");
				break;
			}
			System.out.println("do you want to quit?:(y/n)");
			String q=sc.nextLine();
			if(q.equalsIgnoreCase("y"))
			{
				System.out.println("quit");
				break;
			}
			
			
		}while(true);
		sc.close();
		
	}
	
}
	
