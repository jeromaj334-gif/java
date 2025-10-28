import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class billing {
	public double discount(double totalcost)
	{
			double disc=(totalcost*10)/100;
			return totalcost-disc;
		
		

	}

	public static void main(String[] args) {
		double disc;
		Scanner sc=new Scanner(System.in);
		String items[]= {"rice","sugar", "Oil", "Soap", "Milk"};
		int price[]= {50,40,100,25,30};
		int quantity;
		int totalcost=0;
		System.out.println("the items are " + Arrays.toString(items));
		try 
		{
			for(int i=0;i<items.length;i++)
			{
			
				System.out.println("enter the quantity requierd for " + items[i] + " :" );
				quantity=sc.nextInt();
				totalcost+=quantity*price[i];
			}
			System.out.println("total price=" +totalcost);
		}
		catch(Exception e)
		{
			System.out.println("you entered wrong quantity:");
		}
		
		

		billing obj=new billing();
                                                                                                              
		LocalDateTime currDate=LocalDateTime.now();
		DateTimeFormatter formatedTime=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatted=currDate.format(formatedTime);
		if(totalcost>500)
		{
			double finalcost=obj.discount(totalcost);
			double savedamount=totalcost-finalcost;
			System.out.println("the total cost after 10% of discount is  " +finalcost + " you saved " + savedamount );
			System.out.println(	formatted);
			
		}
		else
		{
			int diff=500-totalcost;
			System.out.println(formatted);
			System.out.println(" you dont have any discount, add " +diff +" worth product to get 10% discount ");
			
		}
		
		
		sc.close();
	
		
		
		

	}

}

