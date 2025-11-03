
/*
 You are building a basic log system for a book store. 
 You must create a file called log.txt to store a message.
  The message should say:
"Book order placed at [your preferred time]".

Once the message is written:

Read and display the message from the file.

Then delete the file.

Make sure each step shows success or failure messages on
 the console*/
import java.io.*;
public class day12homework {
	

	public static void main(String[] args) {
		File obj=new File("logses.txt");
		String data="Book order placed at 3pm";
		char array[]=new char[100];
		try {
			boolean value=obj.createNewFile();
			if(value)
			{
				System.out.println("the file is created:");
				FileWriter obj1=new FileWriter("logses.txt");
				obj1.write(data);
				System.out.println("the file writing is finished:");
				obj1.close();
			}
			else
			{
				System.out.println("the file is already exist:");
			}
			if(value)
			{
				FileReader obj2=new FileReader("logses.txt");
				obj2.read(array);
				System.out.println("the file is readed:");
				obj2.close();
			}
			if(value)
			{
				obj.delete();
				System.out.println("the file is deleted successfully::");
			}
			
		}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}

	}



