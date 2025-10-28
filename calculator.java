import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
    {
       Scanner n1=new Scanner(System.in);
       char op;
       char quit;
       
   
       do
       {
       
        System.out.println("enter first numbner:");
       int a=n1.nextInt();
       System.out.println("enmter second number:");
       int b=n1.nextInt();
       System.out.println("enter the opertors(+,-,*,/,q=quitj):");
       op=n1.next().charAt(0);
       switch(op)
    
       {
            case '+':
            System.out.println((a+b));
            break;
            case '-':
            System.out.println((a-b));
            break;
            case '*':
            System.out.println((a*b));
            break;

            default:
            System.out.println((a/b));
            
       }
       System.out.println("do you want to quit? (y/n):");
       quit=n1.next().charAt(0);
    }while(quit!='y');
       n1.close();
}
}

    

    
