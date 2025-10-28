public class outofstock {
    public static void main(String[] args) {
		int items[]= {20,15,30,0,25};
		boolean status=true;
		int total=0;
		for(int i=0;i<items.length;i++)
		{
			if(items[i]==0)
			{
				System.out.println("Out of stock");
				status=false;
				break;
			}
		}
	
			if(status)
			{
				for(int i=0;i<items.length;i++)
				{
					total=total+items[i];
				}
				System.out.println("total quantity" +total);
				if(total<50)
				{
					System.out.println("low stock");
				}
				else if(total>=50 && total<=100)
				{
					System.out.println("moderate stock");
				}
				else if(total>=100)
				{
					System.out.println("good stock");
				}
				else
				{
					System.out.println("poor stock cant sell:");
				}
			}
	}
}


    
