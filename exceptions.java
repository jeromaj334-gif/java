public class exceptions {
    public static void main(String[] args)
    {
        try
    {
        int data=120/0;
        System.out.println(data);
    }
    catch(ArithmeticException e)
    {
        System.out.println("number should not be developed:");
    }
    finally{
        System.out.println("the try block is ended:");
    }
    System.out.println("okey done:");
}
}
