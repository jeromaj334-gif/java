
/*
 You are helping a school store assignment details.
  Your task is to:

Create a file named assignment.txt.

Write the content "Java File Handling Practice" 
into the file.

Read the content from the file and display it 
in the console.

Finally, delete the file after reading it.

Do all steps using Java. Make sure each action gives 
appropriate success or error messages



 */
import java.io.*;
public class day12work 
{



	public static void main(String[] args)
	{
		char array[]=new char[100];
		File obj=new File("assignment1234.txt");
		
		String data="Java File Handling Practice";
		try
		{
			boolean value=obj.createNewFile();
			if(value)
			{
				System.out.println("the new file is created:");
				FileWriter obj1 =new FileWriter("assignment1234.txt");
				obj1.write(data);
				System.out.println("the file is writing is finished:");
				obj1.close();
			}
			else
			{
				System.out.println("the file is already exist:");
			}
			if(value)
			{
				FileReader obj2=new FileReader("assignment1234.txt");
				obj2.read(array);
				System.out.println("data in the file::");
				System.out.println(array);
				
				obj2.close();
				
			}
			if(value)
			{
				obj.delete();
				System.out.println("file deleted:");
			}
			try
			{
				if(value)
				{
					FileReader obj22= new FileReader("assignment1234.txt");
					obj22.read(array);
					obj22.close();
				}
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}

