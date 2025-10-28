public class throwss {
    public static void checkAge(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("access denained");
        }
        else{
            System.out.println("access granted");
        }
    }
    
    public static void main(String[] args)
    {
        checkAge(12);
    }
    
}
