import java.util.*;
public class scoresheet {

    

 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the number of scores you want to enter:");
		int n=sc.nextInt();
		int score[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the scores of the students:");
			score[i]=sc.nextInt();

		
		}
		for(int i=0;i<n;i++)
		{
			if(score[i]>=90)
			{
				System.out.println(score[i]+ " Excellent ");
			}
			else if(score[i]>=75 && score[i]<=89)
			{
				System.out.println( score[i]+ " good");
			}
			else if(score[i]>=50 && score[i]<=74)
			{
				System.out.println(score[i]+ " average");
			}
			else
			{
				System.out.println(score[i]+ " failed");
			}
		}sc.close();
	}
}
	

